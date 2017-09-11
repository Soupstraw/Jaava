import java.io.File;
import java.util.ArrayList;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class JaavaKompailer {
	
	private File[] sisendfailid;
	
	public JaavaKompailer(File[] sisendfailid){
		this.sisendfailid = sisendfailid;
	}
	
	// Võtab sisendiks programmi lähtekoodi jaava keeles ja salvestab 
	public void kompilleeri(){
		JavaCompiler kompailer = ToolProvider.getSystemJavaCompiler();
	}
	
	

}
