package projecteuler.problem20;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem21Test {

	@Test
	public void calculateProperDivisor() {
		assertEquals("[1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110]", Problem21
				.calculateProperDivisor(220).toString());
	}

	@Test
	public void calculateSumOfProperDivisor() {
		assertEquals(0, Problem21.calculateSumOfProperDivisor(1));
		assertEquals(1, Problem21.calculateSumOfProperDivisor(2));
		assertEquals(3, Problem21.calculateSumOfProperDivisor(4));
		assertEquals(284, Problem21.calculateSumOfProperDivisor(220));
		assertEquals(220, Problem21.calculateSumOfProperDivisor(284));
	}

	@Test
	public void calculateAllAmicableNumbers() {
		assertEquals(31626, Problem21.calculateSumOfAllAmicableNumbers(10000));
	}
}
