grammar tiger;


options {
    backtrack=true;
    output=AST;
    memoize=true;
    k=2;
}

Prog			:	Exp ;

Exp			:	ExpOR ExpORPr;

ExpOR			:	ExpAND ExpANDPr;

ExpAND			:	ArithExp RelExp;

ExpORPr			:	Exp
			|	; // Epsilon
	
ExpANDPr		:	'&' ExpOR
			|	; // Epsilon
			
				
ArithExp		:	 Term   TermPr;

RelExp			:	 RelOp  ArithExp
			|	;
			
Term			:	 Factor  FactorPr;

TermPr			:	('+'|'-')  Term   TermPr
			|	; // Epsilon
			
FactorPr		:	('*'| '/')  Factor   FactorPr
			|	;
	
Factor			:	
			|	INT
			|	STRING
			|	'(' ExpList ')' // ')' en plus
			|	 UnaryOp Exp
			|	('if') => ('if' Exp 'then'  Exp ( 'else'  Exp )?)
			|	('while') =>  ('while' Exp 'do'  Exp)
			|	('for') => ('for' ID ':='  Exp 'to'  Exp 'do'  Exp)
			|	('break') => ('break')
			|	('let') =>  ('let' DecList 'in'  ExpList 'end')
			|	 LValue;
			
DecList 		:	( Dec )*;

Dec 			:	 TyDec
			|	 VarDec
			|	 FunDec;
			
			
TyDec	 		:	'type'  TypeId =  Ty
;

Ty 			:	( FieldList)*
			|	('arrayof') => ('arrayof' TypeId)
			|	 TypeId
;

	
VarDec			:	'var' ID ( ':'  TypeId )? ':='  Exp
;

FunDec			:	'function' ID '(' FieldList ')' (':'  TypeId)? '='  Exp
;
			
LValue			:	ID ( FunctionRecordArray |  FunctionRecordArrayPr );

FunctionRecordArray	:	'(' ArgList ')'
			|	'{' FieldList '}'
			|	( Exp )? '(' 'of'  Exp ')' 
			; // | Av
	
FunctionRecordArrayPr	:	( '(' '.' ID | ( Exp )? ')' )* ( ':='  Exp )?
			;
			
				
FieldList 		:	(( ID ':'  TypeId ( ',' ID ':'  TypeId )*) )?
;

FieldExpList 		:	( ID '='  TypeId ( ',' ID '='  TypeId )* )?
;


ExpList			:	( Exp ( ';'  Exp )* )?
;

ArgList			:	( Exp ( ','  Exp )* )?
;

TypeId	:	ID
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
