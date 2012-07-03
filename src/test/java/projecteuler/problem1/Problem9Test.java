package projecteuler.problem1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem9Test {

	@Test
	public void testSolve() {
		assertEquals(31875000, Problem9.solve());
	}

	@Test
	public void testSolveBrute() {
		assertEquals(31875000, Problem9.solveBrute());
	}

}
