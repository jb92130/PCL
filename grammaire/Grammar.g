grammar Grammar;

options {
	k = 1;
	language = Java;
	output = AST;
}


tokens{
	PROG;
	IF;
	COND;
	THEN;
	ELSE;
	FOR;
	BORNE_INF;
	BORNE_SUP;
	WHILE;
	DECL_FCT;
	FIELD;
	FIELDS;
	DECL_VAR;
	DECL_TYPE;
	DEF_ARRAY;
	LET;
	DECLARATIONS;
	PARAMS;
	SEQUENCE;
	BODY;
	OF;
	INDICE;
	FCT_ARG;
	STRUCT_DEC;
}

prog //AST OK
	:	expr EOF -> ^(PROG expr)		// AST OK
	;

expr // AST OK
	:	'break'		-> 'break'	// AST OK
	|	STRING		-> STRING	// AST OK
	|	loop		-> loop   	// AST OK
	| 	condition	-> condition	// AST OK
	|	let		-> let 	// AST OK
	|	operation	-> operation// AST OK
	;
	
operation // AST OK
	:	orOperation ( options {greedy=true;} : ':='^  expr )?
	;
	
field_list
	:	id = ID '=' ex = expr (',' field = field_list)?  -> ^('=' $id $ex) $field?  //OK POUR MOI 
	;
	
orOperation // AST OK	// | : OR
	:	andOperation (options {greedy=true;} : ('|'^) andOperation)*
	;

andOperation // AST OK	// & : AND
	:	booleanOperation (options {greedy=true;} : ('&'^) booleanOperation)*
	;
	
booleanOperation // AST OK	// =, <>, >, <, >=, and <=
	:	arithmeticOperation (options {greedy=true;} : ('='^ | '<>'^ | '>'^ | '<'^ | '>='^ | '<='^) arithmeticOperation)*
	;
	
arithmeticOperation // AST OK
	:	multExpr (options {greedy=true;} : ('+'^ | '-'^ ) multExpr)*
	;
	

	
multExpr // AST OK
	:	minus ( options {greedy=true;} : ('*'^ |'/'^ ) minus )*// modulo '%' si besoin
	;
	
	
minus // AST OK
	:	('-'^)? atom
	;
	
atom
	:	INT 			-> INT		// AST OK
	|	'nil' 			-> 'nil'		// AST OK
	|	ID after_id? 		-> ^(ID after_id?)
	|	'(' expr_seq? ')' 	->   expr_seq?	// AST OK
	;
	
after_id
	:	lvalue	//(':='  expr)		//-> lvalue
	| 	'(' expr_list? ')'		-> ^(PARAMS expr_list?)
	|	'{' (field_list?) '}'		-> ^(STRUCT_DEC field_list)
	;

lvalue
 	:	'.' ID lvalue?			-> ^('.' ID lvalue?)
 	|	'['expr']'crochet?		-> ^(INDICE expr) crochet?
 	//|	(/*empty*/ 			-> ^(EMPTY))
 	;
 	
 crochet
	:	'of' expr		-> ^(OF expr)
	|	lvalue	//':=' expr		//-> lvalue
	;

/*atom
	:	INT -> INT		// AST OK
	|	'nil' -> 'nil'		// AST OK
	|	ID ('['expr']' crochet | lvalue | '(' expr_list? ')') // '.'ID lvalue
			//-> ^(CALL_FCT ID expr_list?) | ^(TAB ID ^(INDICE expr) crochet) //| ID lvalue
	|	'(' expr_seq? ')' -> expr_seq // AST OK
	;*/

/*crochet
	:	'of' expr
	|	lvalue
	;*/

 let // AST OK
 	:	'let' declaration_list 'in' expr_seq? 'end' 
 			-> ^(LET declaration_list expr_seq?)
 	;
 	
 declaration_list // AST OK
 	:	declaration+ 		-> ^(DECLARATIONS declaration+)
 	;
 	
 	
declaration // AST OK
	:	type_declaration		-> type_declaration // AST OK
	|	variable_declaration		-> variable_declaration // AST OK
	|	function_declaration		-> function_declaration // AST OK
	;
	
type_declaration // AST OK
	:	'type' ID /*type id*/ '=' type_def
			-> ^(DECL_TYPE ID type_def)
	;
	

type_def // AST OK
	:	ID/*type id*/  			-> ID
	|	'{' type_fields? '}' 		-> type_fields?
	|	'array'  'of' ID/*type id*/ 		-> ^(DEF_ARRAY ID) // ARRAY_DEF est-il nécessaire
	;
	
type_field // AST OK
	:	id=ID ':' type_id=ID/*type id*/
			-> ^(FIELD $id $type_id)
	;
	
variable_declaration // AST OK
	:	'var' name=ID (':' type_id=ID/*type id*/)? ':=' expr
			-> ^(DECL_VAR $name $type_id? expr)
	;
	
	
function_declaration // AST OK
	:	'function' name=ID  '(' type_fields? ')' (':' type_return=ID/*type id*/)? '=' expr 
			-> ^(DECL_FCT $name type_fields? $type_return? expr)
	;
	

type_fields // AST OK
	:	type_field (',' type_field)* 	-> ^(FIELDS type_field+)
	;


	
loop // AST OK
 	:	'while' cond=expr  'do' e=expr 
 			-> ^(WHILE ^(COND $cond) ^(BODY $e))
 	|	'for' ID ':=' inf=expr 'to' sup=expr 'do' e=expr
 			-> ^(FOR ID ^(BORNE_INF $inf) ^(BORNE_SUP $sup) ^(BODY $e))
 	;
 	
condition // AST OK
 	:	'if' cond=expr 'then' e1=expr ( options {greedy=true;} : 'else' e2=expr)? 
 			-> ^(IF ^(COND $cond) ^(THEN $e1) ^(ELSE $e2)?)
 	;
 	

 	
expr_list // AST OK
 	:	expr (',' expr)* 		-> expr+
 	;


 	 
expr_seq // AST OK
	:	expr (';' expr)* 		-> ^(SEQUENCE expr+)
	;
 	


ID  	
	:	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
   	;

INT 
	:	'0'..'9'+
	;


COMMENT
    	:  	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    	|   	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    	;

WS  
	:   	( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;}
    	;

STRING	
	:	'"' ~('\r' | '\n' | '"')* '"'
	;