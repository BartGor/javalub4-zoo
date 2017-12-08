package pl.sdacademy.animals.bear;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import

class BearTest {
    @Test
    public void bearShouldBeAliveImmediatelyAfterCreation() {

        int weight = 3;
        Bear bear = new BlackBear(weight);
        bear.eat();
        Assert.assertFalse(bear.isAlive());

    }



}