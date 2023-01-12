package day10_StringManupilation;

public class tekrar4 {
    public static void main(String[] args) {

        // verilen sayinin faktoryelini hesaplayin
        // 5! = 5*4*3*2*1

        int fak=13;
        int carpim=1;


        for (int i = fak; i >1 ; i--) {
            carpim*=i;
        }

        System.out.println(carpim+" ");



        }



    }

