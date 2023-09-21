grammar Hello ; // D e f i n e a grammar c a l l e d H e l l o
greetings : 'hello' ID ; // match keyword h e l l o f o l l o w e d by an i d e n t i f i e r
// add a visitor that writes Olá <ID> to the console with a greeting

ID : [a-z]+ ; // match l ow e r −c a s e i d e n t i f i e r s

WS : [ \t\r\n]+ -> skip ; // s k i p s pac e s , t a b s , n e w l i n e s , \ r ( Windows )
