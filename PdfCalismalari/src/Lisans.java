public class Lisans extends Ogrenci
{
    private int sinif; // 1, 2, 3 ve 4

    public Lisans ()
    {
        super ();
        sinif = 1;
    }
    public Lisans (String ilkIsim, int ilkOgrenciNo, int ilkSinif)
    {
        super (ilkIsim, ilkOgrenciNo);
        setSinif (ilkSinif); // Kontrol eder: 1 <= ilkSinif <= 4
    }
    public void reset (String yeniIsim, int yeniOgrenciNo, int yeniSinif)
    {
        reset (yeniIsim, yeniOgrenciNo); // Ogrenci sınıfındaki reset
        setSinif (yeniSinif); // Kontrol eder: 1 <= yeniSinif <= 4
    }
    public int getSinif ()
    {
        return sinif;
    }
    public void setSinif (int yeniSinif)
    {
        if ((1 <= yeniSinif) && (yeniSinif <= 4))
            sinif = yeniSinif;
        else
        {
            System.out.println ("Geçersiz sınıf!");
            System.exit (0);
        }
    }
    public void ciktiYazdir ()
    {
        super.ciktiYazdir ();
        System.out.println ("Öğrenci sınıfı: " + sinif);
    }
    public boolean equals (Lisans digerLisans)
    {
        return equals ((Ogrenci) digerLisans) && (this.sinif == digerLisans.sinif);
    }
}
