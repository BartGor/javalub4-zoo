package pl.sdacademy.animals.bear


import spock.lang.Specification

class BearSpec extends Specification {

    def "Bear should be alive immediately after creation"() {
        given:
        int weight = 3
        Bear bear = new BlackBear(weight)

        when:
        boolean  result = bear.isAlive()

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
        Bear bear = new BlackBear(weight)
        

        when:
        boolean  result = bear.isAlive()

        then:
        result 

    }

    def "If Bear eats a meal with a given weight, its weight increases by the same amount."() {
        given:
        int weight = 3
        Bear bear = new BlackBear(weight)


        when:
        int result = bear.getBearMeal()

        then:
        result

    }

//    def "If Bear drink water, its weight gain 3/4 of drink weight"(){
//        given:
//        int weight = 3
//        Bear bear = new BlackBear(weight)
//        bear.drink()
//
//        when:
//        double result = bear.getDrink()
//
//        then:
//        result
//
//    }
//    def "If Bear poops it lose 5% of its weight"(){
//        given:
//        int weight = 3
//        Bear bear = new BlackBear(weight)
//        bear.poop()
//
//        when:
//        double result = bear.getPoop()
//
//        then:
//        result
//
//    }
//
//    def "If Bear eat or drink during hibernation THROW BearHibernatingException"() {
//        given:
//        int weight = 3
//        Bear bear = new BlackBear(weight)
//        bear.eat()||bear.drink()&&
//
//        when:
//
//
//
//    }
}
