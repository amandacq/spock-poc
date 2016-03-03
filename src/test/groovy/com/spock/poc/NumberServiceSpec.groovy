package com.spock.poc

import com.spock.poc.NumberService
import com.spock.poc.NumberServiceImpl
import spock.lang.Specification

/**
 * Spec that demonstrates that we can have pure java classes as unit under tests.
 * Other subject covered is asserting exceptions
 * @author Hans Westerbeek
 */
class NumberServiceSpec extends Specification {

	NumberService numberService // the unit under test

	def setup(){
		numberService = new NumberServiceImpl()
	}
	def "see if an odd number yields correct result"(){
		given:
			//def numberService = new NumberServiceImpl()
		when: "pass an odd number"
			def result = numberService.isEven(3)
		then: "expects the even Function returns false"
			result == false
	}

	def "see if an even number yields correct result"(){
		given:
			//def numberService = new NumberServiceImpl()
		when: "pass an even number"
			def result = numberService.isEven(4)
		then: "expects the even Function returns true"
			result == true
	}

	def "see that null values are not accepted"(){
		given:
		when:
			def result = numberService.isEven(null)
		then:
			thrown(IllegalArgumentException)
	}
}
