package day23_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {

    public static void main(String[] args) {

        LocalDate dogumTarihi=LocalDate.of(1998,6,11);
        LocalDate bugun=LocalDate.now();

        Period yas = Period.between(dogumTarihi,bugun);
        System.out.println(yas); // P27Y4M8D
        System.out.println(yas.getYears()); // 24

        LocalDate baslangic=LocalDate.of(2015,9,10);
        LocalDate bitis=LocalDate.of(2021,9,30);
        Period sure=Period.between(baslangic,bitis);
        System.out.println(sure); //P6Y20D


    }

}
