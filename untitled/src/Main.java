import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Bir üs: ");
//        int dortgenBırUst = scanner.nextInt();
//
//        System.out.print("Bir alt: ");
//        int dortgenBırAlt = scanner.nextInt();
//
//        System.out.print("Bir sağ: ");
//        int dortgenBırSag = scanner.nextInt();
//
//        System.out.print("Bir sol: ");
//        int dortgenBırSol =  scanner.nextInt();
//
//
//
//
//        System.out.print("İki üs:");
//        int dortgenIkıUst = scanner.nextInt();
//
//        System.out.print("İki alt:");
//        int dortgenIkıAlt = scanner.nextInt();
//
//        System.out.print("İki sağ:");
//        int dortgenIkıSag = scanner.nextInt();
//
//        System.out.print("İki sol:");
//        int dortgenIkıSol = scanner.nextInt();
//
//
//
//
//        if(dortgenBırUst > dortgenIkıUst && dortgenBırAlt < dortgenIkıUst && dortgenIkıSag > dortgenBırSag && dortgenIkıSol < dortgenBırSag) {
//
//            System.out.println("Dörtgenler 2 yerde kesişiyor.");
//            System.out.println("kesiştiği noktalar: (" + dortgenBırSag + "," + dortgenIkıAlt + ")" + " ve (" + dortgenBırSag + "," + dortgenIkıUst + ")");
//
//        }
//
//
//
//        else if (dortgenBırUst > dortgenIkıUst && dortgenBırAlt < dortgenIkıUst && dortgenIkıSag > dortgenBırSol && dortgenIkıSag < dortgenBırSag) {
//
//            System.out.println("Dörtgenler 2 yerde kesişiyor.");
//            System.out.println("kesiştiği noktalar: (" + dortgenBırSol + "," + dortgenIkıAlt + ")" + " ve (" + dortgenBırSol + "," + dortgenIkıUst + ")");
//
//        }
//
//
//
//        else if (dortgenIkıUst>dortgenBırUst && dortgenBırUst>dortgenIkıAlt && dortgenIkıSag>dortgenBırSag && dortgenBırSag>dortgenIkıSol) {
//
//            System.out.println("Dörtgenler 2 yerde kesişiyor.");
//            System.out.println("kesiştiği noktalar: (" + dortgenBırSag + "," + dortgenIkıAlt + ")" + " ve (" + dortgenIkıSol + "," + dortgenBırUst + ")");
//
//        }
//
//
//
//        else if (dortgenIkıUst>dortgenBırUst && dortgenBırUst>dortgenIkıAlt && dortgenIkıSag>dortgenBırSol && dortgenBırSol>dortgenIkıSol) {
//
//            System.out.println("Dörtgenler 2 yerde kesişiyor.");
//            System.out.println("kesiştiği noktalar: (" + dortgenIkıSag + "," + dortgenBırUst + ")" + "ve" + dortgenBırSol + "," + dortgenIkıAlt + ")");
//
//        }
//
//        else if (dortgenIkıAlt == dortgenBırUst && dortgenBırAlt != dortgenIkıUst && dortgenBırSag != dortgenIkıSag && dortgenBırSol != dortgenIkıSol ) {
//
//            System.out.println(String.format("Dörtgenler 1 yerde örtüşüyor: y = (%s)", dortgenBırUst));
//
//        }
//
//
//        else if (dortgenIkıUst == dortgenBırAlt && dortgenBırUst != dortgenIkıAlt && dortgenBırSag != dortgenIkıSag && dortgenBırSol != dortgenIkıSol ) {
//
//            System.out.println(String.format("Dörtgenler 1 yerde örtüşüyor: y = (%s)", dortgenBırAlt));
//
//        }
//
//
//
//        else if (dortgenIkıSol == dortgenBırSag && dortgenBırSol != dortgenIkıSag && dortgenBırUst != dortgenIkıUst && dortgenBırAlt != dortgenIkıAlt) {
//
//            System.out.println(String.format("Dörtgenler 1 yerde örtüşüyor: x = (%s)", dortgenBırSag));
//
//        }
//
//
//        else if (dortgenIkıSag == dortgenBırSol && dortgenBırSag != dortgenIkıSol && dortgenBırUst != dortgenIkıUst && dortgenBırAlt != dortgenIkıAlt) {
//
//            System.out.println(String.format("Dörtgenler 1 yerde örtüşüyor: x = (%s)", dortgenBırSol));
//
//        }
//
//        else if (dortgenBırSag>dortgenIkıSag && dortgenIkıSol>dortgenBırSol && dortgenBırUst != dortgenIkıUst && dortgenBırAlt != dortgenIkıAlt) {
//
//            System.out.println(String.format("Dörtgenler 4 yerde kesişiyor: (%d,%d),(%d,%d),(%d,%d),(%d.%d)", dortgenIkıSol,dortgenBırUst,dortgenIkıSag,dortgenBırUst,dortgenIkıSol,dortgenBırAlt,dortgenIkıSag,dortgenBırAlt));
//
//        }
//
//
//        else if (dortgenBırUst>dortgenIkıUst && dortgenIkıAlt>dortgenBırAlt && dortgenBırSag != dortgenIkıSag && dortgenBırSol != dortgenIkıSol) {
//
//            System.out.println(String.format("Dörtgenler 4 yerde kesişiyor: (%d,%d),(%d,%d),(%d,%d),(%d.%d)", dortgenBırSol,dortgenIkıUst,dortgenBırSag,dortgenIkıUst,dortgenBırSol,dortgenIkıAlt,dortgenBırSag,dortgenIkıAlt));
//
//        }
//
//
//        else if (dortgenBırUst==dortgenIkıUst && dortgenBırSag==dortgenIkıSag && dortgenBırAlt==dortgenIkıAlt && dortgenBırSol==dortgenIkıSol) {
//
//            System.out.println("Dörtgenler birebir örtüşüyor.");
//        }
//
//
//        else if(dortgenIkıUst > dortgenBırUst && dortgenIkıAlt < dortgenBırUst && dortgenBırSag > dortgenIkıSag && dortgenBırSol < dortgenIkıSag) {
//
//            System.out.println("Dörtgenler 2 yerde kesişiyor.");
//            System.out.println("kesiştiği noktalar: (" + dortgenIkıSag + "," + dortgenBırAlt + ")" + " ve (" + dortgenIkıSag + "," + dortgenBırUst + ")");
//
//        }
//
//
//
//        else if (dortgenIkıUst > dortgenBırUst && dortgenIkıAlt < dortgenBırUst && dortgenBırSag > dortgenIkıSol && dortgenBırSag < dortgenIkıSag) {
//
//            System.out.println("Dörtgenler 2 yerde kesişiyor.");
//            System.out.println("kesiştiği noktalar: (" + dortgenBırSag + "," + dortgenIkıAlt + ")" + "ve" + dortgenIkıSol + "," + dortgenBırUst + ")");
//
//        }
//
//
//
//        else if (dortgenBırUst>dortgenIkıUst && dortgenIkıUst>dortgenBırAlt && dortgenBırSag>dortgenIkıSag && dortgenIkıSag>dortgenBırSol) {
//
//            System.out.println("Dörtgenler 2 yerde kesişiyor.");
//            System.out.println("kesiştiği noktalar: (" + dortgenIkıSag + "," + dortgenBırAlt + ")" + "ve" + dortgenBırSol + "," + dortgenIkıUst + ")");
//
//        }
//
//
//
//        else if (dortgenBırUst>dortgenIkıUst && dortgenIkıUst>dortgenBırAlt && dortgenBırSag>dortgenIkıSol && dortgenIkıSol>dortgenBırSol) {
//
//            System.out.println("Dörtgenler 2 yerde kesişiyor.");
//            System.out.println("kesiştiği noktalar: (" + dortgenBırSag + "," + dortgenIkıUst + ")" + "ve" + dortgenIkıSol + "," + dortgenBırAlt + ")");
//
//        }
//
//        else if (dortgenBırAlt == dortgenIkıUst && dortgenIkıAlt != dortgenBırUst && dortgenIkıSag != dortgenBırSag && dortgenIkıSol != dortgenBırSol ) {
//
//            System.out.println(String.format("Dörtgenler 1 yerde örtüşüyor: y = (%s)", dortgenIkıUst));
//
//        }
//
//
//        else if (dortgenBırUst == dortgenIkıAlt && dortgenIkıUst != dortgenBırAlt && dortgenIkıSag != dortgenBırSag && dortgenIkıSol != dortgenBırSol ) {
//
//            System.out.println(String.format("Dörtgenler 1 yerde örtüşüyor: y = (%s)", dortgenIkıAlt));
//
//        }
//
//
//
//        else if (dortgenBırSol == dortgenIkıSag && dortgenIkıSol != dortgenBırSag && dortgenIkıUst != dortgenBırUst && dortgenIkıAlt != dortgenBırAlt) {
//
//            System.out.println(String.format("Dörtgenler 1 yerde örtüşüyor: x = (%s)", dortgenIkıSag));
//
//        }
//
//
//        else if (dortgenBırSag == dortgenIkıSol && dortgenIkıSag != dortgenBırSol && dortgenIkıUst != dortgenBırUst && dortgenIkıAlt != dortgenBırAlt) {
//
//            System.out.println(String.format("Dörtgenler 1 yerde örtüşüyor: x = (%s)", dortgenIkıSol));
//
//        }
//
//        else if (dortgenIkıSag>dortgenBırSag && dortgenBırSol>dortgenIkıSol && dortgenIkıUst != dortgenBırUst && dortgenIkıAlt != dortgenBırAlt) {
//
//            System.out.println(String.format("Dörtgenler 4 yerde kesişiyor: (%d,%d),(%d,%d),(%d,%d),(%d.%d)", dortgenBırSol,dortgenIkıUst,dortgenBırSag,dortgenIkıUst,dortgenBırSol,dortgenIkıAlt,dortgenBırSag,dortgenIkıAlt));
//
//        }
//
//
//        else if (dortgenIkıUst>dortgenBırUst && dortgenBırAlt>dortgenIkıAlt && dortgenIkıSag != dortgenBırSag && dortgenIkıSol != dortgenBırSol) {
//
//            System.out.println(String.format("Dörtgenler 4 yerde kesişiyor: (%d,%d),(%d,%d),(%d,%d),(%d.%d)", dortgenIkıSol,dortgenBırUst,dortgenIkıSag,dortgenBırUst,dortgenIkıSol,dortgenBırAlt,dortgenIkıSag,dortgenBırAlt));
//
//        }
//
//
//        else if (dortgenIkıUst==dortgenBırUst && dortgenIkıSag==dortgenBırSag && dortgenIkıAlt==dortgenBırAlt && dortgenIkıSol==dortgenBırSol) {
//
//            System.out.println("Dörtgenler birebir örtüşüyor.");
//        }
//
//        else {
//            System.out.println("Dörtgenler kesişmiyor.");
//        }








//        int sayı1 = 0;
//        int sayı2 = 1;
//        int sonuc = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Kaçıncı indexten başlasın: ");
//        int basla = scanner.nextInt();
//
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.print("Kaçıncı indexte bitirsin: ");
//        int bıtır = scanner1.nextInt();
//
//        int x = 1;
//        Boolean calıs = true;
//        while(calıs) {
//
//            if (x >= basla) {
//                System.out.println(sonuc);
//                if (sayı1 == 0) {
//                    System.out.println(sayı2);
//                }
//            }
//
//
//            sonuc = sayı2 + sayı1;
//            sayı1 = sayı2;
//            sayı2 = sonuc;
//
//            x += 1;
//
//            if (x == bıtır) {
//                calıs = false;
//            }
//
//        }









//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Sesli ve sesiz harfleri ayır: ");
//        String gırdı = scanner.nextLine();
//
//        System.out.print("Sesli harfler: ");
//        for (int i = 0; i < gırdı.length(); i++) {
//
//            char harf = gırdı.charAt(i);
//            switch (harf) {
//                case 'a':
//                case 'e':
//                case 'ı':
//                case 'i':
//                case 'o':
//                case 'ö':
//                case 'u':
//                case 'ü':
//                case 'A':
//                case 'E':
//                case 'I':
//                case 'İ':
//                case 'O':
//                case 'Ö':
//                case 'U':
//                case 'Ü':
//                    System.out.print(harf + " ");
//                    break;
//                case ' ':
//                    break;
//                default: {
//                    break;
//                }
//            }
//        }
//
//
//
//        System.out.println("");
//        System.out.print("Sesiz harfler: ");
//        for (int i = 0; i < gırdı.length(); i++){
//
//            char harf1 = gırdı.charAt(i);
//            switch (harf1) {
//                case 'a':
//                case 'e':
//                case 'ı':
//                case 'i':
//                case 'o':
//                case 'ö':
//                case 'u':
//                case 'ü':
//                case 'A':
//                case 'E':
//                case 'I':
//                case 'İ':
//                case 'O':
//                case 'Ö':
//                case 'U':
//                case 'Ü':
//                case ' ':
//                break;
//                default: {
//                    System.out.print(harf1 + " ");
//                }
//            }
//        }






//        int f = 5;
//        int fak = 1;
//        for (int x = 1; x <= f; x++) {
//            fak = fak * x;
//        }
//
//        System.out.println(fak);









//        Personel personel1 = new Personel();
//        personel1._name = "Doğan";
//        personel1._surname = "Dumlu";
//        personel1._egtimdurumu = "Lise mezunu";
//        personel1._unvan = "Bilgisayar Mühendisi";
//        personel1._personelno = 240706044;
//
//        Personel personel2 = new Personel();
//        personel2._name = "Selehattin";
//        personel2._surname = "Demirtaş";
//        personel2._egtimdurumu = "Üniversite mezunu";
//        personel2._unvan = "Avukat";
//        personel2._personelno = 24436001;
//
//        Personel personel3 = new Personel();
//        personel3._name = "Oktay";
//        personel3._surname = "Kaynarca";
//        personel3._egtimdurumu = "Üniversite mezunu";
//        personel3._unvan = "Sinema yönetimi";
//        personel3._personelno = 246401076;
//
//
//        Personel personel4 = new Personel();
//        personel4._name = "Halit";
//        personel4._surname = "Bilgiç";
//        personel4._egtimdurumu = "Lise mezunu";
//        personel4._unvan = "Şarkıcı";
//        personel4._personelno = 268384035;
//
//
//
//
//        System.out.println(
//                "PERSONEL1:" +
//                        "\n....................................." + "\n" +
//                        "İsim: " + personel1.get_name() + "\n" +
//                        "Soyisim: " + personel1.get_surname() + "\n" +
//                        "Eğtim durumu: " + personel1.get_egtimdurumu() + "\n" +
//                        "Unvanı: " + personel1.get_unvan() + "\n" +
//                        "Personel numarası: " + personel1.get_personelno() +
//                        "\n.....................................\n"  );
//
//
//        personel1.set_egtimdurumu("Üniversite, 2. sınıf Bilgisayar mühendisi");
//        personel1.set_unvan("Bilgisayar bilimcisi");
//
//
//        System.out.println(
//                "\n" +
//                "PERSONEL1:" +
//                        "\n....................................." + "\n" +
//                        "İsim: " + personel1.get_name() + "\n" +
//                        "Soyisim: " + personel1.get_surname() + "\n" +
//                        "Eğtim durumu: " + personel1.get_egtimdurumu() + "\n" +
//                        "Unvanı: " + personel1.get_unvan() + "\n" +
//                        "Personel numarası: " + personel1.get_personelno() +
//                        "\n....................................."  );


    }
}