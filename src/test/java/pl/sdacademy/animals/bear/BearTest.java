package pl.sdacademy.animals.bear;

import org.junit.jupiter.api.Test;
<<<<<<< HEAD

import static junit.framework.TestCase.assertTrue;


class BearTest {
    @Test
    public void bearShouldBeAliveImmediatelyAfterCreation() {


        Bear bear = new BlackBear(3);
        assertTrue(bear.isAlive());

    }
    @Test
    public void bearShouldBeAliveImmediatelyEatenAfterCreation(){
        Bear bear = new BlackBear(3);
        bear.eat(1);
        assertTrue(bear.isAlive());

    }
    @org.junit.Test




=======
import pl.sdacademy.animals.bear.time.TestClock;
import pl.sdacademy.animals.time.Clock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BearTest {

    @Test
    public void bearShouldBeAliveImmediatelyAfterCreation() {
        Bear bear = new BlackBear(3);
        assertThat(bear.isAlive()).isTrue();
    }

    @Test
    public void bearShouldBeAliveIfItHasEatenWithin10Days() {
        Bear bear = new BlackBear(3);
        bear.eat();
        assertTrue(bear.isAlive());
    }

    @Test
    public void bearShouldNotBeAliveIfItHasEatenWithinMoreThan10Days() {
        TestClock clock = new TestClock();
        Bear bear = new BlackBear(3, clock);
        bear.eat();
        clock.changeTimeByDays(10);
        assertFalse(bear.isAlive());
    }
>>>>>>> 02a398fc36d8742f4a55c63891c0305e51bfcab3

}