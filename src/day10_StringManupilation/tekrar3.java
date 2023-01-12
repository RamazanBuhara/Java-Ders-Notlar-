package day10_StringManupilation;

public class tekrar3 {
    public static void main(String[] args) {


        // input olarak verilen sayidan baslayip
        // 7'ser 7'ser artirarak input olarak verilen bitis sayisina kadar
        // - tum sayilari
        // - kac adet sayi oldugunu
        // - ve bu sayilarin toplaminin kac oldugunu yazdirin


        int inputbas= 34;
        int inputbit= 563;

        int sayac=0;
        int sayTop=0;

        for (int i = inputbas; i < inputbit; i+=7) {

            System.out.print(i+" ");
            sayTop+=i;
            sayac++;
        }

        System.out.println(" ");
        System.out.println("sayilarin toplami: "+sayTop);
        System.out.println(sayac +" adet sayi var");

    }
}
