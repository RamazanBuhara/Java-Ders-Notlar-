package day07_ternary_switchStatements;

public class C10_SwitchStatements {
    public static void main(String[] args) {

        // Kullanicidan gun numarasini alip
        // haftaici veya haftasonu oldugunu yazdirin


        /*int gunNo=5;

        switch (gunNo) {
            case 1:
                System.out.println("Hafta ici");
                break;
            case 2:
                System.out.println("Hafta ici");
                break;
            case 3:
                System.out.println("Hafta ici");
                break;
            case 4:
                System.out.println("Hafta ici");
                break;
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
                System.out.println("Hafta Sonu");
                break;
            case 7:
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Gecersiz gun no");
        }
         */

        int gunNo=5;

        switch (gunNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Gecersiz gun no");
        }



    }
}
