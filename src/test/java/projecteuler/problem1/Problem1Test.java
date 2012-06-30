package projecteuler.problem1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Problem1Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test10() {
		Problem1 problem1 = new Problem1();
		problem1.setMax(10);
		problem1.setDivisors(3, 5);

		assertEquals(23, problem1.solve());
	}

	@Test
	public void test1000() {
		Problem1 problem1 = new Problem1();
		problem1.setMax(1000);
		problem1.setDivisors(3, 5);

		assertEquals(233168, problem1.solve());
	}

	@Test
	public void testIsDivisor() {

		assertEquals(true, Problem1.isDivisor(3, 3));
		assertEquals(true, Problem1.isDivisor(3, 6));
		assertEquals(true, Problem1.isDivisor(3, -3));
		assertEquals(false, Problem1.isDivisor(3, 5));
		assertEquals(false, Problem1.isDivisor(3, 4));
		assertEquals(false, Problem1.isDivisor(3, 2));
		assertEquals(true, Problem1.isDivisor(3, 0));
		assertEquals(false, Problem1.isDivisor(3, -1));

	}
}
