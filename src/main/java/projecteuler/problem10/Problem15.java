package projecteuler.problem10;

import java.math.BigInteger;

public class Problem15 {

	public static long fac(int number) {
		long result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}

	public static long findPathesInGrid(int i) {
		int pathLength = i + i;
		long result = fac(pathLength) / (fac(i) * fac(i));
		return result;
	}

	public static long findPathesInGridBigInteger(int size) {
		int pathLength = size + size;
		BigInteger result = BigInteger.valueOf(1);
		for (int j = size + 1; j <= pathLength; j++) {
			result = result.multiply(BigInteger.valueOf(j));
		}
		for (int j = 1; j <= size; j++) {
			result = result.divide(BigInteger.valueOf(j));
		}
		return result.longValue();
	}

}
