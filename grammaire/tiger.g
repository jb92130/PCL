grammar tiger;


options {
    backtrack=true;
    output=AST;
    memoize=true;
    k=2;
}

prog			:	exp ;

exp			:	expOR expORPr;

expOR			:	expAND expANDPr;

expAND			:	arithExp relExp;

expORPr			:	expAND expANDPr
			|	; // Epsilon
	
expANDPr		:	'&' expOR
			|	; // Epsilon
			
				
arithExp		:	term termPr;

relExp			:	RelOp  arithExp
			|	;
			
term			:	 factor  factorPr;

termPr			:	('+'|'-')  term   termPr
			|	; // Epsilon
			
factorPr		:	('*'| '/')  factor   factorPr
			|	;
	
factor			:	
			|	INT
			|	STRING
			|	'(' expList ')' // ')' en plus
			|	 UnaryOp exp
			|	'if' exp 'then'  exp ( 'else'  exp )?
			|	'while' exp 'do'  exp
			|	'for' ID ':='  exp 'to'  exp 'do'  exp
			|	'break'
			|	'let' decList 'in'  expList 'end'
			|	 lValue
			|	decList;
			
decList 		:	( dec )*;

dec 			:	 tyDec
			|	 varDec
			|	 funDec;
			
			
tyDec	 		:	'type'  typeId '='  ty
;

ty 			:	( fieldList)*
			|	'arrayof' typeId
			|	 typeId
;

	
varDec			:	'var' ID (':'  typeId)? ':='  exp
;

funDec			:	'function' ID '(' fieldList ')' (':'  typeId)? '='  exp
;
			
lValue			:	ID ( functionRecordArray |  functionRecordArrayPr );

functionRecordArray	:	'(' argList ')'
			|	'{' fieldList '}'
			|	( exp )? '(' 'of'  exp ')' 
			; // | Av
	
functionRecordArrayPr	:	( '(' '.' ID | ( exp )? ')' )* ( ':='  exp )?
			;
			
				
fieldList 		:	(( ID ':'  typeId ( ',' ID ':'  typeId )*) )?
;

fieldExpList 		:	( ID '='  typeId ( ',' ID '='  typeId )* )?
;


expList			:	( exp ( ';'  exp )* )?
;

argList			:	( exp ( ','  exp )* )?
;

typeId	:	ID
	|	INT
	|	STRING;

RelOp :	'='
	|	'>'
	|	'<'
	|	''
	|	'<='
	|	'>=';

UnaryOp	:	'-';

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
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
    :  ( ESC_SEQ | ~('\\'|'\'') )* '\''
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

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
