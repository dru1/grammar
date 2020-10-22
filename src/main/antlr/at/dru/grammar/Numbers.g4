grammar Numbers;

@header {
package at.dru.grammar;
}

// Non-Terminal

decimal	       : SIGN? DIGITS (DOT DIGITS)? ;
integer        : SIGN? DIGITS ;

// Terminal

SIGN	       : [-+] ;
DIGITS         : [0-9]+;
DOT	           : '.'  ;