package day06_ifElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen ikiz kenar ise “ikiz kenar ucgen” yazdirin,
        // degilse “ikiz kenar ucgen degil” yazdirin.


        Scanner scan= new Scanner(System.in);
        System.out.println("ucgenin kenar uzunlugunu yaziniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0 ) {
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar degil");
        }



        if ((kenar1==kenar2 && kenar1!=kenar3) ||
             (kenar2==kenar3 && kenar2!=kenar1) ||
             (kenar3==kenar1 && kenar3!=kenar2)){

            System.out.println("ikizkenar ucgen");
        } else {
            System.out.println("ikizkenar degil");
        }
    }
}
