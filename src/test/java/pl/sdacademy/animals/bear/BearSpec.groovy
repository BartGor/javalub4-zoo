package pl.sdacademy.animals.bear

import org.joda.time.DateTime
import pl.sdacademy.animals.bear.time.TestClock
import pl.sdacademy.animals.time.Clock
import spock.lang.Specification

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
}
