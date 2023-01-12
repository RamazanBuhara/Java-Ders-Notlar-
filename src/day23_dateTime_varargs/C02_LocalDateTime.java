package day23_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime ltd= LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(ltd); //2022-12-20T21:23:09.617613200

        ltd=LocalDateTime.now();
        System.out.println(ltd); //2022-12-20T21:25:05.497332300

        System.out.println(ltd.getDayOfWeek()); //TUESDAY

        System.out.println(ltd.withYear(2030)); //2030-12-20T21:30:43.682399800


    }
}
