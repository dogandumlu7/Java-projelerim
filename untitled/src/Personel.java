public class Personel {

    String _name;
    String _surname;
    int _tcno;
    String _egtimdurumu;
    String _dogumyeri;
    int _dogumyili;
    String _unvan;
    int _personelno;

    //getter
    public String get_name() {
        return _name;
    }

    public String get_surname() {
        return _surname;
    }

    public int get_personelno() {
        return _personelno;

    }

    public String get_egtimdurumu() {
        return _egtimdurumu;
    }

    public String get_unvan() {
        return _unvan;
    }




    //setter

    public void set_egtimdurumu(String egtimdurumu){
        _egtimdurumu = egtimdurumu;
        System.out.println("-->" + _name + ": Eğtim durumu değişti.");
    }

    public void set_unvan(String unvan){
        _unvan = unvan;
        System.out.println("-->" + _name + ": Unvanı değişti.");
    }






}
