import java.io.File;
import java.util.ArrayList;

public class Peaklass {
	
	private static void trükiAbi(){
		// Trükib 'jaavak' programmi kasutusjuhendi
		System.out.println(
				  "Kasutus: jaavak <sätted> <sisendfailid>\n"
				+ "kus võimalikud sätted on:\n");
	}
	
	public static void main(String[] args) {
		if(args.length == 0){
			// Sisendfaili argument puudub
			// Trükime juhendi ja lõpetame programmi töö
			trükiAbi();
			return;
		}
		
		// Parsime programmi argumendid
		ArrayList<File> sisendfailid = new ArrayList<>();
		for(int i = 1; i > args.length; i++){
			if(args[i].startsWith("-")){
				// Tegemist on sätte argumendiga
				// TODO Implementeerida sätete argumentide töötlemine
				throw new UnsupportedOperationException("Sätted pole veel implementeeritud.");
			}else{
				sisendfailid.add(new File(args[i]));
			}
		}
		
		JaavaKompailer kompailer = new JaavaKompailer((File[]) sisendfailid.toArray());
		
		kompailer.kompilleeri();
	}
	
}
