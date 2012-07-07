package projecteuler.problem10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem15Test {
	@Test
	public void fac() {
		assertEquals(1, Problem15.fac(1));
		assertEquals(2, Problem15.fac(2));
		assertEquals(6, Problem15.fac(3));
		assertEquals(24, Problem15.fac(4));
	}

	@Test
	public void findNumOfPathInGrid() {
		assertEquals(2, Problem15.findPathesInGrid(1));
		assertEquals(6, Problem15.findPathesInGrid(2));
		assertEquals(20, Problem15.findPathesInGrid(3));
		// assertEquals(20, Problem15.findPathesInGrid(20));
	}

	@Test
	public void findNumOfPathInGridBigInteger() {
		assertEquals(2, Problem15.findPathesInGridBigInteger(1));
		assertEquals(6, Problem15.findPathesInGridBigInteger(2));
		assertEquals(20, Problem15.findPathesInGridBigInteger(3));
		assertEquals(137846528820L, Problem15.findPathesInGridBigInteger(20));
	}

}
