// Generated from /home/dru/SpringWork/grammar/Groups.g4 by ANTLR 4.8
package at.dru.grammar.gen.groups;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GroupsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOST=1, GROUP_START=2, GROUP_END=3, RANGE_START=4, RANGE_END=5, RANGE_TO=6, 
		WILDCARD=7, SPACES=8, SIGN=9, DIGITS=10, DOT=11;
	public static final int
		RULE_decimalGroup = 0, RULE_decimalGroupTerm = 1, RULE_decimalRange = 2, 
		RULE_decimalRangeTerm = 3, RULE_integerGroup = 4, RULE_integerGroupTerm = 5, 
		RULE_integerRange = 6, RULE_integerRangeTerm = 7, RULE_boostTerm = 8, 
		RULE_decimal = 9, RULE_decimalSuffix = 10, RULE_integer = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"decimalGroup", "decimalGroupTerm", "decimalRange", "decimalRangeTerm", 
			"integerGroup", "integerGroupTerm", "integerRange", "integerRangeTerm", 
			"boostTerm", "decimal", "decimalSuffix", "integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'^'", "'('", "')'", "'['", "']'", "'TO'", "'*'", null, null, null, 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOST", "GROUP_START", "GROUP_END", "RANGE_START", "RANGE_END", 
			"RANGE_TO", "WILDCARD", "SPACES", "SIGN", "DIGITS", "DOT"
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
	public String getGrammarFileName() { return "Groups.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GroupsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DecimalGroupContext extends ParserRuleContext {
		public TerminalNode GROUP_START() { return getToken(GroupsParser.GROUP_START, 0); }
		public List<DecimalGroupTermContext> decimalGroupTerm() {
			return getRuleContexts(DecimalGroupTermContext.class);
		}
		public DecimalGroupTermContext decimalGroupTerm(int i) {
			return getRuleContext(DecimalGroupTermContext.class,i);
		}
		public TerminalNode GROUP_END() { return getToken(GroupsParser.GROUP_END, 0); }
		public List<TerminalNode> SPACES() { return getTokens(GroupsParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(GroupsParser.SPACES, i);
		}
		public List<BoostTermContext> boostTerm() {
			return getRuleContexts(BoostTermContext.class);
		}
		public BoostTermContext boostTerm(int i) {
			return getRuleContext(BoostTermContext.class,i);
		}
		public DecimalGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).enterDecimalGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).exitDecimalGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroupsVisitor ) return ((GroupsVisitor<? extends T>)visitor).visitDecimalGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalGroupContext decimalGroup() throws RecognitionException {
		DecimalGroupContext _localctx = new DecimalGroupContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_decimalGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(GROUP_START);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(25);
				match(SPACES);
				}
			}

			setState(28);
			decimalGroupTerm();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOST) {
				{
				setState(29);
				boostTerm();
				}
			}

			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(32);
					match(SPACES);
					setState(33);
					decimalGroupTerm();
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BOOST) {
						{
						setState(34);
						boostTerm();
						}
					}

					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(42);
				match(SPACES);
				}
			}

			setState(45);
			match(GROUP_END);
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

	public static class DecimalGroupTermContext extends ParserRuleContext {
		public DecimalRangeContext decimalRange() {
			return getRuleContext(DecimalRangeContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public DecimalGroupTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalGroupTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).enterDecimalGroupTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).exitDecimalGroupTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroupsVisitor ) return ((GroupsVisitor<? extends T>)visitor).visitDecimalGroupTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalGroupTermContext decimalGroupTerm() throws RecognitionException {
		DecimalGroupTermContext _localctx = new DecimalGroupTermContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decimalGroupTerm);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANGE_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				decimalRange();
				}
				break;
			case SIGN:
			case DIGITS:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				decimal();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DecimalRangeContext extends ParserRuleContext {
		public TerminalNode RANGE_START() { return getToken(GroupsParser.RANGE_START, 0); }
		public List<DecimalRangeTermContext> decimalRangeTerm() {
			return getRuleContexts(DecimalRangeTermContext.class);
		}
		public DecimalRangeTermContext decimalRangeTerm(int i) {
			return getRuleContext(DecimalRangeTermContext.class,i);
		}
		public List<TerminalNode> SPACES() { return getTokens(GroupsParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(GroupsParser.SPACES, i);
		}
		public TerminalNode RANGE_TO() { return getToken(GroupsParser.RANGE_TO, 0); }
		public TerminalNode RANGE_END() { return getToken(GroupsParser.RANGE_END, 0); }
		public DecimalRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).enterDecimalRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).exitDecimalRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroupsVisitor ) return ((GroupsVisitor<? extends T>)visitor).visitDecimalRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalRangeContext decimalRange() throws RecognitionException {
		DecimalRangeContext _localctx = new DecimalRangeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decimalRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(RANGE_START);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(52);
				match(SPACES);
				}
			}

			setState(55);
			decimalRangeTerm();
			setState(56);
			match(SPACES);
			setState(57);
			match(RANGE_TO);
			setState(58);
			match(SPACES);
			setState(59);
			decimalRangeTerm();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(60);
				match(SPACES);
				}
			}

			setState(63);
			match(RANGE_END);
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

	public static class DecimalRangeTermContext extends ParserRuleContext {
		public TerminalNode WILDCARD() { return getToken(GroupsParser.WILDCARD, 0); }
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public DecimalRangeTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalRangeTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).enterDecimalRangeTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).exitDecimalRangeTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroupsVisitor ) return ((GroupsVisitor<? extends T>)visitor).visitDecimalRangeTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalRangeTermContext decimalRangeTerm() throws RecognitionException {
		DecimalRangeTermContext _localctx = new DecimalRangeTermContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decimalRangeTerm);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WILDCARD:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(WILDCARD);
				}
				break;
			case SIGN:
			case DIGITS:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				decimal();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IntegerGroupContext extends ParserRuleContext {
		public TerminalNode GROUP_START() { return getToken(GroupsParser.GROUP_START, 0); }
		public List<IntegerGroupTermContext> integerGroupTerm() {
			return getRuleContexts(IntegerGroupTermContext.class);
		}
		public IntegerGroupTermContext integerGroupTerm(int i) {
			return getRuleContext(IntegerGroupTermContext.class,i);
		}
		public TerminalNode GROUP_END() { return getToken(GroupsParser.GROUP_END, 0); }
		public List<TerminalNode> SPACES() { return getTokens(GroupsParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(GroupsParser.SPACES, i);
		}
		public List<BoostTermContext> boostTerm() {
			return getRuleContexts(BoostTermContext.class);
		}
		public BoostTermContext boostTerm(int i) {
			return getRuleContext(BoostTermContext.class,i);
		}
		public IntegerGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).enterIntegerGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).exitIntegerGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroupsVisitor ) return ((GroupsVisitor<? extends T>)visitor).visitIntegerGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerGroupContext integerGroup() throws RecognitionException {
		IntegerGroupContext _localctx = new IntegerGroupContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integerGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(GROUP_START);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(70);
				match(SPACES);
				}
			}

			setState(73);
			integerGroupTerm();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOST) {
				{
				setState(74);
				boostTerm();
				}
			}

			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					match(SPACES);
					setState(78);
					integerGroupTerm();
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BOOST) {
						{
						setState(79);
						boostTerm();
						}
					}

					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(87);
				match(SPACES);
				}
			}

			setState(90);
			match(GROUP_END);
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

	public static class IntegerGroupTermContext extends ParserRuleContext {
		public IntegerRangeContext integerRange() {
			return getRuleContext(IntegerRangeContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public IntegerGroupTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerGroupTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).enterIntegerGroupTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).exitIntegerGroupTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroupsVisitor ) return ((GroupsVisitor<? extends T>)visitor).visitIntegerGroupTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerGroupTermContext integerGroupTerm() throws RecognitionException {
		IntegerGroupTermContext _localctx = new IntegerGroupTermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_integerGroupTerm);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANGE_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				integerRange();
				}
				break;
			case SIGN:
			case DIGITS:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IntegerRangeContext extends ParserRuleContext {
		public TerminalNode RANGE_START() { return getToken(GroupsParser.RANGE_START, 0); }
		public List<IntegerRangeTermContext> integerRangeTerm() {
			return getRuleContexts(IntegerRangeTermContext.class);
		}
		public IntegerRangeTermContext integerRangeTerm(int i) {
			return getRuleContext(IntegerRangeTermContext.class,i);
		}
		public List<TerminalNode> SPACES() { return getTokens(GroupsParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(GroupsParser.SPACES, i);
		}
		public TerminalNode RANGE_TO() { return getToken(GroupsParser.RANGE_TO, 0); }
		public TerminalNode RANGE_END() { return getToken(GroupsParser.RANGE_END, 0); }
		public IntegerRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).enterIntegerRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).exitIntegerRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroupsVisitor ) return ((GroupsVisitor<? extends T>)visitor).visitIntegerRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerRangeContext integerRange() throws RecognitionException {
		IntegerRangeContext _localctx = new IntegerRangeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integerRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(RANGE_START);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(97);
				match(SPACES);
				}
			}

			setState(100);
			integerRangeTerm();
			setState(101);
			match(SPACES);
			setState(102);
			match(RANGE_TO);
			setState(103);
			match(SPACES);
			setState(104);
			integerRangeTerm();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(105);
				match(SPACES);
				}
			}

			setState(108);
			match(RANGE_END);
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

	public static class IntegerRangeTermContext extends ParserRuleContext {
		public TerminalNode WILDCARD() { return getToken(GroupsParser.WILDCARD, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public IntegerRangeTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerRangeTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).enterIntegerRangeTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).exitIntegerRangeTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroupsVisitor ) return ((GroupsVisitor<? extends T>)visitor).visitIntegerRangeTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerRangeTermContext integerRangeTerm() throws RecognitionException {
		IntegerRangeTermContext _localctx = new IntegerRangeTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_integerRangeTerm);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WILDCARD:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(WILDCARD);
				}
				break;
			case SIGN:
			case DIGITS:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BoostTermContext extends ParserRuleContext {
		public TerminalNode BOOST() { return getToken(GroupsParser.BOOST, 0); }
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public BoostTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boostTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).enterBoostTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).exitBoostTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroupsVisitor ) return ((GroupsVisitor<? extends T>)visitor).visitBoostTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoostTermContext boostTerm() throws RecognitionException {
		BoostTermContext _localctx = new BoostTermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boostTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(BOOST);
			setState(115);
			decimal();
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

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(GroupsParser.DIGITS, 0); }
		public TerminalNode SIGN() { return getToken(GroupsParser.SIGN, 0); }
		public DecimalSuffixContext decimalSuffix() {
			return getRuleContext(DecimalSuffixContext.class,0);
		}
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroupsVisitor ) return ((GroupsVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(117);
				match(SIGN);
				}
			}

			setState(120);
			match(DIGITS);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(121);
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
		public TerminalNode DOT() { return getToken(GroupsParser.DOT, 0); }
		public TerminalNode DIGITS() { return getToken(GroupsParser.DIGITS, 0); }
		public DecimalSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).enterDecimalSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).exitDecimalSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroupsVisitor ) return ((GroupsVisitor<? extends T>)visitor).visitDecimalSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalSuffixContext decimalSuffix() throws RecognitionException {
		DecimalSuffixContext _localctx = new DecimalSuffixContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_decimalSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(DOT);
			setState(125);
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
		public TerminalNode DIGITS() { return getToken(GroupsParser.DIGITS, 0); }
		public TerminalNode SIGN() { return getToken(GroupsParser.SIGN, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupsListener ) ((GroupsListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroupsVisitor ) return ((GroupsVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(127);
				match(SIGN);
				}
			}

			setState(130);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\u0087\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\5\2\35\n\2\3\2\3\2\5\2!\n\2\3\2\3\2\3\2\5"+
		"\2&\n\2\7\2(\n\2\f\2\16\2+\13\2\3\2\5\2.\n\2\3\2\3\2\3\3\3\3\5\3\64\n"+
		"\3\3\4\3\4\5\48\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\3\4\3\5\3\5\5"+
		"\5F\n\5\3\6\3\6\5\6J\n\6\3\6\3\6\5\6N\n\6\3\6\3\6\3\6\5\6S\n\6\7\6U\n"+
		"\6\f\6\16\6X\13\6\3\6\5\6[\n\6\3\6\3\6\3\7\3\7\5\7a\n\7\3\b\3\b\5\be\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\b\3\b\3\t\3\t\5\ts\n\t\3\n\3\n\3"+
		"\n\3\13\5\13y\n\13\3\13\3\13\5\13}\n\13\3\f\3\f\3\f\3\r\5\r\u0083\n\r"+
		"\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u008f\2\32\3\2"+
		"\2\2\4\63\3\2\2\2\6\65\3\2\2\2\bE\3\2\2\2\nG\3\2\2\2\f`\3\2\2\2\16b\3"+
		"\2\2\2\20r\3\2\2\2\22t\3\2\2\2\24x\3\2\2\2\26~\3\2\2\2\30\u0082\3\2\2"+
		"\2\32\34\7\4\2\2\33\35\7\n\2\2\34\33\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2"+
		"\2\36 \5\4\3\2\37!\5\22\n\2 \37\3\2\2\2 !\3\2\2\2!)\3\2\2\2\"#\7\n\2\2"+
		"#%\5\4\3\2$&\5\22\n\2%$\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'\"\3\2\2\2(+\3\2"+
		"\2\2)\'\3\2\2\2)*\3\2\2\2*-\3\2\2\2+)\3\2\2\2,.\7\n\2\2-,\3\2\2\2-.\3"+
		"\2\2\2./\3\2\2\2/\60\7\5\2\2\60\3\3\2\2\2\61\64\5\6\4\2\62\64\5\24\13"+
		"\2\63\61\3\2\2\2\63\62\3\2\2\2\64\5\3\2\2\2\65\67\7\6\2\2\668\7\n\2\2"+
		"\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\b\5\2:;\7\n\2\2;<\7\b\2\2<=\7"+
		"\n\2\2=?\5\b\5\2>@\7\n\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\7\2\2B\7"+
		"\3\2\2\2CF\7\t\2\2DF\5\24\13\2EC\3\2\2\2ED\3\2\2\2F\t\3\2\2\2GI\7\4\2"+
		"\2HJ\7\n\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KM\5\f\7\2LN\5\22\n\2ML\3\2"+
		"\2\2MN\3\2\2\2NV\3\2\2\2OP\7\n\2\2PR\5\f\7\2QS\5\22\n\2RQ\3\2\2\2RS\3"+
		"\2\2\2SU\3\2\2\2TO\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3"+
		"\2\2\2Y[\7\n\2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\5\2\2]\13\3\2\2\2"+
		"^a\5\16\b\2_a\5\30\r\2`^\3\2\2\2`_\3\2\2\2a\r\3\2\2\2bd\7\6\2\2ce\7\n"+
		"\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\5\20\t\2gh\7\n\2\2hi\7\b\2\2ij\7"+
		"\n\2\2jl\5\20\t\2km\7\n\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\7\2\2o\17"+
		"\3\2\2\2ps\7\t\2\2qs\5\30\r\2rp\3\2\2\2rq\3\2\2\2s\21\3\2\2\2tu\7\3\2"+
		"\2uv\5\24\13\2v\23\3\2\2\2wy\7\13\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|"+
		"\7\f\2\2{}\5\26\f\2|{\3\2\2\2|}\3\2\2\2}\25\3\2\2\2~\177\7\r\2\2\177\u0080"+
		"\7\f\2\2\u0080\27\3\2\2\2\u0081\u0083\7\13\2\2\u0082\u0081\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\f\2\2\u0085\31\3\2\2"+
		"\2\27\34 %)-\63\67?EIMRVZ`dlrx|\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}