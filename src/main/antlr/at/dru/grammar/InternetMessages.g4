grammar InternetMessages;

// Identification

messageId      : 'Message-ID:' msgId CRLF
               ;
inReplyTo      : 'In-Reply-To:' msgId+ CRLF
               ;
references     : 'References:' msgId+ CRLF
               ;
msgId          : cfws? '<' idLeft '@' idRight '>' cfws?
               ;
idLeft         : dotAtomText
               | noFoldQuote
               ;
idRight        : dotAtomText
               | noFoldLiteral
               ;
noFoldQuote    : DQUOTE (QTEXT | quotedPair)* DQUOTE
               ;
noFoldLiteral  : '[' (DTEXT | quotedPair) ']'
               ;

// 3.2.3. Folding white space and comments

fws            : WSP* CRLF
               | WSP+
               ;
CTEXT          : NOWSCTL
               | '\u0021'..'\u0039'
               | '\u002A'..'\u005B'
               | '\u005D'..'\u007E'
               ;
ccontent       : CTEXT
               | quotedPair
               | comment
               ;
comment        : '(' (fws? ccontent)* fws? ')'
               ;
cfws           : (fws? comment)* ((fws? comment) | fws)
               ;
// 3.2.4 Atom

ATEXT         : 'A'..'Z'
               | 'a'..'z'
               | '0'..'9'
               | '!' 
               | '#' 
               | '$'
               | '%'
               | '&'
               | '\''
               | '*'
               | '+'
               | '-'
               | '|'
               | '='
               | '?'
               | '^'
               | '_'
               | '`'
               | '{'
               | '}'
               | '~'
               ;
atom           : cfws? ATEXT+ cfws?
               ;
dotAtom        : cfws? dotAtomText cfws?
               ;
dotAtomText    : ATEXT+ ('.' ATEXT+)*
               ;

// 3.2.5. Quoted strings

QTEXT          : NOWSCTL      //  Non white space controls
               | '\u0021'     // The rest of the US-ASCII
               | '\u0023'..'\u005B'      // characters not including "\"
               | '\u005D'..'\u007E'     //  or the quote character
               ;

qcontent       : QTEXT | quotedPair
               ;

quotedString   : cfws? DQUOTE (fws? qcontent)* fws? DQUOTE cfws?
               ;

// 3.2.1. Primitive Tokens

// US-ASCII control characters that do not include the carriage return, line feed,and white space characters
NOWSCTL        : '\u0001'..'\u0008'
               | '\u000B'
               | '\u000C'
               | '\u000E'..'\u001F'
               | '\u007F'
               ;

// Characters excluding CR and LF
TEXT           : '\u0001'..'\u0009'
               | '\u000B'
               | '\u000C'
               | '\u000E'..'\u001F'
               ;

// Special characters used in other parts of the syntax
specials       : '('
               | ')'
               | '<'
               | '>'
               | '['
               | ']'
               | ':'
               | ';'
               | '@'
               | '\\'
               | ','
               | '.'
               | DQUOTE
               ;

// 3.2.2. Quoted characters

quotedPair     : '\\' TEXT
               ;

// 3.4.1. Addr-spec specification

addrSpec       : localPart '@' domain
               ;
localPart      : dotAtom
               | quotedString
               ;
domain         : dotAtom
               | domainLiteral
               ;
domainLiteral  : cfws? '[' *(fws? dcontent) fws? ']' cfws?
               ;
dcontent       : DTEXT
               | quotedPair
               ;
DTEXT          : NOWSCTL
               | '\u0033'..'\u005A'
               | '\u005E'..'\u007E'
               ;

// Basic

CRLF           : '\r\n'
               ;
WSP            : ' '
               | '\t'
               ;
DQUOTE         : '"'
               ;