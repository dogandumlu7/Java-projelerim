public class DortIslem {

    public int toplama (int sayı1, int sayı2) {
        return sayı1 + sayı2;
    }

    public int cıkarma(int sayı1, int sayı2) {
        return sayı1 - sayı2;
    }

    public int carpma(int sayı1, int sayı2) {
        return sayı1 * sayı2;
    }

    public String bolme(int sayı1, int sayı2) {
        if (sayı2 == 0) {
           return  "Payda 0 olamaz: lütfen yeniden deneyin.";
        }
        else {
            String abc = (sayı1 / sayı2) + "";
            return abc;
        }

    }









}
