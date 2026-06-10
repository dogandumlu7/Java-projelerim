import java.util.Scanner;
/**
 Satış raporu oluşturmak için program
 */
public class SatisRaporu {
    private double enYuksekSatis;
    private double ortalamaSatis;
    private SatisAsistani[] takim; // Dizi nesnesi getVeri metodunda oluşturulur.
    private int asistanSayisi;      // takim.length ile aynı değere sahip olur.

    /**
     * Satış asistanı sayısını ve her birisi için verileri okur.
     */
    public void getVeri() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Satış asistanı sayısını giriniz:");
        asistanSayisi = keyboard.nextInt();
        takim = new SatisAsistani[asistanSayisi + 1];
        for (int i = 1; i <= asistanSayisi; i++) {
            takim[i] = new SatisAsistani();
            System.out.println("Satış asistanı " + i + " için veri giriniz:");
            takim[i].veriGirisiOku();
            System.out.println();
        }
    }

    /**
     * Ortalamayı hesaplar ve en yüksek satışları belirler.
     * Ön koşul: En az bir SatisAsistani bulunmaktadır.
     */

    public void istatistikHesapla() {
        double digerSatis = takim[1].getSatis();
        enYuksekSatis = digerSatis;
        double toplam = digerSatis;
        for (int i = 2; i <= asistanSayisi; i++) {
            digerSatis = takim[i].getSatis();
            toplam = toplam + digerSatis;
            if (digerSatis > enYuksekSatis)
                enYuksekSatis = digerSatis; // şu ana kadar olan en yüksek satış
        }

        ortalamaSatis = toplam / asistanSayisi;

    }

    /**
     * Satış raporunu ekrana yazdırır.
     */
    public void sonuclariGoruntule() {
        System.out.println("Asistan başına ortalama satış: TL" + ortalamaSatis);
        System.out.println("En yüksek satış: TL" + enYuksekSatis);
        System.out.println();
        System.out.println("En yüksek satışlar aşağıda listelenmiştir:");

        for (int i = 1; i <= asistanSayisi; i++) {
            double digerSatis = takim[i].getSatis();
            if (digerSatis == enYuksekSatis) {
                takim[i].veriCikisiYazdir();
                System.out.println("TL" + (digerSatis - ortalamaSatis) + " kadar ortalamanın üzerinde");
                System.out.println();
            }
        }
        System.out.println("Diğer satışlar ise aşağıdaki gibidir:");
        for (int i = 1; i <= asistanSayisi; i++) {
            double digerSatis = takim[i].getSatis();
            if (takim[i].getSatis() != enYuksekSatis) {
                takim[i].veriCikisiYazdir();
                if (digerSatis >= ortalamaSatis)
                    System.out.println("TL" + (digerSatis - ortalamaSatis) + " kadar ortalamanın üzerinde");
                else
                    System.out.println("TL" + (ortalamaSatis - digerSatis) + " kadar ortalamanın altında");
                System.out.println();
            }
        }
    }
}

