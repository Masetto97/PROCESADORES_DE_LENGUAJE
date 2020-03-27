package core.identities;
/**
 * 
 */
/**
 * @author Sergio Fernández-García
 *
 */
public class Import {
	private String importPath;
	private String alias;
	
	public Import(String importPath, String alias) {
		this.importPath= importPath;
		this.alias= alias;
	}
	
	public String getImportPath() {
		return this.importPath;
	}
	
	public String getAlias() {
		return this.alias;
	}
	
	public void setImportPath(String path){
		this.importPath = path;
	}
	
	public void setAlias(String alias){
		this.alias = alias;
	}
	
	public void concatPath(String slide){
		this.importPath.concat(slide);
	}
	
	public String toString() {
		String str = this.importPath;
		
		if(this.alias!=null){
			return str + " as " + this.alias;
		}
		return str;
	}
}
