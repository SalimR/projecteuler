package projecteuler.problem1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem3Test {

	@Test
	public void testLargestPrimeFactor() {
		assertEquals(1, Problem3.calculatelargestPrimeFactor(23));
		assertEquals(5, Problem3.calculatelargestPrimeFactor(10));
		assertEquals(29, Problem3.calculatelargestPrimeFactor(13195));
		assertEquals(3, Problem3.calculatelargestPrimeFactor(24));
		assertEquals(6857, Problem3.calculatelargestPrimeFactor(600851475143L));
	}
}
