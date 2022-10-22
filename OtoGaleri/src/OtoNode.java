
public class OtoNode { //tek tönlü dairesel yapý
	
	String plaka, marka, model, renk;
	int alisfiyati, satisfiyati;
	String aciklama;
	OtoNode next;
	public OtoNode(String plaka, String marka, String model, String renk, int alisfiyati, String aciklama) {
		this.plaka = plaka;
		this.marka = marka;
		this.model = model;
		this.renk = renk;
		this.alisfiyati = alisfiyati;
		this.satisfiyati = alisfiyati * 12/10;
		this.aciklama = aciklama;
	}
	
	
	

}
