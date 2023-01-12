package day10_StringManupilation;

public class tekrar2 {
    public static void main(String[] args) {


        // Kullanicidan baslangic ve bitis degerlerini alip
        // bu sinirlar dahil olarak, bu sayilar arasinda 5'in kati olan sayilari yazdirin


        int inputbas=34;
        int inputbitis=165;

        for (int i =inputbas; i <=inputbitis; i++) {
            if (i%5==0){
                System.out.print(i+" ");
            }

        }



    }
}
