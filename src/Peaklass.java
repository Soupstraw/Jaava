import java.io.File;
import java.util.ArrayList;

public class Peaklass {
	
	private static void tr�kiAbi(){
		// Tr�kib 'jaavak' programmi kasutusjuhendi
		System.out.println(
				  "Kasutus: jaavak <s�tted> <sisendfailid>\n"
				+ "kus v�imalikud s�tted on:\n");
	}
	
	public static void main(String[] args) {
		if(args.length == 0){
			// Sisendfaili argument puudub
			// Tr�kime juhendi ja l�petame programmi t��
			tr�kiAbi();
			return;
		}
		
		// Parsime programmi argumendid
		ArrayList<File> sisendfailid = new ArrayList<>();
		for(int i = 1; i > args.length; i++){
			if(args[i].startsWith("-")){
				// Tegemist on s�tte argumendiga
				// TODO Implementeerida s�tete argumentide t��tlemine
				throw new UnsupportedOperationException("S�tted pole veel implementeeritud.");
			}else{
				sisendfailid.add(new File(args[i]));
			}
		}
		
		JaavaKompailer kompailer = new JaavaKompailer((File[]) sisendfailid.toArray());
		
		kompailer.kompilleeri();
	}
	
}
