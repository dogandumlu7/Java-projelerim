import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int a = 15;
//        if (--a<15){
//            System.out.println(a);
//        }
//        else {
//            System.out.println("0");
//        }


//        int i =21/5;
//        if (i < 6) {
//            while ((i > 10)){
//                i--;
//            }
//        } else if (i < 15) {
//            i = 100;
//        }
//        else {
//            i = 200;
//        }
//        System.out.println(i);


//        int i = 0;
//        for (i = 3 ; i>0 ; i--){
//            if(i==0)
//                break;
//        }
//        System.out.println(i);



//        int n;
//        int k = 0;
//        for(n=0; n<10; n++){
//            if(n<2){
//                continue;
//            }
//            k = n;
//        }
//        System.out.println(k);





//        int a = 1;
//        int b = 2;
//        while (a < 10) {
//            switch (a) {
//                case 1:
//                case 2:
//                    System.out.println(a);
//                    a++;
//                    break;
//                case 4:
//                    System.out.println(a++);
//                    a += b;
//                    break;
//                case 5:
//                    System.out.println(a - b);
//                    break;
//            }
//
//
//            if (a % 7 == 0) {
//                System.out.println(a);
//                break;
//            }
//            a++;
//        }
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);



//        int a = 10;
//        System.out.println(a++);
//        System.out.println(a);


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Bir tam sayı giriniz: ");
//        int sayı = scanner.nextInt();
//
//        double ortalama;
//        int toplam = 0;
//        int adet = 0;
//        List<Integer> liste = new ArrayList<>();
//        int bölen = 1;
//        while (bölen<=sayı){
//            if(sayı%bölen == 0){
//                 liste.add(bölen);
//                 toplam = toplam + bölen;
//                 adet = adet + 1;
//            }
//            bölen++;
//        }
//        ortalama = (double) toplam/adet;
//        System.out.println("Sayının ortak bölenleri: ");
//        for(int i = 0; i < liste.size(); i++) {
//            System.out.println("   " + liste.get(i));
//        }
//        System.out.println("sayıların ortalaması: " + ortalama);




//        Scanner scanner = new Scanner(System.in);
//        int toplam = 0;
//        double adet = 0;
//        while(true){
//            System.out.print("Bir tam sayı gir: ");
//            int sayı = scanner.nextInt();
//            if(sayı == 0){
//                break;
//            }
//            toplam += sayı;
//            adet += 1;
//        }
//        double ortalama = (toplam/adet);
//        System.out.println("toplam: " + toplam);
//        System.out.println("Ortalama: " +  ortalama);



//        int a = 12;
//        if(a-- < 12){
//            System.out.println(a);
//        }
//        else {
//            System.out.println("0");
//        }
//        System.out.println(a);



//        int a = 9;
//        int b = 2;
//        double c = a/b;
//        System.out.println(c);



//        int a = 88;
//        System.out.println(++a + 2 + "i" + i = 2);


//        boolean c = ('t' < 'a');
//        System.out.println(c);




        int i = 2;
        if (i / 2 == 0) {
            System.out.println("Akşam");
            i = (char) i;
            System.out.println("Gece");
        }
        System.out.println(i);






    }
}

