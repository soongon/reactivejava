package modernjava.java8datetime;

import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class NextMartOffDay implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dow =
            DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        if (dow == DayOfWeek.FRIDAY) {
            return temporal.plus(3, ChronoUnit.DAYS);
        } else if (dow == DayOfWeek.SATURDAY) {
            return temporal.plus(2, ChronoUnit.DAYS);
        } else {
            return temporal.plus(1, ChronoUnit.DAYS);
        }
    }
}
