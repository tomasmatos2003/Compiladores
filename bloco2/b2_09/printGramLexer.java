// Generated from printGram.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class printGramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, COMM=14, Integer=15, String=16, 
		ID=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "COMM", "Integer", "String", "ID", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "';'", "'->'", "'-'", "'+'", "'reduce'", "'read'", "'^'", 
			"':'", "'*'", "'('", "')'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "COMM", "Integer", "String", "ID", "WS"
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


	public printGramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "printGram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012s\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\rQ\b\r\n\r\f\rT\t\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0004\u000e[\b\u000e\u000b\u000e\f\u000e"+
		"\\\u0001\u000f\u0001\u000f\u0005\u000fa\b\u000f\n\u000f\f\u000fd\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010i\b\u0010\u000b\u0010"+
		"\f\u0010j\u0001\u0011\u0004\u0011n\b\u0011\u000b\u0011\f\u0011o\u0001"+
		"\u0011\u0001\u0011\u0002Rb\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"\u0001\u0000\u0003\u0001\u000009\u0003\u0000AZ__az\u0003\u0000\t\n\r\r"+
		"  w\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001"+
		"\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000"+
		"\u0000\u00070\u0001\u0000\u0000\u0000\t2\u0001\u0000\u0000\u0000\u000b"+
		"4\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000\u000f@\u0001\u0000"+
		"\u0000\u0000\u0011B\u0001\u0000\u0000\u0000\u0013D\u0001\u0000\u0000\u0000"+
		"\u0015F\u0001\u0000\u0000\u0000\u0017H\u0001\u0000\u0000\u0000\u0019J"+
		"\u0001\u0000\u0000\u0000\u001bL\u0001\u0000\u0000\u0000\u001dZ\u0001\u0000"+
		"\u0000\u0000\u001f^\u0001\u0000\u0000\u0000!h\u0001\u0000\u0000\u0000"+
		"#m\u0001\u0000\u0000\u0000%&\u0005p\u0000\u0000&\'\u0005r\u0000\u0000"+
		"\'(\u0005i\u0000\u0000()\u0005n\u0000\u0000)*\u0005t\u0000\u0000*\u0002"+
		"\u0001\u0000\u0000\u0000+,\u0005;\u0000\u0000,\u0004\u0001\u0000\u0000"+
		"\u0000-.\u0005-\u0000\u0000./\u0005>\u0000\u0000/\u0006\u0001\u0000\u0000"+
		"\u000001\u0005-\u0000\u00001\b\u0001\u0000\u0000\u000023\u0005+\u0000"+
		"\u00003\n\u0001\u0000\u0000\u000045\u0005r\u0000\u000056\u0005e\u0000"+
		"\u000067\u0005d\u0000\u000078\u0005u\u0000\u000089\u0005c\u0000\u0000"+
		"9:\u0005e\u0000\u0000:\f\u0001\u0000\u0000\u0000;<\u0005r\u0000\u0000"+
		"<=\u0005e\u0000\u0000=>\u0005a\u0000\u0000>?\u0005d\u0000\u0000?\u000e"+
		"\u0001\u0000\u0000\u0000@A\u0005^\u0000\u0000A\u0010\u0001\u0000\u0000"+
		"\u0000BC\u0005:\u0000\u0000C\u0012\u0001\u0000\u0000\u0000DE\u0005*\u0000"+
		"\u0000E\u0014\u0001\u0000\u0000\u0000FG\u0005(\u0000\u0000G\u0016\u0001"+
		"\u0000\u0000\u0000HI\u0005)\u0000\u0000I\u0018\u0001\u0000\u0000\u0000"+
		"JK\u0005/\u0000\u0000K\u001a\u0001\u0000\u0000\u0000LM\u0005/\u0000\u0000"+
		"MN\u0005/\u0000\u0000NR\u0001\u0000\u0000\u0000OQ\t\u0000\u0000\u0000"+
		"PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000UV\u0005\n\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0006\r"+
		"\u0000\u0000X\u001c\u0001\u0000\u0000\u0000Y[\u0007\u0000\u0000\u0000"+
		"ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]\u001e\u0001\u0000\u0000\u0000^b\u0005"+
		"\"\u0000\u0000_a\t\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000ad\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005\"\u0000\u0000"+
		"f \u0001\u0000\u0000\u0000gi\u0007\u0001\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000k\"\u0001\u0000\u0000\u0000ln\u0007\u0002\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0006\u0011\u0000"+
		"\u0000r$\u0001\u0000\u0000\u0000\u0006\u0000R\\bjo\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}