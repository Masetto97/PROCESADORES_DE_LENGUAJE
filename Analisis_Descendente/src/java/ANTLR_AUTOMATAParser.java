// Generated from src/resources/ANTLR_AUTOMATA.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANTLR_AUTOMATAParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_import_stmt = 1, RULE_import_name = 2, RULE_import_from = 3, 
		RULE_dotted_as_names = 4, RULE_dotted_as_name = 5, RULE_dotted_name = 6, 
		RULE_import_as_name = 7, RULE_import_as_names = 8, RULE_environment_statement = 9, 
		RULE_outputs_stmt = 10, RULE_output_stmt = 11, RULE_outputs_code = 12, 
		RULE_automaton_stmt = 13, RULE_states_outputs_stmt = 14, RULE_state_output_stmt = 15, 
		RULE_initial_state = 16, RULE_alphabet_input_stmt = 17, RULE_input_identifier = 18, 
		RULE_transitions_stmt = 19, RULE_transition_stmt = 20;
	public static final String[] ruleNames = {
		"program", "import_stmt", "import_name", "import_from", "dotted_as_names", 
		"dotted_as_name", "dotted_name", "import_as_name", "import_as_names", 
		"environment_statement", "outputs_stmt", "output_stmt", "outputs_code", 
		"automaton_stmt", "states_outputs_stmt", "state_output_stmt", "initial_state", 
		"alphabet_input_stmt", "input_identifier", "transitions_stmt", "transition_stmt"
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

	@Override
	public String getGrammarFileName() { return "ANTLR_AUTOMATA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ANTLR_AUTOMATAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Outputs_stmtContext outputs_stmt() {
			return getRuleContext(Outputs_stmtContext.class,0);
		}
		public Automaton_stmtContext automaton_stmt() {
			return getRuleContext(Automaton_stmtContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ANTLR_AUTOMATAParser.EOF, 0); }
		public List<Import_stmtContext> import_stmt() {
			return getRuleContexts(Import_stmtContext.class);
		}
		public Import_stmtContext import_stmt(int i) {
			return getRuleContext(Import_stmtContext.class,i);
		}
		public List<Environment_statementContext> environment_statement() {
			return getRuleContexts(Environment_statementContext.class);
		}
		public Environment_statementContext environment_statement(int i) {
			return getRuleContext(Environment_statementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import || _la==From) {
				{
				{
				setState(42);
				import_stmt();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Environment) {
				{
				{
				setState(48);
				environment_statement();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			outputs_stmt();
			setState(55);
			automaton_stmt();
			setState(56);
			match(EOF);
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

	public static class Import_stmtContext extends ParserRuleContext {
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public Import_fromContext import_from() {
			return getRuleContext(Import_fromContext.class,0);
		}
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterImport_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitImport_stmt(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_import_stmt);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				import_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				import_from();
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

	public static class Import_nameContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(ANTLR_AUTOMATAParser.Import, 0); }
		public Dotted_as_namesContext dotted_as_names() {
			return getRuleContext(Dotted_as_namesContext.class,0);
		}
		public TerminalNode Punto_y_coma() { return getToken(ANTLR_AUTOMATAParser.Punto_y_coma, 0); }
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterImport_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitImport_name(this);
		}
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_import_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(Import);
			setState(63);
			dotted_as_names();
			setState(64);
			match(Punto_y_coma);
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

	public static class Import_fromContext extends ParserRuleContext {
		public TerminalNode From() { return getToken(ANTLR_AUTOMATAParser.From, 0); }
		public List<TerminalNode> Punto() { return getTokens(ANTLR_AUTOMATAParser.Punto); }
		public TerminalNode Punto(int i) {
			return getToken(ANTLR_AUTOMATAParser.Punto, i);
		}
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode Import() { return getToken(ANTLR_AUTOMATAParser.Import, 0); }
		public TerminalNode Asterisco() { return getToken(ANTLR_AUTOMATAParser.Asterisco, 0); }
		public TerminalNode Punto_y_coma() { return getToken(ANTLR_AUTOMATAParser.Punto_y_coma, 0); }
		public TerminalNode Par_izquierdo() { return getToken(ANTLR_AUTOMATAParser.Par_izquierdo, 0); }
		public Import_as_namesContext import_as_names() {
			return getRuleContext(Import_as_namesContext.class,0);
		}
		public TerminalNode Par_derecho() { return getToken(ANTLR_AUTOMATAParser.Par_derecho, 0); }
		public Import_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterImport_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitImport_from(this);
		}
	}

	public final Import_fromContext import_from() throws RecognitionException {
		Import_fromContext _localctx = new Import_fromContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_import_from);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(From);
				setState(67);
				match(Punto);
				setState(68);
				dotted_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(From);
				setState(70);
				match(Punto);
				setState(71);
				match(Punto);
				setState(72);
				dotted_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(From);
				setState(74);
				dotted_name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				match(From);
				setState(76);
				match(Punto);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				match(From);
				setState(78);
				match(Punto);
				setState(79);
				match(Punto);
				setState(80);
				match(Import);
				setState(81);
				match(Asterisco);
				setState(82);
				match(Punto_y_coma);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				match(Import);
				setState(84);
				match(Par_izquierdo);
				setState(85);
				import_as_names();
				setState(86);
				match(Par_derecho);
				setState(87);
				match(Punto_y_coma);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				match(Import);
				setState(90);
				import_as_names();
				setState(91);
				match(Punto_y_coma);
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

	public static class Dotted_as_namesContext extends ParserRuleContext {
		public Dotted_as_nameContext dotted_as_name() {
			return getRuleContext(Dotted_as_nameContext.class,0);
		}
		public TerminalNode Coma() { return getToken(ANTLR_AUTOMATAParser.Coma, 0); }
		public Import_as_nameContext import_as_name() {
			return getRuleContext(Import_as_nameContext.class,0);
		}
		public Dotted_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterDotted_as_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitDotted_as_names(this);
		}
	}

	public final Dotted_as_namesContext dotted_as_names() throws RecognitionException {
		Dotted_as_namesContext _localctx = new Dotted_as_namesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dotted_as_names);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				dotted_as_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				dotted_as_name();
				setState(97);
				match(Coma);
				setState(98);
				import_as_name();
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

	public static class Dotted_as_nameContext extends ParserRuleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(ANTLR_AUTOMATAParser.AS, 0); }
		public TerminalNode Identifier() { return getToken(ANTLR_AUTOMATAParser.Identifier, 0); }
		public Dotted_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterDotted_as_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitDotted_as_name(this);
		}
	}

	public final Dotted_as_nameContext dotted_as_name() throws RecognitionException {
		Dotted_as_nameContext _localctx = new Dotted_as_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dotted_as_name);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				dotted_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				dotted_name();
				setState(104);
				match(AS);
				setState(105);
				match(Identifier);
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

	public static class Dotted_nameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ANTLR_AUTOMATAParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ANTLR_AUTOMATAParser.Identifier, i);
		}
		public TerminalNode Punto() { return getToken(ANTLR_AUTOMATAParser.Punto, 0); }
		public Dotted_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterDotted_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitDotted_name(this);
		}
	}

	public final Dotted_nameContext dotted_name() throws RecognitionException {
		Dotted_nameContext _localctx = new Dotted_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dotted_name);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(Identifier);
				setState(111);
				match(Punto);
				setState(112);
				match(Identifier);
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

	public static class Import_as_nameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ANTLR_AUTOMATAParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ANTLR_AUTOMATAParser.Identifier, i);
		}
		public TerminalNode AS() { return getToken(ANTLR_AUTOMATAParser.AS, 0); }
		public Import_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterImport_as_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitImport_as_name(this);
		}
	}

	public final Import_as_nameContext import_as_name() throws RecognitionException {
		Import_as_nameContext _localctx = new Import_as_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_import_as_name);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(Identifier);
				setState(117);
				match(AS);
				setState(118);
				match(Identifier);
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

	public static class Import_as_namesContext extends ParserRuleContext {
		public List<Import_as_nameContext> import_as_name() {
			return getRuleContexts(Import_as_nameContext.class);
		}
		public Import_as_nameContext import_as_name(int i) {
			return getRuleContext(Import_as_nameContext.class,i);
		}
		public TerminalNode Coma() { return getToken(ANTLR_AUTOMATAParser.Coma, 0); }
		public Import_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterImport_as_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitImport_as_names(this);
		}
	}

	public final Import_as_namesContext import_as_names() throws RecognitionException {
		Import_as_namesContext _localctx = new Import_as_namesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_import_as_names);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				import_as_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				import_as_name();
				setState(123);
				match(Coma);
				setState(124);
				import_as_name();
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

	public static class Environment_statementContext extends ParserRuleContext {
		public TerminalNode Environment() { return getToken(ANTLR_AUTOMATAParser.Environment, 0); }
		public TerminalNode Code() { return getToken(ANTLR_AUTOMATAParser.Code, 0); }
		public TerminalNode Punto_y_coma() { return getToken(ANTLR_AUTOMATAParser.Punto_y_coma, 0); }
		public TerminalNode Identifier() { return getToken(ANTLR_AUTOMATAParser.Identifier, 0); }
		public Environment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterEnvironment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitEnvironment_statement(this);
		}
	}

	public final Environment_statementContext environment_statement() throws RecognitionException {
		Environment_statementContext _localctx = new Environment_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_environment_statement);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(Environment);
				setState(129);
				match(Code);
				setState(130);
				match(Punto_y_coma);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(Environment);
				setState(132);
				match(Identifier);
				setState(133);
				match(Punto_y_coma);
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

	public static class Outputs_stmtContext extends ParserRuleContext {
		public TerminalNode Outputs() { return getToken(ANTLR_AUTOMATAParser.Outputs, 0); }
		public TerminalNode Llave_izquierda() { return getToken(ANTLR_AUTOMATAParser.Llave_izquierda, 0); }
		public TerminalNode Llave_derecha() { return getToken(ANTLR_AUTOMATAParser.Llave_derecha, 0); }
		public List<Output_stmtContext> output_stmt() {
			return getRuleContexts(Output_stmtContext.class);
		}
		public Output_stmtContext output_stmt(int i) {
			return getRuleContext(Output_stmtContext.class,i);
		}
		public Outputs_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputs_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterOutputs_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitOutputs_stmt(this);
		}
	}

	public final Outputs_stmtContext outputs_stmt() throws RecognitionException {
		Outputs_stmtContext _localctx = new Outputs_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_outputs_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(Outputs);
			setState(137);
			match(Llave_izquierda);
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				output_stmt();
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(143);
			match(Llave_derecha);
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

	public static class Output_stmtContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ANTLR_AUTOMATAParser.Identifier, 0); }
		public TerminalNode Doble_Punto() { return getToken(ANTLR_AUTOMATAParser.Doble_Punto, 0); }
		public Outputs_codeContext outputs_code() {
			return getRuleContext(Outputs_codeContext.class,0);
		}
		public TerminalNode Punto_y_coma() { return getToken(ANTLR_AUTOMATAParser.Punto_y_coma, 0); }
		public Output_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterOutput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitOutput_stmt(this);
		}
	}

	public final Output_stmtContext output_stmt() throws RecognitionException {
		Output_stmtContext _localctx = new Output_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_output_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(Identifier);
			setState(146);
			match(Doble_Punto);
			setState(147);
			outputs_code();
			setState(148);
			match(Punto_y_coma);
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

	public static class Outputs_codeContext extends ParserRuleContext {
		public TerminalNode Code() { return getToken(ANTLR_AUTOMATAParser.Code, 0); }
		public Outputs_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputs_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterOutputs_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitOutputs_code(this);
		}
	}

	public final Outputs_codeContext outputs_code() throws RecognitionException {
		Outputs_codeContext _localctx = new Outputs_codeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_outputs_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(Code);
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

	public static class Automaton_stmtContext extends ParserRuleContext {
		public TerminalNode Automaton() { return getToken(ANTLR_AUTOMATAParser.Automaton, 0); }
		public TerminalNode Identifier() { return getToken(ANTLR_AUTOMATAParser.Identifier, 0); }
		public TerminalNode Llave_izquierda() { return getToken(ANTLR_AUTOMATAParser.Llave_izquierda, 0); }
		public States_outputs_stmtContext states_outputs_stmt() {
			return getRuleContext(States_outputs_stmtContext.class,0);
		}
		public Initial_stateContext initial_state() {
			return getRuleContext(Initial_stateContext.class,0);
		}
		public Transitions_stmtContext transitions_stmt() {
			return getRuleContext(Transitions_stmtContext.class,0);
		}
		public TerminalNode Llave_derecha() { return getToken(ANTLR_AUTOMATAParser.Llave_derecha, 0); }
		public Alphabet_input_stmtContext alphabet_input_stmt() {
			return getRuleContext(Alphabet_input_stmtContext.class,0);
		}
		public Automaton_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automaton_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterAutomaton_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitAutomaton_stmt(this);
		}
	}

	public final Automaton_stmtContext automaton_stmt() throws RecognitionException {
		Automaton_stmtContext _localctx = new Automaton_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_automaton_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(Automaton);
			setState(153);
			match(Identifier);
			setState(154);
			match(Llave_izquierda);
			setState(155);
			states_outputs_stmt();
			setState(156);
			initial_state();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inputs) {
				{
				setState(157);
				alphabet_input_stmt();
				}
			}

			setState(160);
			transitions_stmt();
			setState(161);
			match(Llave_derecha);
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

	public static class States_outputs_stmtContext extends ParserRuleContext {
		public TerminalNode States() { return getToken(ANTLR_AUTOMATAParser.States, 0); }
		public TerminalNode Llave_izquierda() { return getToken(ANTLR_AUTOMATAParser.Llave_izquierda, 0); }
		public TerminalNode Llave_derecha() { return getToken(ANTLR_AUTOMATAParser.Llave_derecha, 0); }
		public List<State_output_stmtContext> state_output_stmt() {
			return getRuleContexts(State_output_stmtContext.class);
		}
		public State_output_stmtContext state_output_stmt(int i) {
			return getRuleContext(State_output_stmtContext.class,i);
		}
		public States_outputs_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_states_outputs_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterStates_outputs_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitStates_outputs_stmt(this);
		}
	}

	public final States_outputs_stmtContext states_outputs_stmt() throws RecognitionException {
		States_outputs_stmtContext _localctx = new States_outputs_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_states_outputs_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(States);
			setState(164);
			match(Llave_izquierda);
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				state_output_stmt();
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(170);
			match(Llave_derecha);
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

	public static class State_output_stmtContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ANTLR_AUTOMATAParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ANTLR_AUTOMATAParser.Identifier, i);
		}
		public TerminalNode Coma() { return getToken(ANTLR_AUTOMATAParser.Coma, 0); }
		public TerminalNode Punto_y_coma() { return getToken(ANTLR_AUTOMATAParser.Punto_y_coma, 0); }
		public State_output_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_output_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterState_output_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitState_output_stmt(this);
		}
	}

	public final State_output_stmtContext state_output_stmt() throws RecognitionException {
		State_output_stmtContext _localctx = new State_output_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_state_output_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(Identifier);
			setState(173);
			match(Coma);
			setState(174);
			match(Identifier);
			setState(175);
			match(Punto_y_coma);
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

	public static class Initial_stateContext extends ParserRuleContext {
		public TerminalNode Initial() { return getToken(ANTLR_AUTOMATAParser.Initial, 0); }
		public TerminalNode Identifier() { return getToken(ANTLR_AUTOMATAParser.Identifier, 0); }
		public TerminalNode Punto_y_coma() { return getToken(ANTLR_AUTOMATAParser.Punto_y_coma, 0); }
		public Initial_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterInitial_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitInitial_state(this);
		}
	}

	public final Initial_stateContext initial_state() throws RecognitionException {
		Initial_stateContext _localctx = new Initial_stateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_initial_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(Initial);
			setState(178);
			match(Identifier);
			setState(179);
			match(Punto_y_coma);
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

	public static class Alphabet_input_stmtContext extends ParserRuleContext {
		public TerminalNode Inputs() { return getToken(ANTLR_AUTOMATAParser.Inputs, 0); }
		public TerminalNode Punto_y_coma() { return getToken(ANTLR_AUTOMATAParser.Punto_y_coma, 0); }
		public List<Input_identifierContext> input_identifier() {
			return getRuleContexts(Input_identifierContext.class);
		}
		public Input_identifierContext input_identifier(int i) {
			return getRuleContext(Input_identifierContext.class,i);
		}
		public Alphabet_input_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphabet_input_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterAlphabet_input_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitAlphabet_input_stmt(this);
		}
	}

	public final Alphabet_input_stmtContext alphabet_input_stmt() throws RecognitionException {
		Alphabet_input_stmtContext _localctx = new Alphabet_input_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_alphabet_input_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(Inputs);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				input_identifier();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Coma || _la==Identifier );
			setState(187);
			match(Punto_y_coma);
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

	public static class Input_identifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ANTLR_AUTOMATAParser.Identifier, 0); }
		public TerminalNode Coma() { return getToken(ANTLR_AUTOMATAParser.Coma, 0); }
		public Input_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterInput_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitInput_identifier(this);
		}
	}

	public final Input_identifierContext input_identifier() throws RecognitionException {
		Input_identifierContext _localctx = new Input_identifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_input_identifier);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(Identifier);
				}
				break;
			case Coma:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(Coma);
				setState(191);
				match(Identifier);
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

	public static class Transitions_stmtContext extends ParserRuleContext {
		public TerminalNode Transitions() { return getToken(ANTLR_AUTOMATAParser.Transitions, 0); }
		public TerminalNode Llave_izquierda() { return getToken(ANTLR_AUTOMATAParser.Llave_izquierda, 0); }
		public TerminalNode Llave_derecha() { return getToken(ANTLR_AUTOMATAParser.Llave_derecha, 0); }
		public TerminalNode Punto_y_coma() { return getToken(ANTLR_AUTOMATAParser.Punto_y_coma, 0); }
		public List<Transition_stmtContext> transition_stmt() {
			return getRuleContexts(Transition_stmtContext.class);
		}
		public Transition_stmtContext transition_stmt(int i) {
			return getRuleContext(Transition_stmtContext.class,i);
		}
		public Transitions_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitions_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterTransitions_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitTransitions_stmt(this);
		}
	}

	public final Transitions_stmtContext transitions_stmt() throws RecognitionException {
		Transitions_stmtContext _localctx = new Transitions_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_transitions_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(Transitions);
			setState(195);
			match(Llave_izquierda);
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				transition_stmt();
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Par_izquierdo );
			setState(201);
			match(Llave_derecha);
			setState(202);
			match(Punto_y_coma);
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

	public static class Transition_stmtContext extends ParserRuleContext {
		public TerminalNode Par_izquierdo() { return getToken(ANTLR_AUTOMATAParser.Par_izquierdo, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ANTLR_AUTOMATAParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ANTLR_AUTOMATAParser.Identifier, i);
		}
		public TerminalNode Coma() { return getToken(ANTLR_AUTOMATAParser.Coma, 0); }
		public TerminalNode Par_derecho() { return getToken(ANTLR_AUTOMATAParser.Par_derecho, 0); }
		public TerminalNode Flecha() { return getToken(ANTLR_AUTOMATAParser.Flecha, 0); }
		public TerminalNode Punto_y_coma() { return getToken(ANTLR_AUTOMATAParser.Punto_y_coma, 0); }
		public Transition_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).enterTransition_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLR_AUTOMATAListener ) ((ANTLR_AUTOMATAListener)listener).exitTransition_stmt(this);
		}
	}

	public final Transition_stmtContext transition_stmt() throws RecognitionException {
		Transition_stmtContext _localctx = new Transition_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_transition_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(Par_izquierdo);
			setState(205);
			match(Identifier);
			setState(206);
			match(Coma);
			setState(207);
			match(Identifier);
			setState(208);
			match(Par_derecho);
			setState(209);
			match(Flecha);
			setState(210);
			match(Identifier);
			setState(211);
			match(Punto_y_coma);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00d8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3?\n\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\3\b\5\bt"+
		"\n\b\3\t\3\t\3\t\3\t\5\tz\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u0089\n\13\3\f\3\f\3\f\6\f\u008e\n\f\r\f"+
		"\16\f\u008f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00a1\n\17\3\17\3\17\3\17\3\20\3\20\3\20\6\20\u00a9\n"+
		"\20\r\20\16\20\u00aa\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\6\23\u00ba\n\23\r\23\16\23\u00bb\3\23\3\23\3\24\3\24\3"+
		"\24\5\24\u00c3\n\24\3\25\3\25\3\25\6\25\u00c8\n\25\r\25\16\25\u00c9\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\2\2\27"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\2\2\u00d7\2/\3\2\2\2"+
		"\4>\3\2\2\2\6@\3\2\2\2\b_\3\2\2\2\nf\3\2\2\2\fm\3\2\2\2\16s\3\2\2\2\20"+
		"y\3\2\2\2\22\u0080\3\2\2\2\24\u0088\3\2\2\2\26\u008a\3\2\2\2\30\u0093"+
		"\3\2\2\2\32\u0098\3\2\2\2\34\u009a\3\2\2\2\36\u00a5\3\2\2\2 \u00ae\3\2"+
		"\2\2\"\u00b3\3\2\2\2$\u00b7\3\2\2\2&\u00c2\3\2\2\2(\u00c4\3\2\2\2*\u00ce"+
		"\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\65\3"+
		"\2\2\2\61/\3\2\2\2\62\64\5\24\13\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3"+
		"\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\5\26\f\29:\5\34\17\2"+
		":;\7\2\2\3;\3\3\2\2\2<?\5\6\4\2=?\5\b\5\2><\3\2\2\2>=\3\2\2\2?\5\3\2\2"+
		"\2@A\7\24\2\2AB\5\n\6\2BC\7\13\2\2C\7\3\2\2\2DE\7\27\2\2EF\7\4\2\2F`\5"+
		"\16\b\2GH\7\27\2\2HI\7\4\2\2IJ\7\4\2\2J`\5\16\b\2KL\7\27\2\2L`\5\16\b"+
		"\2MN\7\27\2\2N`\7\4\2\2OP\7\27\2\2PQ\7\4\2\2QR\7\4\2\2RS\7\24\2\2ST\7"+
		"\17\2\2T`\7\13\2\2UV\7\24\2\2VW\7\b\2\2WX\5\22\n\2XY\7\7\2\2YZ\7\13\2"+
		"\2Z`\3\2\2\2[\\\7\24\2\2\\]\5\22\n\2]^\7\13\2\2^`\3\2\2\2_D\3\2\2\2_G"+
		"\3\2\2\2_K\3\2\2\2_M\3\2\2\2_O\3\2\2\2_U\3\2\2\2_[\3\2\2\2`\t\3\2\2\2"+
		"ag\5\f\7\2bc\5\f\7\2cd\7\16\2\2de\5\20\t\2eg\3\2\2\2fa\3\2\2\2fb\3\2\2"+
		"\2g\13\3\2\2\2hn\5\16\b\2ij\5\16\b\2jk\7\20\2\2kl\7\33\2\2ln\3\2\2\2m"+
		"h\3\2\2\2mi\3\2\2\2n\r\3\2\2\2ot\7\33\2\2pq\7\33\2\2qr\7\4\2\2rt\7\33"+
		"\2\2so\3\2\2\2sp\3\2\2\2t\17\3\2\2\2uz\7\33\2\2vw\7\33\2\2wx\7\20\2\2"+
		"xz\7\33\2\2yu\3\2\2\2yv\3\2\2\2z\21\3\2\2\2{\u0081\5\20\t\2|}\5\20\t\2"+
		"}~\7\16\2\2~\177\5\20\t\2\177\u0081\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2"+
		"\2\2\u0081\23\3\2\2\2\u0082\u0083\7\23\2\2\u0083\u0084\7\22\2\2\u0084"+
		"\u0089\7\13\2\2\u0085\u0086\7\23\2\2\u0086\u0087\7\33\2\2\u0087\u0089"+
		"\7\13\2\2\u0088\u0082\3\2\2\2\u0088\u0085\3\2\2\2\u0089\25\3\2\2\2\u008a"+
		"\u008b\7\30\2\2\u008b\u008d\7\t\2\2\u008c\u008e\5\30\r\2\u008d\u008c\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\7\n\2\2\u0092\27\3\2\2\2\u0093\u0094\7\33\2"+
		"\2\u0094\u0095\7\5\2\2\u0095\u0096\5\32\16\2\u0096\u0097\7\13\2\2\u0097"+
		"\31\3\2\2\2\u0098\u0099\7\22\2\2\u0099\33\3\2\2\2\u009a\u009b\7\21\2\2"+
		"\u009b\u009c\7\33\2\2\u009c\u009d\7\t\2\2\u009d\u009e\5\36\20\2\u009e"+
		"\u00a0\5\"\22\2\u009f\u00a1\5$\23\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\5(\25\2\u00a3\u00a4\7\n\2\2\u00a4"+
		"\35\3\2\2\2\u00a5\u00a6\7\31\2\2\u00a6\u00a8\7\t\2\2\u00a7\u00a9\5 \21"+
		"\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\n\2\2\u00ad\37\3\2\2\2\u00ae"+
		"\u00af\7\33\2\2\u00af\u00b0\7\16\2\2\u00b0\u00b1\7\33\2\2\u00b1\u00b2"+
		"\7\13\2\2\u00b2!\3\2\2\2\u00b3\u00b4\7\25\2\2\u00b4\u00b5\7\33\2\2\u00b5"+
		"\u00b6\7\13\2\2\u00b6#\3\2\2\2\u00b7\u00b9\7\26\2\2\u00b8\u00ba\5&\24"+
		"\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\13\2\2\u00be%\3\2\2\2\u00bf"+
		"\u00c3\7\33\2\2\u00c0\u00c1\7\16\2\2\u00c1\u00c3\7\33\2\2\u00c2\u00bf"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\'\3\2\2\2\u00c4\u00c5\7\32\2\2\u00c5"+
		"\u00c7\7\t\2\2\u00c6\u00c8\5*\26\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\7\n\2\2\u00cc\u00cd\7\13\2\2\u00cd)\3\2\2\2\u00ce\u00cf\7\b\2\2"+
		"\u00cf\u00d0\7\33\2\2\u00d0\u00d1\7\16\2\2\u00d1\u00d2\7\33\2\2\u00d2"+
		"\u00d3\7\7\2\2\u00d3\u00d4\7\3\2\2\u00d4\u00d5\7\33\2\2\u00d5\u00d6\7"+
		"\13\2\2\u00d6+\3\2\2\2\22/\65>_fmsy\u0080\u0088\u008f\u00a0\u00aa\u00bb"+
		"\u00c2\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}