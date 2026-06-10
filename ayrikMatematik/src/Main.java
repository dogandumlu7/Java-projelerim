//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] dizi = {1,2,3,5,6,7,9};

        for(int i = 0; i < dizi.length; i++){
            System.out.print(dizi[i] + " ");
        }
        System.out.println();

        dizi = diziyeEkle(dizi,0);
        dizi = diziyeEkle(dizi,4);
        dizi = diziyeEkle(dizi,8);
        dizi = diziyeEkle(dizi,10);

    }


    public static int[] diziyeEkle (int[] dizi,int eklenicekXSayısı){
        int[] yeniDizi = new int[dizi.length + 1];
        int sayac = 0;
        int t = 0;
        for (int sayı:dizi){
            if (eklenicekXSayısı > sayı){
                yeniDizi[sayac] = sayı;
                sayac++;
            }
            else {
                yeniDizi[dizi.length-t] = dizi[dizi.length-t-1];
                t++;
            }
        }
        yeniDizi[sayac] = eklenicekXSayısı;
        for (int i = 0; i < yeniDizi.length; i++){
            System.out.print(yeniDizi[i] + " ");
        }
        System.out.println();
        return yeniDizi;
    }
}

