public class FaizTablosu {
    public static void main (String [] args) {
        int [] [] tablo = new int [10] [6];
        for (int satir = 0 ; satir < 10 ; satir++)
            for (int sutun = 0 ; sutun < 6 ; sutun++)
                tablo [satir] [sutun] = getBakiye (1000.00, satir + 1, (5 + 0.5 * sutun));
        System.out.println ("Farklı Yıllık Faiz Oranları için Tasarruf Hesabı Bakiyesi");
        System.out.println ("(1000 TL Üzerinden)");
        System.out.println ();
        System.out.println ("Yıllar 5.00% 5.50% 6.00% 6.50% 7.00% 7.50%");
        for (int satir = 0 ; satir < 10 ; satir++)
        {
            if(satir >= 9){
                System.out.print (" " + (satir + 1) + "    ");
            }
            else {
                System.out.print (" " + (satir + 1) + "     ");
            }
            for (int sutun = 0 ; sutun < 6 ; sutun++)
                System.out.print (tablo [satir] [sutun] + "  ");
            System.out.println ();
        }
    }
    public static int getBakiye (double baslangicBakiye, int yil, double oran)
    {
        double calisanBakiye = baslangicBakiye;
        for (int sayac = 1 ; sayac <= yil ; sayac++)
            calisanBakiye = calisanBakiye * (1 + oran / 100);
        return (int) (Math.round (calisanBakiye));
    }
}
