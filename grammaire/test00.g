grammar test00;


prog:   stat+ ;
                
stat:   expr NEWLINE
    |   ID '=' expr NEWLINE
    |   NEWLINE
    ;


expr    :   multExpr 
        (('+' |'-') multExpr *)
    	;

multExpr :   atom  (('*'|'/') atom)*
    ; 

atom 
    :   INT 
    | '-' INT
    |   ID
    |   '(' expr ')' 
    ;


ID  :   ('a'..'z'|'A'..'Z')+ ;
INT :   '0'..'9'+ ;
NEWLINE: '\n' ;
WS  :   (' '|'\t')+  ;
