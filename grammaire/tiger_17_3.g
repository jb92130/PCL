grammar tiger_17_3;


prog 	:	 expr*;

expr 	:	'let' decList* 'in' expSeq?  'end'
	|	'if' condition 'then' expr ('else' expr)*
	|	'for' ID ':=' INT 'to' opID 'do' expr
	|	ID '(' expList? ')'
	|	'(' expSeq? ')'
	|	STRING
	|	INT
	;

exprVar	:	INT
	|	typeId '[' opID '] of' INT
	;
	
condition
	:	(ID|listElement) '='(INT|ID)
	;

decList	:	decFunc
	|	decType
	|	decVar;

decFunc	:	'function' ID '(' fieldList ')' '=' expr; // A compléter
decVar	:	'var' ID (':'  typeId)? ':='  exprVar;
decType	:	'type' typeId '=' type;

type	:	fieldList*
	|	'array of' typeId
	|	typeId;

expSeq 	:	expr (';' expr)*;

expList	:	expr (',' expr)*;
	
	
fieldList
	:	(ID ':' typeId (',' ID ':' typeId)* )?;

listElement
	:	ID '['(INT|ID)']'
	;
	
typeId	:	ID
	|	INT
	|	STRING;
	
opID	:	ID (('+'|'-')(ID | INT))*
	;

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
