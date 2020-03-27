package core.identities;

/**
 * 
 */
import java.util.ArrayList;
import java.util.Hashtable;
/**
 * @author sergio
 *
 */
public class Program {
	private ArrayList<Import> importList;
	private Environment env;
	private Hashtable<String,String> outputList;
	private Automaton automaton;
	
	public Program(ArrayList<Import> importList, Environment env, Hashtable<String,String> outputList, Automaton automaton){
		this.importList = importList;
		this.env = env;
		this.outputList= outputList;
		this.automaton = automaton;
	}
	
	public ArrayList<Import> getImportList(){
		return this.importList;
	}
	
	public void setImportList(ArrayList<Import> importList) {
		this.importList= importList;
	}
	
	
	public Environment getEnv() {
		return this.env;
	}
	
	public void setEnv(Environment env) {
		this.env = env;
	}
	
	
	public void addImport(Import imp) {
		this.importList.add(imp);
	}
	
	public void removeImport(Import imp) {
		this.importList.remove(imp);
	}
	
	
	public Hashtable<String,String> getOutputs(){
		return this.outputList;
	}
	
	public void setOutputs(Hashtable<String,String> outputs) {
		this.outputList = outputs;
	}
	
	
	public Automaton getAutomaton() {
		return this.automaton;
	}
	
	public void setAutomaton(Automaton automaton) {
		this.automaton = automaton;
	}
	
	
	public String toString() {
		String str="";
		if(importList != null) {
			for(Import imp: importList){
				str += imp.toString() + " \n"; 
			}
		}
		
		if(env != null) {
			str += (" \n" + env.toString());
		}
		
		if(outputList != null) {
			str += (" \n" + outputList.toString());
		}
		
		if(automaton != null) {
			str += (" \n" + this.automaton.toString());
		}
		
		return str;
	}


	public void checkState() throws SemanticException {
		for(State st : this.automaton.getStates()) {				
			if(this.outputList.get(st.getOutput()) == null) {
				throw new SemanticException("output does not exists");
			}
		}
	}
}
