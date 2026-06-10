import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        musteriEkle();
        musteriGuncelle();
        musteriSil();

        String x = adSoyad();
        int y = topla(49,63);
        System.out.println(x);
        System.out.println(y);


        int sayılarToplamı =topla2(131,121,49,63,26,y);
        System.out.println(sayılarToplamı);
    }


    public static void musteriEkle() {
        System.out.println("Eklendi");

   }


    public static void musteriSil() {
        System.out.println("Silindi");

    }


    public static void musteriGuncelle() {
        System.out.println("Güncellendi");

    }


    public static int topla(int sayı1, int sayı2) {
        return sayı1 + sayı2;

    }


    public static String adSoyad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İsim: ");
        String ad = scanner.nextLine();

        System.out.print("soyisim: ");
        String soyad = scanner.nextLine();
        return ad + " " + soyad;
    }


    public static int topla2(int... sayılar) {
        int toplam = 0;
        for (int sayı:sayılar) {
            toplam += sayı;
        }
        return toplam;
    }


        /*
                   bundan sonrası: klasörlerde (Class-s, İnteriance...)
         */


}