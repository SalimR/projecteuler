package projecteuler.problem20;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem20Test {

	@Test
	public void sumOfBang() {
		assertEquals(27, Problem20.sumOfBang(10));
		assertEquals(648, Problem20.sumOfBang(100));
	}

}
