// Generated from C:/Users/Josh/IdeaProjects/CMPILER PE1\g.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OP=1, U=2, LParen=3, RParen=4, E=5, Terminal=6;
	public static final int
		RULE_prule = 0, RULE_s = 1, RULE_a = 2, RULE_d = 3, RULE_i = 4, RULE_g = 5, 
		RULE_h = 6, RULE_j = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prule", "s", "a", "d", "i", "g", "h", "j"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'U'", "'('", "')'", "'E'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OP", "U", "LParen", "RParen", "E", "Terminal"
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
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PruleContext extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public PruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PruleContext prule() throws RecognitionException {
		PruleContext _localctx = new PruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			s();
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

	public static class SContext extends ParserRuleContext {
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public JContext j() {
			return getRuleContext(JContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s);
		try {
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				i(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				j();
				}
				break;
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

	public static class AContext extends ParserRuleContext {
		public TerminalNode Terminal() { return getToken(gParser.Terminal, 0); }
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(Terminal);
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

	public static class DContext extends ParserRuleContext {
		public HContext h() {
			return getRuleContext(HContext.class,0);
		}
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_d);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			h();
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

	public static class IContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(gParser.LParen, 0); }
		public List<IContext> i() {
			return getRuleContexts(IContext.class);
		}
		public IContext i(int i) {
			return getRuleContext(IContext.class,i);
		}
		public TerminalNode RParen() { return getToken(gParser.RParen, 0); }
		public TerminalNode OP() { return getToken(gParser.OP, 0); }
		public TerminalNode E() { return getToken(gParser.E, 0); }
		public List<TerminalNode> U() { return getTokens(gParser.U); }
		public TerminalNode U(int i) {
			return getToken(gParser.U, i);
		}
		public List<AContext> a() {
			return getRuleContexts(AContext.class);
		}
		public AContext a(int i) {
			return getRuleContext(AContext.class,i);
		}
		public HContext h() {
			return getRuleContext(HContext.class,0);
		}
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitI(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IContext i() throws RecognitionException {
		return i(0);
	}

	private IContext i(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IContext _localctx = new IContext(_ctx, _parentState);
		IContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_i, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(27);
				match(LParen);
				setState(28);
				i(0);
				setState(29);
				match(RParen);
				setState(30);
				match(OP);
				}
				break;
			case 2:
				{
				setState(32);
				match(LParen);
				setState(33);
				i(0);
				setState(34);
				match(RParen);
				setState(36);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(35);
					i(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(38);
				match(E);
				setState(39);
				match(U);
				setState(40);
				i(5);
				}
				break;
			case 4:
				{
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Terminal) {
					{
					setState(41);
					a();
					}
				}

				setState(44);
				match(LParen);
				setState(45);
				a();
				setState(46);
				match(U);
				setState(47);
				a();
				setState(48);
				match(RParen);
				}
				break;
			case 5:
				{
				setState(50);
				h();
				}
				break;
			case 6:
				{
				setState(51);
				a();
				setState(52);
				match(U);
				setState(53);
				match(LParen);
				setState(54);
				a();
				setState(55);
				match(U);
				setState(56);
				a();
				setState(57);
				match(RParen);
				setState(58);
				match(OP);
				setState(59);
				match(U);
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(60);
					a();
					}
					break;
				}
				setState(64);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(63);
					i(0);
					}
					break;
				}
				}
				break;
			case 7:
				{
				setState(66);
				match(E);
				setState(67);
				match(U);
				setState(68);
				s();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new IContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_i);
						setState(71);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(72);
						match(U);
						setState(73);
						match(LParen);
						setState(74);
						d();
						setState(75);
						match(RParen);
						setState(77);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
						case 1:
							{
							setState(76);
							match(OP);
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new IContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_i);
						setState(79);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(80);
						match(U);
						setState(81);
						d();
						}
						break;
					case 3:
						{
						_localctx = new IContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_i);
						setState(82);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(83);
						match(U);
						setState(84);
						match(E);
						}
						break;
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode OP() { return getToken(gParser.OP, 0); }
		public GContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_g; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GContext g() throws RecognitionException {
		GContext _localctx = new GContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_g);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				a();
				setState(91);
				match(OP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				a();
				}
				break;
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

	public static class HContext extends ParserRuleContext {
		public GContext g() {
			return getRuleContext(GContext.class,0);
		}
		public HContext h() {
			return getRuleContext(HContext.class,0);
		}
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public HContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitH(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HContext h() throws RecognitionException {
		HContext _localctx = new HContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_h);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				g();
				setState(97);
				h();
				setState(99);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(98);
					i(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				g();
				}
				break;
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

	public static class JContext extends ParserRuleContext {
		public TerminalNode E() { return getToken(gParser.E, 0); }
		public JContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JContext j() throws RecognitionException {
		JContext _localctx = new JContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_j);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(E);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return i_sempred((IContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean i_sempred(IContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\bm\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\5\3"+
		"\27\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\'"+
		"\n\6\3\6\3\6\3\6\3\6\5\6-\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6@\n\6\3\6\5\6C\n\6\3\6\3\6\3\6\5\6H\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6X\n\6\f"+
		"\6\16\6[\13\6\3\7\3\7\3\7\3\7\5\7a\n\7\3\b\3\b\3\b\5\bf\n\b\3\b\5\bi\n"+
		"\b\3\t\3\t\3\t\2\3\n\n\2\4\6\b\n\f\16\20\2\2\2v\2\22\3\2\2\2\4\26\3\2"+
		"\2\2\6\30\3\2\2\2\b\32\3\2\2\2\nG\3\2\2\2\f`\3\2\2\2\16h\3\2\2\2\20j\3"+
		"\2\2\2\22\23\5\4\3\2\23\3\3\2\2\2\24\27\5\n\6\2\25\27\5\20\t\2\26\24\3"+
		"\2\2\2\26\25\3\2\2\2\27\5\3\2\2\2\30\31\7\b\2\2\31\7\3\2\2\2\32\33\5\16"+
		"\b\2\33\t\3\2\2\2\34\35\b\6\1\2\35\36\7\5\2\2\36\37\5\n\6\2\37 \7\6\2"+
		"\2 !\7\3\2\2!H\3\2\2\2\"#\7\5\2\2#$\5\n\6\2$&\7\6\2\2%\'\5\n\6\2&%\3\2"+
		"\2\2&\'\3\2\2\2\'H\3\2\2\2()\7\7\2\2)*\7\4\2\2*H\5\n\6\7+-\5\6\4\2,+\3"+
		"\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\5\2\2/\60\5\6\4\2\60\61\7\4\2\2\61\62\5"+
		"\6\4\2\62\63\7\6\2\2\63H\3\2\2\2\64H\5\16\b\2\65\66\5\6\4\2\66\67\7\4"+
		"\2\2\678\7\5\2\289\5\6\4\29:\7\4\2\2:;\5\6\4\2;<\7\6\2\2<=\7\3\2\2=?\7"+
		"\4\2\2>@\5\6\4\2?>\3\2\2\2?@\3\2\2\2@B\3\2\2\2AC\5\n\6\2BA\3\2\2\2BC\3"+
		"\2\2\2CH\3\2\2\2DE\7\7\2\2EF\7\4\2\2FH\5\4\3\2G\34\3\2\2\2G\"\3\2\2\2"+
		"G(\3\2\2\2G,\3\2\2\2G\64\3\2\2\2G\65\3\2\2\2GD\3\2\2\2HY\3\2\2\2IJ\f\13"+
		"\2\2JK\7\4\2\2KL\7\5\2\2LM\5\b\5\2MO\7\6\2\2NP\7\3\2\2ON\3\2\2\2OP\3\2"+
		"\2\2PX\3\2\2\2QR\f\t\2\2RS\7\4\2\2SX\5\b\5\2TU\f\b\2\2UV\7\4\2\2VX\7\7"+
		"\2\2WI\3\2\2\2WQ\3\2\2\2WT\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\13\3"+
		"\2\2\2[Y\3\2\2\2\\]\5\6\4\2]^\7\3\2\2^a\3\2\2\2_a\5\6\4\2`\\\3\2\2\2`"+
		"_\3\2\2\2a\r\3\2\2\2bc\5\f\7\2ce\5\16\b\2df\5\n\6\2ed\3\2\2\2ef\3\2\2"+
		"\2fi\3\2\2\2gi\5\f\7\2hb\3\2\2\2hg\3\2\2\2i\17\3\2\2\2jk\7\7\2\2k\21\3"+
		"\2\2\2\16\26&,?BGOWY`eh";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}