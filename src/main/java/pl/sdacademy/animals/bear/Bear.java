package pl.sdacademy.animals.bear;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import pl.sdacademy.animals.Animal;
import pl.sdacademy.animals.time.Clock;
import pl.sdacademy.animals.time.JodaClock;


public abstract class Bear implements Animal {

    private int weight;
    private DateTime lastMealTime;
<<<<<<< HEAD
    private Clock clock;
    private int happyMeal;
    private double drinkWeight;
=======
    protected Clock clock;
>>>>>>> 02a398fc36d8742f4a55c63891c0305e51bfcab3

    public Bear(int weight, Clock clock) {
        this(weight);
        this.clock = clock;
    }

    public Bear(int weight) {
        this.weight = weight;
        this.clock = new JodaClock();
        this.lastMealTime = clock.getCurrentTime();
    }

    @Override
    public boolean isAlive() {
        return new Duration(lastMealTime, clock.getCurrentTime()).isShorterThan(Duration.standardDays(10));
    }

//    public void eat() {
//        lastMealTime = clock.getCurrentTime();
//
//    }

    public void eat(int happyMeal) {
        weight += happyMeal;

    }

    public void drink(double drinkWeight) {
        this.weight = (int) (weight + (0.75 * weight));

    }

    @Override
    public double getWeight() {
        return weight;
    }

    public abstract boolean isHibernating();

}
