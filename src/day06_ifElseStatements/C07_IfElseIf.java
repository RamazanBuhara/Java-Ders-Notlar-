package day06_ifElseStatements;

import java.util.Scanner;

public class C07_IfElseIf {
    public static void main(String[] args) {


        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30 veya daha buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.


        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen kilonuzu kg olarak giriniz");
        double kilo = scan.nextDouble();

        System.out.println("lütfen boyunuzu cm olarak giriniz");
        double boy = scan.nextDouble();

        double vucutKitleEndeksi= ((kilo*1000)/(boy*boy));
        System.out.println("vucut kitle endeksi :"+ vucutKitleEndeksi);

        if (vucutKitleEndeksi>=30) System.out.println("obez");
        //if (vucutKitleEndeksi>25, vucutKitleEndeksi<30)
    }
}
