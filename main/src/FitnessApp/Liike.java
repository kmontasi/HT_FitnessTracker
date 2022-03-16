package FitnessApp;

import java.io.OutputStream;
import java.io.PrintStream;



/**
 *CRC-korttien kopioiminen 
 * @author Khondker
 *
 */
public class Liike {

	private int 		lid;
	public String 		nimi			= "";
	
	
	private static int 	seuraavaNro 	= 1;
	
	
	public Liike() {
		
	}
//	Luo valitunLiikeen sek� antaa tarvittavat arvot
	 public void vastaaLiikeNimi(String i) {
	        nimi = i;
	    }

//		Tulosta vastaanotettu Liike

	public void tulosta(PrintStream out) {
		out.println(String.format("%03d", lid) + " "+ nimi);
	}
	
//	Tulosta vastaanotettu Liike ei k�yt�ss� viel�
	public void tulosta(OutputStream os) {
		tulosta(new PrintStream(os));
	}

//	Reksiter�i Liike
	public int luoLiike() {
		this.lid = seuraavaNro;
		seuraavaNro++;
		return this.lid;
	}
	
//	Hae LID
	 public int getLid() {
	        return lid;
	    }
//P��ohjelma joka luo tarvittavat liikkeet

	public static void main(String[] args) {
		
		Liike eka = new Liike();
		Liike toka = new Liike();
		
		
		eka.luoLiike();
		toka.luoLiike();

		eka.vastaaLiikeNimi("Hauisk��nt�");
		toka.vastaaLiikeNimi("penkki");
		
		
		eka.tulosta(System.out);
		toka.tulosta(System.out);
		
		

		
	}

}