package projecteuler.problem10;

import java.math.BigInteger;

public class Problem16 {

	public static long calculateSumOfDigits(int exponent) {
		String numberAsString = BigInteger.valueOf(2).pow(exponent).toString();
		System.out.println(numberAsString);
		long result = 0;
		for (int j = 0; j < numberAsString.length(); j++) {
			result += Character.digit(numberAsString.charAt(j), 10);
		}
		return result;
	}
}
