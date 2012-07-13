package projecteuler.problem10;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class Problem18and67Test {

	public static String pyramid = "3\n" + "7 4\n" + "2 4 6\n" + "8 5 9 3";
	public static String pyramid2 = "75\n95 64\n17 47 82\n18 35 87 10\n20 04 82 47 65\n19 01 23 75 03 34\n88 02 77 73 07 63 67\n99 65 04 28 06 16 70 92\n41 41 26 56 83 40 80 70 33\n41 48 72 33 47 32 37 16 94 29\n53 71 44 65 25 43 91 52 97 51 14\n70 11 33 28 77 73 17 78 39 68 17 57\n91 71 52 38 17 14 91 43 58 50 27 29 48\n63 66 04 68 89 53 67 30 73 16 69 87 40 31\n04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

	@Test
	public void findBiggestSum() {
		assertEquals(23, Problem18and67.findBiggestSum(pyramid));
		assertEquals(1074, Problem18and67.findBiggestSum(pyramid2));
	}

	@Test
	public void findBiggestSumFile() throws IOException {
		assertEquals(7273, Problem18and67.findBiggestSum(getClass().getClassLoader()
				.getResourceAsStream("triangle.txt")));
	}

	@Test
	public void testPyramid() {
		assertEquals(pyramid, new Problem18and67.Pyramid(pyramid).toString());
		assertEquals(pyramid2, new Problem18and67.Pyramid(pyramid2).toString());
	}
}
