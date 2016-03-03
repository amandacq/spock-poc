package com.spock.poc;

/**		
 * @author Hans Westerbeek
 */
public interface NumberService {

	/**
	 *
	 * @param number
	 * @return whether the number is even
	 * @throws IllegalArgumentException when you pass a null value
	 */
	boolean isEven(Integer number) throws IllegalArgumentException;
}
