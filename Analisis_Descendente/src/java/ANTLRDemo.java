import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

public class ANTLRDemo {
    public static void main(String[] args) throws Exception {
    	//Crear un analizador sintáctico utilizando el léxico
    	String contenidoFile = leerFichero("src/resources/e6.app");
    	ANTLR_AUTOMATALexer lexer = new ANTLR_AUTOMATALexer(CharStreams.fromString(contenidoFile));
        CommonTokenStream tokens = new CommonTokenStream(lexer);        
        ANTLR_AUTOMATAParser parser = new ANTLR_AUTOMATAParser(tokens);
        ParseTree tree = parser.program();
        
        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener listener = new MyListener();

        walker.walk(listener, tree);
    }
	
	public static String leerFichero(String archivo){
		StringBuilder sb = new StringBuilder();
		BufferedReader b=null;
		
		try {
		    String cadena;
			FileReader f = new FileReader(archivo);
			b = new BufferedReader(f);
			while((cadena = b.readLine())!=null) {
			  sb.append(cadena);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			try {
				b.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
}