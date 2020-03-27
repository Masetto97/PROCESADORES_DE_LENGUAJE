package core.identities;

import java.util.ArrayList;

public class Input {
	private String identifier;

	public Input(String identifier) {
		this.identifier = identifier;
	}
	
	public String getIdentifier() {
		return this.identifier;
	}
	
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	

	public void check(ArrayList<Input> iptl) throws SemanticException {
		for(Input ipt : iptl) {			
			if(ipt.getIdentifier().equals(this.identifier)) {
				throw new SemanticException("input name already in use");
			}
		}
	}
}
