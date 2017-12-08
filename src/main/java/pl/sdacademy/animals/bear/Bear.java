package pl.sdacademy.animals.bear;


import org.joda.time.DateTime;
import pl.sdacademy.animals.Animal;

import java.time.Clock;
import java.time.LocalDate;


public abstract class Bear implements Animal {


    private int weight;
    private boolean isAlive;
    private DateTime lastMealDate;
    private Clock clock;



    public Bear(int weight) {
        this.weight = weight;
        this.isAlive = false;

    }


    @Override
    public boolean isAlive() {
        return isAlive;
    }

    public void eat() {

    }

    public void drink() {
    }

    public void poop() {

    }


    @Override
    public int getWeight() {
        return weight;
    }



}


