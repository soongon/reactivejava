package modernjava.java8datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class DateTimeDemo2 {
    public static void main(String[] args) {

        LocalDate imf = LocalDate.of(1997, 12, 15);

        LocalDate today = LocalDate.of(2019, 1, 25);

        Period gap = imf.until(today);

        System.out.println(gap.getYears()
                + "년" + gap.getMonths()
                + "월" + gap.getDays() + "일 지났어요");

        LocalDate theDay =
                imf.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(theDay);

        LocalDate nextWorkingday = today.with(new NextMartOffDay());
        System.out.println(nextWorkingday);
    }
}
