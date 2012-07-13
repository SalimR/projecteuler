package projecteuler.problem20;

import java.math.BigInteger;

public class Problem20 {

	public static int sumOfBang(int number) {
		int result = 0;
		BigInteger bang = fak(number);
		System.out.println(bang);
		while (bang.compareTo(BigInteger.ZERO) > 0) {
			result += bang.mod(BigInteger.TEN).intValue();
			bang = bang.divide(BigInteger.TEN);
		}

		return result;
	}

	private static BigInteger fak(int number) {
		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= number; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}

}
