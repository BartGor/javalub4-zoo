package pl.sdacademy.animals.bear;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import pl.sdacademy.animals.time.Clock;

public class BlackBear extends Bear {
    public BlackBear(int weight, Clock clock) {
        super(weight, clock);
    }

    public BlackBear(int weight) {
        super(weight);
    }

<<<<<<< HEAD
=======
    @Override
    public boolean isHibernating() {
        DateTime currentTime = clock.getCurrentTime();
        LocalDate currentDate = currentTime.toLocalDate();
        int currentYear = currentTime.getYear();

        LocalDate twentiethNovember = new LocalDate(currentYear, 11, 20);
        LocalDate fifteenthMarch = new LocalDate(currentYear, 3, 15);

        return currentDate.isAfter(twentiethNovember) ||
                currentDate.isBefore(fifteenthMarch);
    }

>>>>>>> 02a398fc36d8742f4a55c63891c0305e51bfcab3

}