grammar SuffixCalculator ;
program:
    stat* EOF
    ;
stat:
    expr? NEWLINE
    ;
expr:
    expr expr op=('*'|'/'|'+'|'-')  #ExprSuffix
    | Number                        #ExprNumber
    ;
Number: [0-9]+('.'[0-9]+)? ;
NEWLINE: '\r'? '\n' ;
WS: [ \t]+ -> skip ;
//op=('*'|'/'|'+'|'-') expr expr  #ExprPref
//expr op=('*'|'/'|'+'|'-') expr  #ExprFixa, não funciona com '*'