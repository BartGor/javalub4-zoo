package pl.sdacademy.animals.bear;

import org.junit.jupiter.api.Test;

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





}