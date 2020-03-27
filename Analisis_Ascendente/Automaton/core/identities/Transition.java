package core.identities;

/**
 * 
 */
import java.util.ArrayList;
/**
 * @author sergio
 *
 */
public class Transition {
	private String current;
	private String event;
	private String next;
	
	public Transition(String current, String event, String next) {
		this.current =  current;
		this.event = event;
		this.next = next;
	}
	
	
	public String getCurrent() {
		return this.current;
	}
	
	public void setCurrent(String current) {
		this.current = current;
	}
	
	
	public String getEvent() {
		return this.event;
	}
	
	public void setEvent(String event) {
		this.event = event;
	}
	
	
	
	public String getNext() {
		return this.next;
	}
	
	public void setNext(String next) {
		this.next = next;
	}
	
	
	public String toString() {
		return "(" + this.current + ", " + this.event + ") --> " + this.next;
	}


	public void check(ArrayList<Transition> tstnl) throws SemanticException {
		for(Transition tstn : tstnl) {			
			if(tstn.getCurrent().equals(this.current) && tstn.getEvent().equals(this.event)) {
				throw new SemanticException("transition already exists");
			}
		}
	}
}
