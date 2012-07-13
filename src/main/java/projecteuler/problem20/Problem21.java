package projecteuler.problem20;

import java.util.ArrayList;
import java.util.List;

public class Problem21 {

	public static int calculateSumOfProperDivisor(int i) {
		int result = 0;
		List<Integer> calculateProperDivisor = calculateProperDivisor(i);
		for (Integer divisor : calculateProperDivisor) {
			result += divisor;
		}
		return result;
	}

	public static List<Integer> calculateProperDivisor(int number) {
		List<Integer> result = new ArrayList<>();
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				result.add(i);
			}

		}
		return result;
	}

	public static int calculateSumOfAllAmicableNumbers(int number) {
		int[] sumOfDiv = new int[number];
		for (int i = 0; i < number; i++) {
			sumOfDiv[i] = calculateSumOfProperDivisor(i);
		}
		// System.out.println(Arrays.toString(sumOfDiv));
		int result = 0;
		for (int a = 0; a < sumOfDiv.length; a++) {
			int b = sumOfDiv[a];
			if (b < number && sumOfDiv[b] == a && a != b) {
				result += b;
				// System.out.println(a + ", " + b);
			}

		}

		return result;
	}
}
