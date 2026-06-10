import java.util.Scanner;
public class SatisAsistani {
    private String isim;
    private double satis;

    public SatisAsistani() {
        isim = "Kayıt yok";
        satis = 0;
    }

    public SatisAsistani(String ilklendirIsim, double ilklendirSatis) {
        set(ilklendirIsim, ilklendirSatis);
    }

    public void set(String yeniIsim, double yeniSatis) {
        isim = yeniIsim;
        satis = yeniSatis;
    }

    public void veriGirisiOku() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Satış asistanının ismini giriniz: ");
        isim = keyboard.nextLine();
        System.out.print("Asistanın satışını giriniz: ");
        satis = keyboard.nextDouble();
        //keyboard.close(); // İsterseniz ekleyebilirsiniz ama sonra başka Scanner kullanamazsınız
    }

    public void veriCikisiYazdir() {
        System.out.println("İsim: " + isim);
        System.out.println("Satış:" + satis);
    }

    public String getIsim() {
        return isim;
    }

    public double getSatis() {
        return satis;
    }
}
