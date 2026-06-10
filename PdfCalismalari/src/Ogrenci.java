public class Ogrenci extends Kisi
{
    private int ogrenciNo;
    public Ogrenci ()
    {
        super ();
        ogrenciNo = 0; // Henüz öğrenci numarası yok
    }
    public Ogrenci (String ilkIsim, int ilkOgrenciNo)
    {
        super(ilkIsim);
        ogrenciNo = ilkOgrenciNo;
    }
    public void reset (String yeniIsim, int yeniOgrenciNo)
    {
        setIsim (yeniIsim);
        ogrenciNo = yeniOgrenciNo;
    }
    public int getOgrenciNo ()
    {
        return ogrenciNo;
    }
    public void setOgrenciNo (int yeniOgrenciNo )
    {
        ogrenciNo = yeniOgrenciNo;
    }
    public void ciktiYazdir ()
    {
//        super.ciktiYazdir();
        System.out.println ("İsim: " + getIsim ());
        System.out.println ("Öğrenci numarası: " + ogrenciNo);
    }
    public boolean equals (Ogrenci digerOgrenci)
    {
        return this.ayniIsimMi (digerOgrenci) && (this.ogrenciNo == digerOgrenci.ogrenciNo);
    }




    public boolean equals (Object digerNesne)
    {
        boolean esitMi = false;
        if ((digerNesne != null) && (digerNesne instanceof Ogrenci))
        {
            Ogrenci digerOgrenci = (Ogrenci) digerNesne;
            esitMi = this.ayniIsimMi (digerOgrenci) && (this.ogrenciNo == digerOgrenci.ogrenciNo);
        }
        return esitMi;
    }


}

