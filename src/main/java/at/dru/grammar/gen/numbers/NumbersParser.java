// Generated from /home/dru/SpringWork/grammar/Numbers.g4 by ANTLR 4.8
package at.dru.grammar.gen.numbers;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NumbersParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SIGN=1, DIGITS=2, DOT=3;
	public static final int
		RULE_decimal = 0, RULE_decimalSuffix = 1, RULE_integer = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"decimal", "decimalSuffix", "integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SIGN", "DIGITS", "DOT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Numbers.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NumbersParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(NumbersParser.DIGITS, 0); }
		public TerminalNode SIGN() { return getToken(NumbersParser.SIGN, 0); }
		public DecimalSuffixContext decimalSuffix() {
			return getRuleContext(DecimalSuffixContext.class,0);
		}
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumbersListener ) ((NumbersListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumbersListener ) ((NumbersListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumbersVisitor ) return ((NumbersVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(6);
				match(SIGN);
				}
			}

			setState(9);
			match(DIGITS);
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(10);
				decimalSuffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalSuffixContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(NumbersParser.DOT, 0); }
		public TerminalNode DIGITS() { return getToken(NumbersParser.DIGITS, 0); }
		public DecimalSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumbersListener ) ((NumbersListener)listener).enterDecimalSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumbersListener ) ((NumbersListener)listener).exitDecimalSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumbersVisitor ) return ((NumbersVisitor<? extends T>)visitor).visitDecimalSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalSuffixContext decimalSuffix() throws RecognitionException {
		DecimalSuffixContext _localctx = new DecimalSuffixContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decimalSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			match(DOT);
			setState(14);
			match(DIGITS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(NumbersParser.DIGITS, 0); }
		public TerminalNode SIGN() { return getToken(NumbersParser.SIGN, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumbersListener ) ((NumbersListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumbersListener ) ((NumbersListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NumbersVisitor ) return ((NumbersVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(16);
				match(SIGN);
				}
			}

			setState(19);
			match(DIGITS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5\30\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\5\2\n\n\2\3\2\3\2\5\2\16\n\2\3\3\3\3\3\3\3\4\5\4\24\n"+
		"\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2\27\2\t\3\2\2\2\4\17\3\2\2\2\6\23\3\2"+
		"\2\2\b\n\7\3\2\2\t\b\3\2\2\2\t\n\3\2\2\2\n\13\3\2\2\2\13\r\7\4\2\2\f\16"+
		"\5\4\3\2\r\f\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\20\7\5\2\2\20\21\7\4"+
		"\2\2\21\5\3\2\2\2\22\24\7\3\2\2\23\22\3\2\2\2\23\24\3\2\2\2\24\25\3\2"+
		"\2\2\25\26\7\4\2\2\26\7\3\2\2\2\5\t\r\23";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}