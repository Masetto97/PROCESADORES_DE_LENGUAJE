package core.identities;

/**
 * 
 */
import java.util.ArrayList;
/**
 * @author sergio
 *
 */
public class State {
	private String identifier;
	private String output;
	
	public State(String id, String output) {
		this.identifier = id;
		this.output = output;
	}
	
	public String getIdentifier() {
		return this.identifier;
	}
	
	public void setIdentifier(String id) {
		this.identifier = id;
	}
	
	public String getOutput() {
		return this.output;
	}
	
	public void setOutput(String output) {
		this.output = output;
	}

	
	public String toString() {
		return "Estado " + this.identifier + " asociado con " + this.output;
	}

	public void check(ArrayList<State> stl) throws SemanticException {
		for(State st : stl) {			
			if(st.getIdentifier().equals(this.identifier)) {
				throw new SemanticException("state does not exists");
			}
		}
	}
}
