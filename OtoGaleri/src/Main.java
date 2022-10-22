import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		BagliListe Liste = new BagliListe();
		
		int secim = -1;
		while (secim !=0) {
			System.out.println("1- ekle");
			System.out.println("2- sil");
			System.out.println("3- yazdir");
			System.out.println("4- ara");
			System.out.println("0- çýk");
			System.out.println("seçiminiz: ");
			
			secim = scan.nextInt();

			switch(secim) {
			
			case 1 : Liste.ekle(); break;
			case 2 : Liste.sil(); break;
			case 3 : Liste.yazdir(); break;
			case 4 : Liste.aracAra(); break;
			case 0 : System.out.println("çýkýþ"); break;
			default: System.out.println("hatalý seçim."); break;

			}
			
		}
	
	}

}
