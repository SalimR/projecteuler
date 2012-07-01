package projecteuler.problem1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem5Test {

	@Test
	public void smallestPositivSlow() {
		assertEquals(2520, Problem5.smallestEvenelyDividable(10));
		assertEquals(60, Problem5.smallestEvenelyDividable(5));
		assertEquals(1, Problem5.smallestEvenelyDividable(1));
		assertEquals(2, Problem5.smallestEvenelyDividable(2));
		assertEquals(6, Problem5.smallestEvenelyDividable(3));
		assertEquals(12, Problem5.smallestEvenelyDividable(4));
		// assertEquals(232792560, Problem5.smallestEvenelyDividable(20));
	}

	@Test
	public void smallestPositivPrime() {
		assertEquals(60, Problem5.smallestEvenelyDividablePrime(5));
		assertEquals(1, Problem5.smallestEvenelyDividablePrime(1));
		assertEquals(2, Problem5.smallestEvenelyDividablePrime(2));
		assertEquals(6, Problem5.smallestEvenelyDividablePrime(3));
		assertEquals(12, Problem5.smallestEvenelyDividablePrime(4));
		assertEquals(2520, Problem5.smallestEvenelyDividablePrime(10));
		assertEquals(232792560, Problem5.smallestEvenelyDividablePrime(20));
	}
}
