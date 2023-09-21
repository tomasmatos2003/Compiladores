grammar Vector;

program: stat* EOF;

stat: 
    show
    | assign
    ;


show:
    'show' exp ';'           #ShowExp
    ;

assign:
    exp '->' ID ';'         #AssignExp
    ;

exp:
    '(' exp ')'              #ParentExp
    | op=('+'|'-') exp       #SignalExp
    | exp op=('*'|'.') exp            #ProdExp
    | exp op=('+'|'-') exp    #SumSubEx
    | NUMBER                        #NumberExp
    | ID                            #IdExp
    | DOUBLE                        #DoubleExp
    | vector                    #vectorExp         
    ;
vector: '+'? '-'? '[' vals ']';
vals: NUMBER (',' vals)?;


ID: [a-z][a-z_0-9]*;
NUMBER: [0-9]+ ;
DOUBLE: [0-9]+ '.' [0-9]+;
WS: [ \t\n] -> skip ;
COMMENT: '#' .*? '\n' -> skip;





