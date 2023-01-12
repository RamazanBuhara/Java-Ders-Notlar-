package day02_variables_scanner;

public class C03_NonPrimativeDataTypes {


    public static void main(String[] args) {


        String str= "Java Candir";
        int sayi=10;

        // Primative data turlerinin hazır method'lari yoktur
        // ancak non-primative data turlerinin onceden hazirlanmis ,
        // bizim kullanabilecegimiz method'lari olur

        System.out.println(sayi); //  10

        System.out.println(str.toLowerCase());  // java candir (sadece o anlık bir defaya mahsus
                                                // kücük harfe cevirir)

        System.out.println(str); // Java Candir (eski haline döndü)





    }
}
