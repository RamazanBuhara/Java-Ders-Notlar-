package day02_variables_scanner;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {


        //Kullanicidan bir sayı isteyin ve sayinin karesini yazin

        Scanner scan = new Scanner(System.in);
        System.out.println("Karesini almak istediginiz sayiyi giriniz");

        double girilenSayi= scan.nextDouble();

        System.out.println("Grililen sayinin karesi: "+girilenSayi*girilenSayi);
    }
}
