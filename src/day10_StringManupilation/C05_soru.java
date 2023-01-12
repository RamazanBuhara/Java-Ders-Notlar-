package day10_StringManupilation;

import java.util.Scanner;

public class C05_soru {
    public static void main(String[] args) {

        // Soru 1 : Kullanicidan bir cumle alin
        // - cumlede ev geciyorsa, "home home sweet home" yazdirin
        // - cumlede is geciyorsa, "calismak guzeldir"
        // - ikisini de iceriyorsa "Hem ev lazim hem is"
        // - hicbirini icermiyorsa "cok calisman lazim" yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cumle girin");
        String str= scan.nextLine();
        String calisilacakStr=str.toLowerCase();

        if (calisilacakStr.contains("ev")&&calisilacakStr.contains("is")){
            System.out.println("Hem ev lazim hem is");
        } else if (calisilacakStr.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (calisilacakStr.contains(" is")) {
            System.out.println("calismak guzeldir");
        }else {
            System.out.println("cok calisman lazim");
        }
    }
}
