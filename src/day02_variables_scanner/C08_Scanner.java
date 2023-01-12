package day02_variables_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        dikdortgenin alanini yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dikdorgenin iki kenar uzunlugunu girin");
        double dbl1= scan.nextDouble();
        double dbl2= scan.nextDouble();

        System.out.println("dikdörtgenin alanı: " + dbl1*dbl2);

        System.out.println("kenar1: "+ dbl1 +
                           "\nkenar2: "+ dbl2 +
                           "\ndikdörtgen alanı:"+ dbl1*dbl2);





    }
}
