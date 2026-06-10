public class Kisi
{
    private String isim;
    public Kisi ()
    {
        isim = "Henüz isim yok";
    }


    public Kisi (String ilkIsim)
    {
        isim = ilkIsim;
    }


    public void setIsim (String yeniIsim)
    {
        isim = yeniIsim;
    }


    public String getIsim ()
    {
        return isim;
    }


    public void ciktiYazdir ()
    {
        System.out.println ("İsim: " + isim);
    }


    public boolean ayniIsimMi (Kisi digerKisi)
    {
        return this.isim.equalsIgnoreCase (digerKisi.isim);
    }
}
