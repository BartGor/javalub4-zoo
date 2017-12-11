package pl.sdacademy.animals.bear.time;

<<<<<<< HEAD
public class TestClock {
}
=======
import org.joda.time.DateTime;
import pl.sdacademy.animals.time.Clock;

public class TestClock implements Clock {

    private DateTime time = DateTime.now();

    @Override
    public DateTime getCurrentTime() {
        return time;
    }

    public void changeTimeByDays(int days) {
        time = time.plusDays(days);
    }
}
>>>>>>> 02a398fc36d8742f4a55c63891c0305e51bfcab3
