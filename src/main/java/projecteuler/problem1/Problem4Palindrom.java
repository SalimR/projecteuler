package projecteuler.problem1;

public class Problem4Palindrom {

	public static long calculateLargestPalindrome(long ditits) {
		long small = calculateSmallestNumberWithDigits(ditits);
		long large = calculateLargestNumberWithDigits(ditits);
		String resultAsString = "non found";
		long result = 0;
		for (long i = large; i >= small; i--) {
			for (long j = i; j >= small; j--) {
				long candidate = i * j;
				if (candidate > result && isPalindrome(candidate)) {
					resultAsString = "" + i + " * " + j + " = " + candidate;
					result = candidate;
				}
			}
		}
		System.out.println(resultAsString);
		return result;
	}

	static long calculateSmallestNumberWithDigits(long i) {
		return (long) Math.pow(10, i - 1);

	}

	static long calculateLargestNumberWithDigits(long i) {
		return calculateSmallestNumberWithDigits(i + 1) - 1;
	}

	public static boolean isPalindrome(long number) {
		if (number < 10) {
			return false;
		}
		String palin = String.valueOf(number);
		for (int i = 0; i < palin.length() / 2; i++) {
			if (palin.charAt(i) != palin.charAt(palin.length() - 1 - i)) {
				return false;
			}

		}
		return true;
	}

}
