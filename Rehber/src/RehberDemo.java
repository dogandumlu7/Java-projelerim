import java.util.Scanner;
public class RehberDemo {

	public static void main(String[] args) {
		
		Rehber rehber = new Rehber();
		
		int tercih = 0;
		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
			
			menuGoruntule();
			
			tercih = keyboard.nextInt();
			keyboard.nextLine();
			
			if(tercih == 1) {
				System.out.print("İsim: ");
				String ad = keyboard.nextLine();

				System.out.print("Soyad: ");
				String soyAd = keyboard.nextLine();

				System.out.print("Telefon numarası: ");
				String numara = keyboard.nextLine();
				rehber.KayitEkle(ad,soyAd,numara);

			}
			else if(tercih == 2) {
				System.out.print("Aramak istediğiniz kişinin isim: ");
				String ad = keyboard.nextLine();

				System.out.print("Aramak istediğiniz kişinin soyadı: ");
				String soyAd = keyboard.nextLine();

				System.out.print("Aramak istediğiniz kişinin telefon numarası: ");
				String numara = keyboard.nextLine();
				rehber.KayitBul(ad,soyAd,numara);
				
			}
			else if(tercih == 3) {
				System.out.print("Silmek istediğiniz kişinin telefon numarası: ");
				String numara = keyboard.nextLine();
				rehber.KayitSil(numara);
				
			}			
			else if(tercih == 4) {
				rehber.KayitlariGoruntule();
				
			}	
			else if(tercih == 5) {
				break;
			}	
			else {
				System.out.println("Yanlış tercih girdiniz lütfen 1 ve 5 arasında sayı giriniz.");
				
			}
			
		}		
	}
	
	public static void menuGoruntule() {
		System.out.println("\nTelefon Rehberi Seçenekleri:");
		System.out.println("1) Kayıt Ekle");
		System.out.println("2) Kayıt Bul");
		System.out.println("3) Kayıt Sil");
		System.out.println("4) Tüm Kayıtları Görüntüle");
		System.out.println("5) Çık\n");
		
		System.out.print("Tercihinizi giriniz: ");
	}

}
