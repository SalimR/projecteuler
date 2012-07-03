package projecteuler.problem10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem10Test {

	@Test
	public void sumPrimes() {
		assertEquals(17, Problem10.sumPrimes(10));
		assertEquals(142913828922L, Problem10.sumPrimes(2000000));
	}

	// @Test
	public void sumPrimesWithLibs() {
		assertEquals(17, Problem10.sumPrimesWithLibs(10));
		assertEquals(142913828922L, Problem10.sumPrimesWithLibs(2000000));
	}

	@Test
	public void sumPrimesCopied() {
		assertEquals(17, Problem10.sumPrimesCopied(10));
		assertEquals(142913828922L, Problem10.sumPrimesCopied(2000000));
	}
}
