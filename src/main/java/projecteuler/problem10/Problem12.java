package projecteuler.problem10;

import java.util.ArrayList;
import java.util.List;

public class Problem12 {

	public static int findTrinagleNumberWithAtLeastFactors(int numberOfFactors) {
		int result = 0;
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			result += i;
			if (calculatFactors(result) >= numberOfFactors) {
				List<Integer> factors = findFactors(result);
				// List<Integer> factors = new ArrayList<>();
				System.out.println("Found " + result + " as the " + i
						+ "th tringleNumber with following factors " + factors);
				return result;
			}
		}
		return result;
	}

	static List<Integer> findFactors(int result) {
		List<Integer> factors = new ArrayList<>();
		for (int i = 1; i <= result; i++) {
			if (result % i == 0) {
				factors.add(i);
			}

		}
		return factors;
	}

	static int calculatFactors(int result) {
		int factors = 0;
		int biggestDivisor = result;
		for (int i = 1; i < biggestDivisor; i++) {
			if (result % i == 0) {
				biggestDivisor = result / i;
				factors += 2;
			}

		}
		return factors;
	}
}
