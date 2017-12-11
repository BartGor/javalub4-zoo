package pl.sdacademy.animals.bear

import org.joda.time.DateTime
import pl.sdacademy.animals.time.Clock
import spock.lang.Specification

class BearSpec extends Specification {

    def "Bear should be alive immediately after creation"() {
        given:
        int weight = 3
        Bear bear = new BlackBear(weight)

        when:
        boolean result = bear.isAlive()

        then:
        result
    }

    def "Bear should be alive if it has eaten within 10 days"() {
        given:
        int weight = 3
        Bear bear = new BlackBear(weight)
        bear.eat()

        when:
        boolean result = bear.isAlive()

        then:
        result
    }

    def "Bear should not be alive if it has eaten within more than 10 days"() {
        given:
        int weight = 3
        def clock = new TestClock()
        Bear bear = new BlackBear(weight, clock)
        bear.eat()
        clock.changeTimeByDays(10)

        when:
        boolean result = bear.isAlive()

        then:
        result == false
    }

    class TestClock implements Clock {

        private DateTime time = DateTime.now()

        @Override
        DateTime getCurrentTime() {
            return time
        }

        public void changeTimeByDays(int days) {
            time = time.plusDays(days)
        }


    }

    def "If a bear eats a meal with a given weight, its weight will increase"() {
        given:
        int weight = 3
        int happymeal = 2
        Bear bear = new BlackBear(weight)


        when:
        bear.eat(happymeal)

        then:
        bear.weight == bear.weight + happymeal

    }

    def "Bear schould be reborn after eating"() {
        given:
        int weight = 3
        def clock = new TestClock()
        Bear bear = new BlackBear(weight, clock)
        bear.eat()
        clock.changeTimeByDays(10)
        assert !bear.isAlive()


        when:
        bear.eat()


        then:
        bear.isAlive()
    }

    def "IF a bear drink "() {
        given:
        int weight = 3
        double drinkWeight = 1.0
        Bear bear = new BlackBear(weight)

        when:
        bear.drink(drinkWeight)

        then:
        bear.weight == bear.weight + drinkWeight * 0.75

    }



}
