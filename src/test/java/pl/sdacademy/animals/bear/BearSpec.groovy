package pl.sdacademy.animals.bear

import org.joda.time.DateTime
import pl.sdacademy.animals.bear.time.TestClock
import pl.sdacademy.animals.time.Clock
import spock.lang.Specification

import static org.assertj.core.api.AssertionsForClassTypes.assertThat

class BearSpec extends Specification {

    def "Bear should be alive immediately after creation"() {
        when:
        def bear = new BlackBear(3)

        then:
        bear.isAlive()
    }

    def "Bear should be alive if it has eaten within 10 days"() {
        given:
        int weight = 3
        Bear bear = new BlackBear(weight)

        when:
        bear.eat()

        then:
        bear.isAlive()
    }

    def "Bear should not be alive if it has eaten within more than 10 days"() {
        given:
        int weight = 3
        def clock = new TestClock()
        Bear bear = new BlackBear(weight, clock)
        bear.eat()

        when:
        clock.changeTimeByDays(10)

        then:
        bear.isAlive() == false
    }

    def "Bear should be reborn after eating"() {
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

    def "Bear uses the clock to update its last meal time during eating"() {
        given:
        Clock clock = Mock(Clock)
        def bear = new BlackBear(1, clock)

        when:
        bear.eat()

        then:
        1 * clock.currentTime
    }

    def "Black bear should be hibernating between 20 november and 15 march"() {
        given:
        Clock clock = Mock(Clock)
        clock.getCurrentTime() >> date
        BlackBear bear = new BlackBear(3, clock)

        when:
        boolean result = bear.isHibernating()

        then:
        assertThat(result).isTrue()

        where:
        date << [new DateTime(2017, 12, 01, 14, 0), new DateTime(2017, 11, 21, 14, 0), new DateTime(2018, 01, 04, 14, 0), new DateTime(2017, 03, 14, 14, 0)]
    }

    def "Black bear should not be hibernating if it is after 15 march and before 20 november"() {
        given:
        Clock clock = Mock(Clock)
        clock.getCurrentTime() >> date
        BlackBear bear = new BlackBear(3, clock)

        when:
        boolean result = bear.isHibernating()

        then:
        assertThat(result).isFalse()

        where:
        date << [new DateTime(2017, 05, 01, 14, 0), new DateTime(2017, 11, 19, 14, 0), new DateTime(2018, 07, 04, 14, 0), new DateTime(2017, 03, 16, 14, 0)]

<<<<<<< HEAD
        public void changeTimeByDays(int days) {
            time = time.plusDays(days)
        }


=======
>>>>>>> 02a398fc36d8742f4a55c63891c0305e51bfcab3
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
