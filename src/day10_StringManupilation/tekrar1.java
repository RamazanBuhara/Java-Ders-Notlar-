package day10_StringManupilation;

public class tekrar1 {
    public static void main(String[] args) {


        // 1 ile 1000 arasindaki sayilari(sinirlar dahil) yanyana yazdirin
        // yazdirma islemi bittiginde
        // "tum bu sayilarin toplami = " deyip sayilarin toplamini yazdirin




        int st=0;
        for (int i = 1; i <=1000; i++) {

            System.out.print(i+ " ");
            st+=i;
        }

        System.out.println(" ");
        System.out.println("sayiiların toplami: "+st);

    }
}
