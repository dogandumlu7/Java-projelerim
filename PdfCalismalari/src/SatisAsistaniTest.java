public class SatisAsistaniTest {
    public static void main(String[] args) {
//        // Varsayılan kurucu ile nesne oluşturma
//        SatisAsistani asistan1 = new SatisAsistani();
//        asistan1.veriCikisiYazdir();
//
//        // Parametreli kurucu ile nesne oluşturma
//        SatisAsistani asistan2 = new SatisAsistani("Ayşe", 1500);
//        asistan2.veriCikisiYazdir();
//
//        // Kullanıcıdan veri alarak yeni nesne oluşturma
//        SatisAsistani asistan3 = new SatisAsistani();
//        asistan3.veriGirisiOku();
//        asistan3.veriCikisiYazdir();







        SatisRaporu satisRaporu = new SatisRaporu();
        satisRaporu.getVeri();
        satisRaporu.istatistikHesapla();
        satisRaporu.sonuclariGoruntule();

    }
}
