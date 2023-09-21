grammar printGram ;

program:
    stat* EOF
    ;

stat:
    'print' expr ';'                  #PrintExpr
    | expr '->' ID ';'                  #Assign
    ;

expr: 
    op = ('-'|'+') expr             #ExprNegatePosi
    | 'reduce' expr                 #ExprReduce
    | 'read' String                 #ExprRead
    | expr '^' expr                 #ExprPower
    | expr op=(':'|'*'|'^') expr    #ExprMultDiv
    | expr op=('+'|'-') expr        #ExprAddSub
    | Integer                       #ExprInteger
    | fraction                      #ExprFraction
    | '(' expr ')'                  #ExprParent
    | ID                            #ExprID
    ;

COMM: '//' .*? '\n' -> skip ;
fraction : Integer '/' Integer;
Integer: [0-9]+ ;
String: '"' .*? '"' ;
ID: [a-zA-Z_]+;
WS: [ \t\n\r]+ -> skip ; 
