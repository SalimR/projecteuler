package projecteuler.problem10;

import java.util.ArrayList;
import java.util.List;

public class Problem14 {

	static List<Integer> generateCollatzSequence(long number) {

		List<Integer> result = new ArrayList<>();
		while (number > 1) {
			result.add(Integer.valueOf((int) number));
			if (number % 2 == 0) {
				number = number / 2;
			} else {
				number = number * 3 + 1;
			}
		}
		result.add(1);
		return result;
	}

	static int calculateLengthSequence(long number) {

		int length = 1;
		while (number > 1) {
			length++;
			if (number % 2 == 0) {
				number = number / 2;
			} else {
				number = number * 3 + 1;
			}
		}
		return length;
	}

	public static int findLongestCollatzSequence(int max) {
		int result = 0;
		int index = 0;
		for (int j = 1; j < max; j++) {
			int length = calculateLengthSequence(j);
			if (length > result) {
				result = length;
				index = j;
			}
		}
		System.out.println("longest found for " + index + " with length "
				+ result + ":  " + generateCollatzSequence(index));
		return result;
	}
}
