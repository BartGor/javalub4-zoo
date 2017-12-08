package pl.sdacademy.animals.time;

import org.joda.time.DateTime;

public class JodaClock implements Clock {
    @Override
    public DateTime getCurrentTime() {
        return DateTime.now();
    }
}
