package core.identities;

/**
 * 
 */
import java.util.ArrayList;
/**
 * @author sergio
 *
 */
public class Automaton {

	private String identifier;
	private ArrayList<State> stateList;
	private String initial;
	private ArrayList<Input> inputs;
	private ArrayList<Transition> transitionList;

	public Automaton(String id, ArrayList<State> states, String initial, ArrayList<Input> inputs, ArrayList<Transition> transitions) {
		this.identifier = id;
		this.stateList = states;
		this.initial = initial;
		this.inputs = inputs;
		this.transitionList = transitions;
	} 

	
	public String getIdentifier() {
		return this.identifier;
	}
	
	public void setIdentifier(String id) {
		this.identifier = id;
	}
	
	public String getInitial() {
		return this.initial;
	}
	
	public void setInitial(String initial) {
		this.initial = initial;
	}
	
	public ArrayList<State> getStates(){
		return this.stateList;
	}
	
	public State getState(int i){
		return this.stateList.get(i);
	}
	
	public void setStates(ArrayList<State> states){
		this.stateList = states;
	}
	
	public ArrayList<Transition> getTransitions(){
		return this.transitionList;
	}
	
	public void setTransitions(ArrayList<Transition> transitions) {
		this.transitionList = transitions;
	}
	
	
	public String toString() {
		String str= "";
		str = "Automaton\n\tIdentificador: " + this.identifier + "\n\tInitial: " + this.initial;
		
		if(this.stateList != null){
			str += "\n\tEstado/Outputs: " + this.stateList.toString();
		}
		
		if(this.inputs != null) {
			str += "\n\tInputs: " + this.inputs.toString();
		}
		
		if(this.transitionList != null) {
			str += "\n\tTransitions:\n\t: " + this.transitionList.toString();
		}
		
		return str;
	}


	public void checkInitial() throws SemanticException {
		boolean check = false;
		
		for(State st : this.stateList) {				
			if(st.getIdentifier().equals(this.initial)) {
				check = true;
			}
		}
		if(!check){
			throw new SemanticException("initial state does not exists");
		}
	}

	public void checkTransition() throws SemanticException {
		boolean checkCurrent = false;
		boolean checkEvent = false;
		boolean checkNext = false;

		for(Transition tstn : this.transitionList) {
			checkCurrent = false;
			checkEvent = false;
			checkNext = false;
			for(State st : this.stateList) {
				if(st.getIdentifier().equals(tstn.getCurrent())) {
					checkCurrent = true;
				}
	
				if(st.getIdentifier().equals(tstn.getNext())) {
					checkNext = true;
				}
			}

			for(Input ip : this.inputs) {
				if(ip.getIdentifier().equals(tstn.getEvent())) {
					checkEvent = true;
				}
			}		
			if(!checkCurrent) {
				throw new SemanticException("current state does not exists");	
			}
			if(!checkEvent) {
				throw new SemanticException("input does not exists");				
			}
			if(!checkNext){
				throw new SemanticException("next state does not exists");
			}
		}
	}

}
