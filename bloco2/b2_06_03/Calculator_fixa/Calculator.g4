grammar Calculator ;
program:
    stat* EOF
    ;

stat:
    expr? NEWLINE
    ;

assignment: ID '=' expr;

expr:
    ID                              #ExprId
    | assignment                    #ExprAss
    | '-' expr                      #ExprNegate
    | '+' expr                      #ExprPositive
    | expr op=('/'|'x'|'%') expr    #ExprMultDivMod
    | expr op=('+'|'-') expr        #ExprAddSub
    | Integer                       #ExprInteger
    | '(' expr ')'                  #ExprParent
    ;

ID: [a-zA-Z_]+;
Integer: [0-9]+ ;
NEWLINE: '\r'? '\n' ;
WS: [ \t]+ -> skip ;
COMMENT: '#' .*? '\n' -> skip ;
