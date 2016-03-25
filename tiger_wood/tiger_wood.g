grammar tiger_wood;

options {
    language=Java;
    output=AST;
    backtrack=true;
    k=2;
}

prog 	:	 expr*;

expr 	:	'let' decList* 'in' expSeq?  'end'
	|	'if' expr 'then' expr ('else' expr)?
	|	'for' ID ':=' expr 'to' expr 'do' expr
	|	'break'
	|	'(' expSeq? ')'
	
	//|	'-' expr
	//|	opMan
	
	|	typeId '[' expr ']' 'of' expr
	|	typeId fieldList?
	
	|	lvalue ':=' expr
	
	|	ID '(' expList? ')'
	|	STRING
	|	INT
	;

opMan:	addExpr (('='|'<>'|'<'|'>'|'=<'|'=>') addExpr)*
;

addExpr	:   multExpr  (('+' |'-') multExpr )*
;

multExpr :   atom  (('*'|'/') atom)*
; 
    

atom     :   int 
    	|   ID
   	|   '(' expr ')' 
   	;

int	:	INT
	|	'-' INT
	;




//rep	:  	fieldList?
//	|	'[' expr ']' 'of' expr;


lvalue	:	ID ('.' ID)* ('[' expr ']')*;
	
decList	:	decFunc
	|	decType
	|	decVar;

decFunc	:	'function' ID '(' fieldList ')' '=' expr; // A compléter
decVar	:	'var' ID (':'  typeId)? ':='  expr;
decType	:	'type' typeId '=' type;

type	:	typeFields
	|	'array of' typeId
	|	typeId;

expSeq 	:	expr (';' expr)*;

expList	:	expr (',' expr)*;
	
fieldList
	:	(ID ':' typeId (',' ID ':' typeId)* )?;	
	
typeFields
	:	typeField (',' typeField)*;
	
typeField
	:	ID ':' typeId;
	
typeId	:	ID
	|	INT
	|	STRING
	;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
