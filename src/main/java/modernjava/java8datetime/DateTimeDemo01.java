package modernjava.java8datetime;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeDemo01 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate ch = LocalDate.of(2014, 12, 25);
        ch.plusDays(100);

        LocalDate theDay = today.plusDays(100).minusMonths(1);
        System.out.println(theDay);

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime theTime = now
                .plusMinutes(30)
                .minusHours(4)
                .minusMinutes(20);
        System.out.println(theTime);
    }
}
