package day04_Increment_Concatenation;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {

        /*

     ==>                       INCREMENT (DEGER ARTTIRMA) TOPLAMA VE CARPMA İÇİN
        Toplama veya carpma yaparken bir veriable'in degerini arttirabiliriz
        Increment isleminin kalıcı olması icin 3 farklı sekilde assigment (atama) yapilabilir.


                 int sayi = 10;
        1.yol    sayi=sayi + 3; ==> 13 olur
        2.yol    sayi + = 3;    ==> bu da 13 olur

                 int sayi =10 ;
        1.yol    sayi= sayi*3;  ==>   (2. yol) sayi *= 3    ==> ikisi de aynı 30 olur.

                 int sayi = 10;
        3.yol    sayi++;  (sayiyi bir arttırıp atama yapar) ==> sayi= sayi+1 demek


    ==>                       DECREMENT (DEGER AZALTMA) CIKARMA VE BOLME İCİN
        Cıkarma veya bolme yaparken bir veriable'in degerini azaltabiliriz
        Decrement isleminin kalıcı olması icin 3 farklı sekilde assigment (atama) yapilabilir.


                 int sayi = 10;
        1.yol    sayi=sayi - 3; ==> 7 olur
        2.yol    sayi - = 3;    ==> bu da 7 olur

                 int sayi =10 ;
        1.yol    sayi= sayi/2;  ==>   (2. yol) sayi /= 2    ==> ikisi de aynı 5 olur.

                 int sayi = 10;
        3.yol    sayi--;  (sayiyi bir azaltıp atama yapar) ==> sayi= sayi-1 demek ==> 9 olarak atanır


         */

        int sayi=20;
        // sayiyi 3 artirin
        sayi = sayi+3;
        sayi +=3;
        sayi++;
        sayi++;
        sayi++;
        System.out.println(sayi); // 29


        // sayinin degerini 2 azaltin
        sayi = sayi - 2;
        sayi -= 2;
        sayi--;
        sayi--;
        System.out.println(sayi); // 23


        sayi= 10 ;
        // sayinin degerini once 1 azaltin, sonra yazdirin
        sayi--;
        System.out.println(sayi); // 9
        // bu islemde ekranda gordugumuz 9, sayinin son degeri 9
        System.out.println(sayi); // 9


        sayi=10;
        // sayiyi once yazdirin, sonra 1 azaltin
        System.out.println(sayi); // 10
        sayi--;
        // ekranda gorulen 10, ama sayinin son degeri 9
        System.out.println(sayi); // 9


        sayi=10;
        sayi++;  // sayiyi 1 artirir
        ++sayi;  // sayiyi 1 artirir
        System.out.println(sayi); // 12


        sayi=10;
        System.out.println(sayi++); // 10
        // Java ayni satirda iki islem oldugundan siralama yapar
        // eger ++ variable'dan sonra ise artirma islemini sonra yapar
        // bu durumda once yazdirma, sonra artirma islemi yapar

        System.out.println(sayi); // 11



        sayi=10;
        System.out.println(++sayi);// 11
        // ++ variable'dan once ise artirma islemini once yapar
        // bu durumda java once artirma sonra yazdirma islemi yapar

        System.out.println(sayi); // 11



        int aa =10;
        System.out.println("aa'nin degeri : " + ++aa);     // aa=11        bb=       cc=
        int bb =aa++;                                     // aa=12        bb=11       cc=
        System.out.println("bb'nin degeri : " + bb);       // aa=          bb=11       cc=
        int cc =bb++ + aa;                                // aa=12        bb=12       cc=23
        System.out.println("cc'nin degeri : " + cc);       // aa=12        bb=12       cc=23
        System.out.println("son toplam : " +(aa+bb+cc));  // aa=12       bb=12       cc=23  ====> 47





    }
}
