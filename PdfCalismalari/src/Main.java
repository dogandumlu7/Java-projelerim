public class Main {
    public static void main(String[] args) {
//        int [] a = new int[3];
//        System.out.println(a[0] + " " + a[1] + " " + a[2]);
//        setDizi(a);
//        System.out.println(a[0] + " " + a[1] + " " + a[2]);




//        Kisi kisi1 = new Kisi("Doğan");
//        Kisi kisi2 = new Kisi("doğan");
//        boolean aynımı = kisi1.ayniIsimMi(kisi2);
//        kisi1.ciktiYazdir();
//        System.out.println(aynımı);





        Ogrenci ogrenci = new Ogrenci("Doğan",240706044);
        ogrenci.reset("Ayşe",240706042);
        Ogrenci ogrenci1 = new Ogrenci("Doğan",240706044);

        int number = ogrenci.getOgrenciNo();
        boolean aynımı1 = ogrenci.equals(ogrenci1);
        ogrenci.ciktiYazdir(); System.out.print("\n");
        System.out.println(number); System.out.print("\n");
        System.out.println(aynımı1); System.out.print("\n");





//        Lisans lisans1 = new Lisans();
//        Lisans lisans2 = new Lisans("Doğan", 240706044, 1);
//        lisans1.reset("Doğan",240706044,1);
//        lisans1.ciktiYazdir();
//        int sınıf = lisans1.getSinif();
//        boolean aynımı = lisans1.equals(lisans2);
//        System.out.println(sınıf);
//        System.out.println(aynımı);


//        Ogrenci kisi = new Ogrenci("Doğan",240);
//        Ogrenci kisi1 = new Ogrenci("Ayse",240);
//        Ogrenci kisi2 = new Ogrenci();
//        boolean c;
//        c = kisi.equals(kisi2);
//        System.out.println(c);



//        SatisAsistani[] takim1;
//        takim1 = new SatisAsistani[3];
//        takim1[1] = new SatisAsistani();
//        takim1[1].veriGirisiOku();
//        System.out.println(takim1[1].getIsim());

    }



    public static void setDizi(int[] Dizi){
        for(int i = 0; i<Dizi.length; i++){
            Dizi[i] = i;
        }
    }


}


