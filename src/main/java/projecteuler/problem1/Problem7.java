package projecteuler.problem1;

public class Problem7 {

	public static boolean isPrime(long n) {
		boolean prime = true;
		for (long i = 3; i <= Math.sqrt(n); i += 2)
			if (n % i == 0) {
				prime = false;
				break;
			}
		if ((n % 2 != 0 && prime && n > 2) || n == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static int findPrimeNumber(int nth) {
		int primesFound = 1; // skip 2
		for (int i = 3; i < Integer.MAX_VALUE; i = i + 2) {
			if (isPrime(i)) {
				primesFound++;
			}
			if (primesFound == nth) {
				return i;
			}
		}

		return 0;
	}
}
