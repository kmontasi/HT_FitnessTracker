package FitnessApp;
/**
 *CRC-korttien kopioiminen 
 * @author Khondker
 *
 */
public class Treenit {

	private static final int MAX_ALKIO  = 1;
	private int              lkm           = 0;
	private String           tiedostonNimi = "";
	private Treeni         alkiot[]      = new Treeni[MAX_ALKIO];

	public int getLkm() {
	        return lkm;
	}

//	uusi alkio
	public Treenit() {
		alkiot = new Treeni[MAX_ALKIO];
	}
	

    /**
     * Lis�� uuden treeni tietorakenteeseen.  Ottaa treenin omistukseensa.
     * @param treenin lis�t��v�n treenin viite.  Huom tietorakenne muuttuu omistajaksi
     * @example
     * <pre name="test">
     * 
     * Treenit treenit = new Treenit();
     * Treeni eka = new Treeni();
     * Treeni toka = new Treeni();
     * treenit.getLkm() === 0;
     * eka.luoTreeni();
     * treenit.lisaa(eka);
     * treenit.getLkm() === 1;
     * toka.luoTreeni();
     * treenit.lisaa(toka);
     *treenit.getLkm() === 2;
     * eka.luoTreeni(); 
     * treenit.lisaa(eka);
     * treenit.getLkm() === 3;
     * treenit.anna(0) === eka;
     * treenit.anna(1) === toka;
     * treenit.anna(2) === eka;
     * treenit.anna(1) == eka === false;
     * treenit.anna(1) == toka === true;
     * </pre>
     */

	 public void lisaa(Treeni treeni) {
		 if(lkm >=alkiot.length) uusiAlkio();
		 this.alkiot[this.lkm] = treeni;
		 lkm++;
	 }
//	 Uuden alkion lis��minen jos liian lyhyt ja t�yttyy
	public void uusiAlkio() { 
		Treeni newArr[] = new Treeni[alkiot.length+1];
		 for (int i = 0; i < alkiot.length; i++)
	            newArr[i] = alkiot[i];
		  alkiot = newArr;
		  
		}
//l�yd� haluttu alkio. ei k�yt�ss�
	 public Treeni anna(int i) throws IndexOutOfBoundsException {
	        if (i < 0 || lkm <= i)
	            throw new IndexOutOfBoundsException("Laiton indeksi: " + i);
	        return alkiot[i];
	    }

// p��ohjelma joka tuo tarvittavat Treenit. Luonti rekister�ityminen sek� lis��minen tapahtuu Treenit aliohjelman kautta. 
	public static void main(String[] args) {
		Treenit treenit = new Treenit();
		
		Treeni eka = new Treeni();
		Treeni toka = new Treeni();
		
		eka.luoTreeni();
		toka.luoTreeni();
		eka.vastaaAkunTreeni();
		toka.vastaaAkunTreeni();


		
		treenit.lisaa(eka);
		treenit.lisaa(eka);
		treenit.lisaa(toka);
		
		System.out.println("============= J�senet testi =================");

        for (int i = 0; i < treenit.getLkm(); i++) {
        	Treeni treeni = treenit.anna(i);
            System.out.println("alkio: " + i);
            treeni.tulosta(System.out);
        }


	}

}
