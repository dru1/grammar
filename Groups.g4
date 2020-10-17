/**
 * Grammatik für Gruppen von Zahlen
 */
grammar Groups;

import Numbers;

// Non-Terminal

decimalGroup      : GROUP_START SPACES? decimalGroupTerm boostTerm? (SPACES decimalGroupTerm boostTerm?)* SPACES? GROUP_END ;
decimalGroupTerm  : decimalRange | decimal ;
decimalRange      : RANGE_START SPACES? decimalRangeTerm SPACES RANGE_TO SPACES decimalRangeTerm SPACES? RANGE_END ;
decimalRangeTerm  : WILDCARD | decimal ;

integerGroup      : GROUP_START SPACES? integerGroupTerm boostTerm? (SPACES integerGroupTerm boostTerm?)* SPACES? GROUP_END ;
integerGroupTerm  : integerRange | integer ;
integerRange      : RANGE_START SPACES? integerRangeTerm SPACES RANGE_TO SPACES integerRangeTerm SPACES? RANGE_END ;
integerRangeTerm  : WILDCARD | integer ;

boostTerm         : BOOST decimal ;

// Terminal

BOOST              : '^' ;
GROUP_START        : '(' ;
GROUP_END          : ')' ;
RANGE_START        : '[' ;
RANGE_END          : ']' ;
RANGE_TO           : 'TO' ;
WILDCARD           : '*' ;
SPACES             : ' '+ ;
