import java.util.Scanner;

public class Rehber {
	
	private Kayit [] telRehber = new Kayit[100];
	private static int kayitSayisi= 0;
	
	public void KayitEkle(String ad, String soyAd, String telNo) {
		if (kayitSayisi <= telRehber.length){
			telRehber[kayitSayisi] = new Kayit(ad,soyAd,telNo);
			kayitSayisi++;
		}

		else {
		System.out.println("Rehber dolu, Kayıt yapılamadı.");
		}
	}

	public void KayitBul(String ad, String soyAd, String telNo) {
		boolean abc = false;
		int var = 0;
		for (int i = 0; i< kayitSayisi; i++){
			if(telRehber[i].getAd().equalsIgnoreCase(ad) && telRehber[i].getSoyAd().equalsIgnoreCase(soyAd) && telRehber[i].getTelNo().equalsIgnoreCase(telNo)){
				var = i;
				abc = true;
			}
		}
		if(abc){
			System.out.println("Kayıt bulundu. Kişi kaydı şu şekilde: \n   " +
					"Ad: " + telRehber[var].getAd() + "\n   "+
					"Soyad: " + telRehber[var].getSoyAd() + "\n   " +
					"Telefon numarası: " + telRehber[var].getTelNo());
		}
		else {
			System.out.println("Kayıt bulunamadı.");
		}
	}

	public void KayitSil(String telNo) {
		int k = 0;
		int [] kacKisi = new int[100];
		int index = 0;
		for (int i = 0; i< kayitSayisi; i++){
			boolean varmı = telRehber[i].getTelNo().equalsIgnoreCase(telNo);
			if (varmı){
				kacKisi[k] = i;
				k ++;
				if(k == 1){
					System.out.println("Aradığınız numarada kayıtlı kişiler: ");
					index = i;
				}
				System.out.println(k + ") " +
						"Ad: " + telRehber[i].getAd() + "\n   "+
						"Soyad: " + telRehber[i].getSoyAd() +"\n   "  +
						"Telefon numarası: " + telRehber[i].getTelNo() + "\n" );
			}
		}
		if(k == 1){
			String bb = telRehber[index].getAd();
			telRehber[index] = telRehber[kayitSayisi-1];
			telRehber[kayitSayisi-1] = null;
			System.out.println(bb + " Kişisi silindi.");
			kayitSayisi--;
		}
		else if (k>1){
			Scanner scanner = new Scanner(System.in);
			System.out.print("Hangi kişiyi silmek istersin (1,2,3..): ");
			int ss = scanner.nextInt();
			String aa = telRehber[kacKisi[ss-1]].getAd();
			telRehber[kacKisi[ss-1]] = telRehber[kayitSayisi-1];
			telRehber[kayitSayisi-1] = null;
			System.out.println(aa + " Kişisi silindi.");
			kayitSayisi--;
		}
		
	}
	
	public void KayitlariGoruntule() {
		System.out.println("Toplam kayıtlı kişi sayısı: " + kayitSayisi + "\n--------------------------");
		for(int i = 0; i < kayitSayisi; i++){
			System.out.println("  " +
					"Ad: " + telRehber[i].getAd() + "\n  "+
					"Soyad: " + telRehber[i].getSoyAd() + "\n  " +
					"Telefon numarası: " + telRehber[i].getTelNo() + "\n--------------------------");
		}
		
	}	
}
