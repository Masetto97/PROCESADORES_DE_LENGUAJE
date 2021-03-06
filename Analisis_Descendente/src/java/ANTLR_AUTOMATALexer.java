// Generated from src/resources/ANTLR_AUTOMATA.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANTLR_AUTOMATALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Flecha=1, Punto=2, Doble_Punto=3, Separator=4, Par_derecho=5, Par_izquierdo=6, 
		Llave_izquierda=7, Llave_derecha=8, Punto_y_coma=9, Barra_Baja=10, Asignacion=11, 
		Coma=12, Asterisco=13, AS=14, Automaton=15, Code=16, Environment=17, Import=18, 
		Initial=19, Inputs=20, From=21, Outputs=22, States=23, Transitions=24, 
		Identifier=25, WHITESPACE=26, COMMENT=27, LINE_COMMENT=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Flecha", "Punto", "Doble_Punto", "Separator", "Par_derecho", "Par_izquierdo", 
		"Llave_izquierda", "Llave_derecha", "Punto_y_coma", "Barra_Baja", "Asignacion", 
		"Coma", "Asterisco", "AS", "Automaton", "Code", "Environment", "Import", 
		"Initial", "Inputs", "From", "Outputs", "States", "Transitions", "Letter", 
		"LetterOrDigit", "Identifier", "WHITESPACE", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-->'", "'.'", "':'", "'|'", "')'", "'('", "'{'", "'}'", "';'", 
		"'_'", "':='", "','", "'*'", "'as'", "'automaton'", null, "'environment'", 
		"'import'", "'initial'", "'inputs'", "'from'", "'outputs'", "'states'", 
		"'transitions'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Flecha", "Punto", "Doble_Punto", "Separator", "Par_derecho", "Par_izquierdo", 
		"Llave_izquierda", "Llave_derecha", "Punto_y_coma", "Barra_Baja", "Asignacion", 
		"Coma", "Asterisco", "AS", "Automaton", "Code", "Environment", "Import", 
		"Initial", "Inputs", "From", "Outputs", "States", "Transitions", "Identifier", 
		"WHITESPACE", "COMMENT", "LINE_COMMENT"
	};
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


	public ANTLR_AUTOMATALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ANTLR_AUTOMATA.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00ea\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21r\n\21\f\21\16\21u\13\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\7\34\u00c7\n\34\f\34\16\34\u00ca\13\34\3\35\6\35"+
		"\u00cd\n\35\r\35\16\35\u00ce\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00d7"+
		"\n\36\f\36\16\36\u00da\13\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\6\37\u00e5\n\37\r\37\16\37\u00e6\3\37\3\37\4s\u00d8\2 \3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\2\67\339\34;\35=\36\3\2\6\4\2"+
		"C\\c|\7\2&&\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\13\f\17\17\2\u00ec\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5C\3"+
		"\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3"+
		"\2\2\2\23Q\3\2\2\2\25S\3\2\2\2\27U\3\2\2\2\31X\3\2\2\2\33Z\3\2\2\2\35"+
		"\\\3\2\2\2\37_\3\2\2\2!i\3\2\2\2#~\3\2\2\2%\u008a\3\2\2\2\'\u0091\3\2"+
		"\2\2)\u0099\3\2\2\2+\u00a0\3\2\2\2-\u00a5\3\2\2\2/\u00ad\3\2\2\2\61\u00b4"+
		"\3\2\2\2\63\u00c0\3\2\2\2\65\u00c2\3\2\2\2\67\u00c4\3\2\2\29\u00cc\3\2"+
		"\2\2;\u00d2\3\2\2\2=\u00e0\3\2\2\2?@\7/\2\2@A\7/\2\2AB\7@\2\2B\4\3\2\2"+
		"\2CD\7\60\2\2D\6\3\2\2\2EF\7<\2\2F\b\3\2\2\2GH\7~\2\2H\n\3\2\2\2IJ\7+"+
		"\2\2J\f\3\2\2\2KL\7*\2\2L\16\3\2\2\2MN\7}\2\2N\20\3\2\2\2OP\7\177\2\2"+
		"P\22\3\2\2\2QR\7=\2\2R\24\3\2\2\2ST\7a\2\2T\26\3\2\2\2UV\7<\2\2VW\7?\2"+
		"\2W\30\3\2\2\2XY\7.\2\2Y\32\3\2\2\2Z[\7,\2\2[\34\3\2\2\2\\]\7c\2\2]^\7"+
		"u\2\2^\36\3\2\2\2_`\7c\2\2`a\7w\2\2ab\7v\2\2bc\7q\2\2cd\7o\2\2de\7c\2"+
		"\2ef\7v\2\2fg\7q\2\2gh\7p\2\2h \3\2\2\2ij\7]\2\2jk\7e\2\2kl\7q\2\2lm\7"+
		"f\2\2mn\7g\2\2no\7_\2\2os\3\2\2\2pr\13\2\2\2qp\3\2\2\2ru\3\2\2\2st\3\2"+
		"\2\2sq\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7]\2\2wx\7\61\2\2xy\7e\2\2yz\7q\2"+
		"\2z{\7f\2\2{|\7g\2\2|}\7_\2\2}\"\3\2\2\2~\177\7g\2\2\177\u0080\7p\2\2"+
		"\u0080\u0081\7x\2\2\u0081\u0082\7k\2\2\u0082\u0083\7t\2\2\u0083\u0084"+
		"\7q\2\2\u0084\u0085\7p\2\2\u0085\u0086\7o\2\2\u0086\u0087\7g\2\2\u0087"+
		"\u0088\7p\2\2\u0088\u0089\7v\2\2\u0089$\3\2\2\2\u008a\u008b\7k\2\2\u008b"+
		"\u008c\7o\2\2\u008c\u008d\7r\2\2\u008d\u008e\7q\2\2\u008e\u008f\7t\2\2"+
		"\u008f\u0090\7v\2\2\u0090&\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093\7p\2"+
		"\2\u0093\u0094\7k\2\2\u0094\u0095\7v\2\2\u0095\u0096\7k\2\2\u0096\u0097"+
		"\7c\2\2\u0097\u0098\7n\2\2\u0098(\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b"+
		"\7p\2\2\u009b\u009c\7r\2\2\u009c\u009d\7w\2\2\u009d\u009e\7v\2\2\u009e"+
		"\u009f\7u\2\2\u009f*\3\2\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7t\2\2\u00a2"+
		"\u00a3\7q\2\2\u00a3\u00a4\7o\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7q\2\2\u00a6"+
		"\u00a7\7w\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7r\2\2\u00a9\u00aa\7w\2\2"+
		"\u00aa\u00ab\7v\2\2\u00ab\u00ac\7u\2\2\u00ac.\3\2\2\2\u00ad\u00ae\7u\2"+
		"\2\u00ae\u00af\7v\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2"+
		"\7g\2\2\u00b2\u00b3\7u\2\2\u00b3\60\3\2\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6"+
		"\7t\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7u\2\2\u00b9"+
		"\u00ba\7k\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7q\2\2"+
		"\u00bd\u00be\7p\2\2\u00be\u00bf\7u\2\2\u00bf\62\3\2\2\2\u00c0\u00c1\t"+
		"\2\2\2\u00c1\64\3\2\2\2\u00c2\u00c3\t\3\2\2\u00c3\66\3\2\2\2\u00c4\u00c8"+
		"\5\63\32\2\u00c5\u00c7\5\65\33\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2"+
		"\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c98\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00cb\u00cd\t\4\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\35"+
		"\2\2\u00d1:\3\2\2\2\u00d2\u00d3\7\61\2\2\u00d3\u00d4\7,\2\2\u00d4\u00d8"+
		"\3\2\2\2\u00d5\u00d7\13\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2"+
		"\u00d8\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00db\u00dc\7,\2\2\u00dc\u00dd\7\61\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\b\36\2\2\u00df<\3\2\2\2\u00e0\u00e1\7\61\2\2\u00e1\u00e2\7\61\2"+
		"\2\u00e2\u00e4\3\2\2\2\u00e3\u00e5\n\5\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\b\37\2\2\u00e9>\3\2\2\2\b\2s\u00c8\u00ce\u00d8\u00e6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}