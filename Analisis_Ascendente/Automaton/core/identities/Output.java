package core.identities;

public class Output {
	private String id_output;
	private String code;
	
	public Output(String id, String code) {
		this.id_output = id;
		this.code = realing(code);
	}
	
	public String getId_output() {
		return this.id_output;
	}
	
	public String getcode() {
		return this.code;
	}
	
	public void setId_output(String id){
		this.id_output = id;
	}
	
	public void setcode(String code){
		this.code = code;
	}
	
	public String toString() {
		String str = this.id_output;
		
		if(this.code!=null){
			return str + " CODE: \n" + this.code;
		}
		return str;
	}
	// TODO the method.
	private String realing(String code) {
		String str_realing = code;
		return str_realing; 
	}
}
