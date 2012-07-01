package projecteuler.problem1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Problem7Test {

	@Test
	public void isPrime() {
		assertTrue(Problem7.isPrime(2));
		assertTrue(Problem7.isPrime(3));
		assertTrue(Problem7.isPrime(5));
		assertTrue(Problem7.isPrime(11));
		assertTrue(Problem7.isPrime(23));
		assertFalse(Problem7.isPrime(1));
		assertFalse(Problem7.isPrime(4));
		assertFalse(Problem7.isPrime(22));
	}

	@Test
	public void getPrimeNumber() {
		assertEquals(13, Problem7.findPrimeNumber(6));
		assertEquals(104743, Problem7.findPrimeNumber(10001));
	}

}
