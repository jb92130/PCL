grammar tiger;


prog 	:	 expr*;

expr 	:	'let' decList* 'in' expSeq?  'end'
	|	'if' ID 'then' expr ('else' expr)?
	|	ID '(' expList? ')'
	|	'(' expSeq? ')'
	|	STRING
	|	INT;
	

decList	:	decFunc
	|	decType
	|	decVar;

decFunc	:	'function' ID '(' fieldList ')' '=' expr; // A compléter
decVar	:	'var' ID (':'  typeId)? ':='  expr;
decType	:	'type' typeId '=' type;

type	:	fieldList*
	|	'array of' typeId
	|	typeId;

expSeq 	:	expr (';' expr)*;

expList	:	expr (',' expr)*;
	
fieldList
	:	(ID ':' typeId (',' ID ':' typeId)* )?;	
	
typeId	:	ID
	|	INT
	|	STRING;

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
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
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
