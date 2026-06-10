public class Main {
    public static int enkucuk = 0;
    public static void main(String[] args) {

        int [] d = {1,-3,432,56,-4,7,9,-87,4,2,1,4,7,54,312,56,-2,64,566,35,65 };
        int dizi = 04;

        int index = insonraki(d,dizi);
        System.out.println( dizi + " sayısından itibaren en küçük sayı " + index + ". inextedir ve " + Main.enkucuk + " sayıdır. " );



    }



    public static int insonraki(int[] d, int indeks) {
        int enkucuk = d[indeks];
        int enkucukindex = indeks;

        if(indeks==d.length-1){
            Main.enkucuk = d[d.length-1];
        }
        for (int i = indeks; i < d.length; i++) {
            if(enkucuk > d[i]) {
                Main.enkucuk = d[i];
                enkucukindex = i;
            }
        }

        return enkucukindex;
    }
}
