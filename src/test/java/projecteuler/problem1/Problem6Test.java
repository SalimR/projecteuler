package projecteuler.problem1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem6Test {
	@Test
	public void sumOfSquares() {
		assertEquals(5, Problem6.sumOfSquare(2));
		assertEquals(385, Problem6.sumOfSquare(10));
		assertEquals(338350, Problem6.sumOfSquare(100));
	}

	@Test
	public void squaresOfSum() {
		assertEquals(9, Problem6.squareOfSum(2));
		assertEquals(3025, Problem6.squareOfSum(10));
		assertEquals(25502500, Problem6.squareOfSum(100));
	}

	@Test
	public void calculateDiff() {
		assertEquals(2640, Problem6.calculateDiff(10));
		assertEquals(25164150, Problem6.calculateDiff(100));
	}
}
