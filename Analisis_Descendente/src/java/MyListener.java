import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyListener implements ANTLR_AUTOMATAListener{
    
	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
				
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		System.out.println("terminal: "+arg0.getText());
		
	}

	@Override
	public void enterProgram(ANTLR_AUTOMATAParser.ProgramContext ctx) {
//		int childCount = ctx.getChildCount();
//		for(int i=0; i<childCount;i++) {
//			System.out.println("token: "+ctx.getChild(i));
//		}
		
//		String text = ctx.getText();
//		System.out.println(text);
		
	}

	@Override
	public void exitProgram(ANTLR_AUTOMATAParser.ProgramContext ctx) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void exitDotted_as_names(ANTLR_AUTOMATAParser.Dotted_as_namesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDotted_name(ANTLR_AUTOMATAParser.Dotted_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDotted_name(ANTLR_AUTOMATAParser.Dotted_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnvironment_statement(ANTLR_AUTOMATAParser.Environment_statementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnvironment_statement(ANTLR_AUTOMATAParser.Environment_statementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterOutputs_stmt(ANTLR_AUTOMATAParser.Outputs_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitOutputs_stmt(ANTLR_AUTOMATAParser.Outputs_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterOutput_stmt(ANTLR_AUTOMATAParser.Output_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitOutput_stmt(ANTLR_AUTOMATAParser.Output_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterOutputs_code(ANTLR_AUTOMATAParser.Outputs_codeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitOutputs_code(ANTLR_AUTOMATAParser.Outputs_codeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAutomaton_stmt(ANTLR_AUTOMATAParser.Automaton_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAutomaton_stmt(ANTLR_AUTOMATAParser.Automaton_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStates_outputs_stmt(ANTLR_AUTOMATAParser.States_outputs_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStates_outputs_stmt(ANTLR_AUTOMATAParser.States_outputs_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterImport_stmt(ANTLR_AUTOMATAParser.Import_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitImport_stmt(ANTLR_AUTOMATAParser.Import_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterImport_name(ANTLR_AUTOMATAParser.Import_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitImport_name(ANTLR_AUTOMATAParser.Import_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterImport_from(ANTLR_AUTOMATAParser.Import_fromContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitImport_from(ANTLR_AUTOMATAParser.Import_fromContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterImport_as_name(ANTLR_AUTOMATAParser.Import_as_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitImport_as_name(ANTLR_AUTOMATAParser.Import_as_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDotted_as_name(ANTLR_AUTOMATAParser.Dotted_as_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDotted_as_name(ANTLR_AUTOMATAParser.Dotted_as_nameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterImport_as_names(ANTLR_AUTOMATAParser.Import_as_namesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitImport_as_names(ANTLR_AUTOMATAParser.Import_as_namesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDotted_as_names(ANTLR_AUTOMATAParser.Dotted_as_namesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterState_output_stmt(ANTLR_AUTOMATAParser.State_output_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitState_output_stmt(ANTLR_AUTOMATAParser.State_output_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInitial_state(ANTLR_AUTOMATAParser.Initial_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInitial_state(ANTLR_AUTOMATAParser.Initial_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAlphabet_input_stmt(ANTLR_AUTOMATAParser.Alphabet_input_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAlphabet_input_stmt(ANTLR_AUTOMATAParser.Alphabet_input_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTransitions_stmt(ANTLR_AUTOMATAParser.Transitions_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTransitions_stmt(ANTLR_AUTOMATAParser.Transitions_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTransition_stmt(ANTLR_AUTOMATAParser.Transition_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTransition_stmt(ANTLR_AUTOMATAParser.Transition_stmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInput_identifier(ANTLR_AUTOMATAParser.Input_identifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInput_identifier(ANTLR_AUTOMATAParser.Input_identifierContext ctx) {
		// TODO Auto-generated method stub
		
	}
	
}
