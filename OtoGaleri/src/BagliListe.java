import java.util.Scanner;

public class BagliListe {

	Scanner scan = new Scanner(System.in);

	OtoNode head = null;
	OtoNode tail = null;

	String plaka, marka, model, renk;
	int alisfiyati, satisfiyati;
	String aciklama;

	void ekle() {

		System.out.println("Galeriye eklenecek otomobilin bilgilerini giriniz.");
		System.out.println("Plaka     		: ");
		plaka = scan.nextLine();
		System.out.println("Marka     		: ");
		marka = scan.nextLine();
		System.out.println("Model     		: ");
		model = scan.nextLine();
		System.out.println("Renk     		: ");
		renk = scan.nextLine();
		System.out.println("alisFiyat     	: ");
		alisfiyati = scan.nextInt();
		scan.nextLine();
		System.out.println("A��klama     		: ");
		aciklama = scan.nextLine();

		OtoNode arac = new OtoNode(plaka, marka, model, renk, alisfiyati, aciklama);

		if (head == null) {

			head = arac;
			tail = arac;
			tail.next = head;
			System.out.println(plaka + "plakal� ara� galeriye eklendi.");
		} else {
			arac.next = head;
			head = arac;
			tail.next = head;
			System.out.println(plaka + "plakal� ara� galeriye eklendi.");

		}
	}

	void sil() {
			
			if (head == null) {
				
				System.out.println("Galeride ara� yok.");
				
			}
			else {
			if (head == tail && head.plaka.equals(plaka) ) {
				
				
				head = null;
				tail = null;
				System.out.println(plaka + " plakal� ara� "+ head.satisfiyati +" TL'ye sat�ld�.");
				
				
			}
			else if (head != tail && head.plaka.equals(plaka) ) {
				
				System.out.println(plaka + " plakal� ara� "+ head.satisfiyati +" TL'ye sat�ld�.");
				head = head.next;
				tail = head;
				
				
			}
			else {
				OtoNode temp = head;
				OtoNode temp2 = temp;
				
				while (temp != tail) {
				
				if (temp.plaka.equals(plaka)) {
					
					temp2.next = temp.next ;
					System.out.println(plaka + " plakal� ara�" + temp.satisfiyati +" TL'ye satildi.");
				}
				temp2= temp;
				temp = temp.next;
			}
				if (temp.plaka.equals(plaka)) {
					System.out.println(plaka+ " plakal� ara� "+ temp.satisfiyati +" TL'ye satildi.");
					tail = temp2;
					tail.next= head;
				}

			}
			
		}
	}

	
	void yazdir() {
		
		if (head == null) {
			System.out.println("sistemde arac yok.");
		}
		else {
			System.out.println("Plaka\tMarka\tModel\tRenk\tAl�� Fiyat�\tSat�� Fiyat�\tA��klama");
			
			OtoNode temp = head;
			while (temp != tail) {
				System.out.println(temp.plaka +"\t"+temp.marka+ "\t"+ temp.model+"\t"+temp.renk+"\t"+temp.alisfiyati+"\t"+temp.satisfiyati+"\t"+temp.aciklama);
					temp = temp.next;
			}				
			System.out.println(temp.plaka +"\t"+temp.marka+ "\t"+ temp.model+"\t"+temp.renk+"\t"+temp.alisfiyati+"\t"+temp.satisfiyati+"\t"+temp.aciklama);

		
		}
	}
	
	void aracAra() {
		
		if (head == null) {
			
			System.out.println("Galeride ara� yok.");
			
		}
		else {
			
			boolean sonuc = false;
			System.out.println("Arad���n�z arac�n plakas�: ");
		
			OtoNode temp = head;
			OtoNode temp2 = head;
			
			while(temp != tail) {
				
				if (temp.plaka.equals(plaka)) {
					
					temp2 = temp;
					
				}
				temp = temp.next;
			
		}
			if (temp.plaka.equals(plaka)){
				
				temp2 = temp;
				sonuc = true;
				
			}
			
			if (sonuc == false) {
				System.out.println("plakal arac sistemde kayitli de�il");
			}
			else {
				System.out.println(plaka + " plakal� arac�n bilgileri:");
				System.out.println("marka 			: "+ temp2.marka);
				System.out.println("model 			: "+ temp2.model);
				System.out.println("renk 			: "+ temp2.renk);
				System.out.println("Al�� Fiyat� 	: "+ temp2.alisfiyati);
				System.out.println("Sat�� Fiyat� 	: "+ temp.satisfiyati);
				System.out.println("A��klama		: "+ temp2.aciklama);

			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
