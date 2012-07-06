package projecteuler.problem10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem14Test {

	@Test
	public void generateCollatzSequence() {
		assertEquals("[13, 40, 20, 10, 5, 16, 8, 4, 2, 1]", Problem14
				.generateCollatzSequence(13).toString());

		assertEquals("[12, 6, 3, 10, 5, 16, 8, 4, 2, 1]", Problem14
				.generateCollatzSequence(12).toString());
	}

	@Test
	public void generateCollatzLength() {
		assertEquals(10, Problem14.calculateLengthSequence(13));
		assertEquals(67, Problem14.calculateLengthSequence(113382));
		assertEquals(248, Problem14.calculateLengthSequence(113383));

	}

	@Test
	public void findLongestSequence() {
		assertEquals(525, Problem14.findLongestCollatzSequence(1000000));
	}
}
