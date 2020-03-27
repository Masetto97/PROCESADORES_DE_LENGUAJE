// Generated from src/resources/ANTLR_AUTOMATA.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ANTLR_AUTOMATAParser}.
 */
public interface ANTLR_AUTOMATAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ANTLR_AUTOMATAParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ANTLR_AUTOMATAParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(ANTLR_AUTOMATAParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(ANTLR_AUTOMATAParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(ANTLR_AUTOMATAParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(ANTLR_AUTOMATAParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(ANTLR_AUTOMATAParser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(ANTLR_AUTOMATAParser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(ANTLR_AUTOMATAParser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(ANTLR_AUTOMATAParser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(ANTLR_AUTOMATAParser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(ANTLR_AUTOMATAParser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(ANTLR_AUTOMATAParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(ANTLR_AUTOMATAParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(ANTLR_AUTOMATAParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(ANTLR_AUTOMATAParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(ANTLR_AUTOMATAParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(ANTLR_AUTOMATAParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#environment_statement}.
	 * @param ctx the parse tree
	 */
	void enterEnvironment_statement(ANTLR_AUTOMATAParser.Environment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#environment_statement}.
	 * @param ctx the parse tree
	 */
	void exitEnvironment_statement(ANTLR_AUTOMATAParser.Environment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#outputs_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOutputs_stmt(ANTLR_AUTOMATAParser.Outputs_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#outputs_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOutputs_stmt(ANTLR_AUTOMATAParser.Outputs_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#output_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOutput_stmt(ANTLR_AUTOMATAParser.Output_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#output_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOutput_stmt(ANTLR_AUTOMATAParser.Output_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#outputs_code}.
	 * @param ctx the parse tree
	 */
	void enterOutputs_code(ANTLR_AUTOMATAParser.Outputs_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#outputs_code}.
	 * @param ctx the parse tree
	 */
	void exitOutputs_code(ANTLR_AUTOMATAParser.Outputs_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#automaton_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAutomaton_stmt(ANTLR_AUTOMATAParser.Automaton_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#automaton_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAutomaton_stmt(ANTLR_AUTOMATAParser.Automaton_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#states_outputs_stmt}.
	 * @param ctx the parse tree
	 */
	void enterStates_outputs_stmt(ANTLR_AUTOMATAParser.States_outputs_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#states_outputs_stmt}.
	 * @param ctx the parse tree
	 */
	void exitStates_outputs_stmt(ANTLR_AUTOMATAParser.States_outputs_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#state_output_stmt}.
	 * @param ctx the parse tree
	 */
	void enterState_output_stmt(ANTLR_AUTOMATAParser.State_output_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#state_output_stmt}.
	 * @param ctx the parse tree
	 */
	void exitState_output_stmt(ANTLR_AUTOMATAParser.State_output_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#initial_state}.
	 * @param ctx the parse tree
	 */
	void enterInitial_state(ANTLR_AUTOMATAParser.Initial_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#initial_state}.
	 * @param ctx the parse tree
	 */
	void exitInitial_state(ANTLR_AUTOMATAParser.Initial_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#alphabet_input_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlphabet_input_stmt(ANTLR_AUTOMATAParser.Alphabet_input_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#alphabet_input_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlphabet_input_stmt(ANTLR_AUTOMATAParser.Alphabet_input_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#input_identifier}.
	 * @param ctx the parse tree
	 */
	void enterInput_identifier(ANTLR_AUTOMATAParser.Input_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#input_identifier}.
	 * @param ctx the parse tree
	 */
	void exitInput_identifier(ANTLR_AUTOMATAParser.Input_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#transitions_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTransitions_stmt(ANTLR_AUTOMATAParser.Transitions_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#transitions_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTransitions_stmt(ANTLR_AUTOMATAParser.Transitions_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLR_AUTOMATAParser#transition_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTransition_stmt(ANTLR_AUTOMATAParser.Transition_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLR_AUTOMATAParser#transition_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTransition_stmt(ANTLR_AUTOMATAParser.Transition_stmtContext ctx);
}