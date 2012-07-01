package projecteuler.problem1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem5 {

	public static long smallestEvenelyDividable(long numbers) {
		long max = fak(numbers);
		// long[] divisors = calculateDivisorsToCheck(numbers);
		for (long i = numbers; i < max; i++) {
			if (checkEvenelyDivisible(i, numbers)) {
				return i;
			}
		}
		return max;
	}

	private static boolean checkEvenelyDivisible(long i, long numbers) {
		for (long j = numbers; j > numbers / 2; j--) {
			if (i % j != 0) {
				return false;
			}
		}
		return true;
	}

	private static long fak(long i) {
		long result = 1;
		for (int j = 1; j <= i; j++) {
			result *= j;
		}
		return result;
	}

	static long[] calculateDistinctPrimesSmallerThan(long number) {
		ArrayList<Long> primes = new ArrayList<>();
		for (int i = 2; i < number; i++) {
			if (isPrime(i)) {
				primes.add(Long.valueOf(i));
			}
		}
		long[] longarray = new long[primes.size()];
		for (int i = 0; i < primes.size(); i++) {
			longarray[i] = primes.get(i);

		}
		return longarray;
	}

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

	public static int[] primeFactors(int value) {
		int[] result = new int[value + 1];
		if (value == 2) {
			result[2]++;
			return result;
		}

		int i = 2;
		int toFactor = value;
		while (i <= toFactor && i <= value) {
			if (toFactor % i == 0) {
				result[i]++;
				toFactor = toFactor / i;
			} else {
				i++;
			}
		}
		return result;
	}

	public static List<int[]> calculateAllPrimeFactors(int value) {
		List<int[]> result = new ArrayList<>();
		for (int i = 2; i <= value; i++) {
			result.add(Arrays.copyOf(primeFactors(i), value + 1));
		}
		return result;
	}

	public static long smallestEvenelyDividablePrime(int value) {
		List<int[]> allPrimes = calculateAllPrimeFactors(value);
		long result = 1;
		for (int i = 0; i <= value; i++) {
			int expo = 0;
			for (int[] ls : allPrimes) {
				expo = Math.max(expo, ls[i]);
			}
			result *= BigInteger.valueOf(i).pow(expo).longValue();
		}
		return result;
	}
}
