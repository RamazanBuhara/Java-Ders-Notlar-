package day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        /* Kullanıcıdan ismini alin
           ve girilen ismi buyuk yazin

            Kullanicidan deger almak icin 3 islem yapmaniz gerekir
            1. adim scanner objesi olusturmak
         */
        Scanner scan = new Scanner(System.in);

        //2. adim kullaniciya ne isteginizi soyleyiniz

        System.out.println("isminizi yaziniz");

        //3. adim kullanicinin girecegi degeri kaydedeceginiz  bir variable olusturun
        // scan objesi ile ilgili method'u kullanarak kullanicinin girdigi degeri
        // olusturdugunuz variable'a atayın

        String girilenIsim=scan.nextLine();

        //Artık kullanicinin girdigi deger girilenIsim variable'inda kayitli

        System.out.println(girilenIsim.toUpperCase());


    }
}
