package core.identities;
/**
 * 
 */
/**
 * @author Sergio Fernández-García
 *
 */
public class Environment {
	private Boolean code;
	private String env;
	
	public Environment(Boolean code, String env) {
		
		if(code){
			this.env = realing(env);
		}else {
			this.env= env;
		}
		this.code = code;
		
	}
	
	public Boolean isCode() {
		return this.code;
	}
	
	public String getEnv() {
		return this.env;
	}
	
	public void setCode(Boolean b){
		this.code = b;
	}
	
	public void setEnv(String env){
		this.env = env;
	}

	public String toString() {
		String str = "Es codigo: " + this.code + "\n Env= \n" + this.env;
		return str;
	}
	
	// TODO the method
	private String realing(String env) {
		return env;
	}
}
