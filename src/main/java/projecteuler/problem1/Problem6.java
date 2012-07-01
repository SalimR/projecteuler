package projecteuler.problem1;

public class Problem6 {

	public static long sumOfSquare(long number) {
		long result = 0;
		for (long j = 1; j <= number; j++) {
			result += j * j;
		}
		return result;
	}

	public static long squareOfSum(long number) {
		long sum = 0;
		for (int j = 1; j <= number; j++) {
			sum += j;
		}
		sum = sum * sum;
		return sum;
	}

	public static long calculateDiff(long number) {
		return squareOfSum(number) - sumOfSquare(number);
	}

}
