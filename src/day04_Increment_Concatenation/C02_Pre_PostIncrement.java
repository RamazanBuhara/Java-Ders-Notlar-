package day04_Increment_Concatenation;

public class C02_Pre_PostIncrement {
    public static void main(String[] args) {


        int a = 10;                          //         a=10       b=-           c=-


        int b = a++; // arttır==> sonra                 a=11       b=10          c=-
                     // ata   ==> önce

        int c = ++a; // arttır==>önce                   a=12       b=10          c=12
                     // ata   ==>sonra

        System.out.println(a + ", " + b + ", " + c); // a=12  b=10  c=12




        int x = 20;                            //         x=20       y=-           z=-

        int y = ++x;   // arttır==> önce                  x=21       y=21          z=-
                       // ata   ==> sonra

        int z = y++;   // arttır==>sonra                  x=21       y=22          z=21
                       // ata   ==>önce

        System.out.println(x + "," +y +"," +z);          //21 ,22, 21




        int k = 30;
        System.out.println(k++); //30
        System.out.println(++k); //32
        System.out.println(k++); //32
        System.out.println(k);   //33




        int sayi1= 40;             //sayi1= 40

        int sayi2= sayi1++;        //sayi1= 41       sayi2= 40

        int sayi3= --sayi2;        //sayi2= 39       sayi3=39

        int sayi4= --sayi1;        //sayi1=40        sayi4=40

        System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3 + ", " + sayi4); // 40 39 39 40




    }
}
