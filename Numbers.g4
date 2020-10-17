/**
 * Grammatik für Zahlen
 */
grammar Numbers;

// Non-Terminal

decimal	       : SIGN? DIGITS decimalSuffix? ;
decimalSuffix  : DOT DIGITS ;
integer        : SIGN? DIGITS ;

// Terminal

SIGN	       : '-'|'+' ;
DIGITS         : [0-9]+;
DOT	           : '.'  ;