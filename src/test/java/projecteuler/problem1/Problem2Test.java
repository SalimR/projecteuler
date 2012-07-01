package projecteuler.problem1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before; 
import org.junit.Test;

public class Problem2Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void calculateSum() {
		assertEquals(44, Problem2.sumEvenFiboSmallerThan(35));
		assertEquals(44, Problem2.sumEvenFiboSmallerThan(34));
		assertEquals(10, Problem2.sumEvenFiboSmallerThan(33));
		assertEquals(4613732, Problem2.sumEvenFiboSmallerThan(4000000));
	}

	@Test
	public void calculateFibos() {
		assertEquals("[1, 2, 3, 5, 8, 13, 21, 34]", Problem2.calculateFibos(35)
				.toString());
		assertEquals("[1, 2, 3, 5, 8, 13, 21, 34]", Problem2.calculateFibos(34)
				.toString());
		assertEquals("[1, 2, 3]", Problem2.calculateFibos(3).toString());
	}

	@Test
	public void calculateFibosHandleNegative() {
		try {
			Problem2.calculateFibos(-1);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("invalid parameter", e.getMessage());
		}

		try {
			Problem2.calculateFibos(0);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("invalid parameter", e.getMessage());
		}
		try {
			Problem2.calculateFibos(1);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("invalid parameter", e.getMessage());
		}
		try {
			Problem2.calculateFibos(2);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("invalid parameter", e.getMessage());
		}
	}

}
