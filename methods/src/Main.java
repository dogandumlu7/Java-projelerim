public class Main {
    public static void main(String[] args) {

        sayıArama(5);
        sayıArama(7);
        sayıArama(9);
        sayıArama(1);

    }


    public static void sayıArama(int aranacak) {
        int [] sayılar = new int [] {1, 2, 7, 8, 4, 3};
        boolean varmı = false;
        for (int i : sayılar) {
            if(i == aranacak) {
                varmı = true;
                break;
            }
        }if (varmı) {
            mesajVer("Listede " + aranacak + " sayısı vardır");

        } else
            mesajVer("Listede " + aranacak + " sayısı yoktur");
    }


    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }


}