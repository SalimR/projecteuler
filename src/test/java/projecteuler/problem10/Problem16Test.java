package projecteuler.problem10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem16Test {

	@Test
	public void calculateSumOfDigits() {
		assertEquals(26, Problem16.calculateSumOfDigits(15));
		assertEquals(1366, Problem16.calculateSumOfDigits(1000));
	}
}
