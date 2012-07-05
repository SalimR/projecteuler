package projecteuler.problem10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem12Test {

	@Test
	public void findTriangleNumberWithFactors() {
		assertEquals(28, Problem12.findTrinagleNumberWithAtLeastFactors(5));
		assertEquals(76576500,
				Problem12.findTrinagleNumberWithAtLeastFactors(500));
	}

	@Test
	public void findFactors() {
		assertEquals("[1]", Problem12.findFactors(1).toString());
		assertEquals("[1, 2, 4, 7, 14, 28]", Problem12.findFactors(28)
				.toString());
	}
}
