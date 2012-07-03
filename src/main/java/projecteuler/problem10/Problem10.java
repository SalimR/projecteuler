package projecteuler.problem10;

import java.math.BigInteger;
import java.util.Arrays;

import projecteuler.problem1.Problem7;

public class Problem10 {

	public static long sumPrimes(int max) {
		long result = 2;
		for (int j = 3; j < max; j = j + 2) {
			if (Problem7.isPrime(j)) {
				result += j;
			}
		}
		return result;
	}

	public static long sumPrimesWithLibs(int max) {
		long result = 0;
		for (BigInteger i = BigInteger.valueOf(2); i.longValue() < max; i = i
				.nextProbablePrime()) {
			result += i.longValue();

		}
		return result;
	}

	public static long sumPrimesCopied(int max) {
		int n = max;
		boolean isprime[] = new boolean[n + 1];
		Arrays.fill(isprime, true);
		isprime[2] = true;
		isprime[3] = true;
		for (int i = 4; i < n; i += 2)
			isprime[i] = false;
		for (int i = 3; i < n; i += 2) {
			for (int j = i + i; j < n; j += i) {
				isprime[j] = false;
			}
		}
		long sum = 0;
		for (int i = 2; i < n; ++i) {
			if (isprime[i])
				sum += i;
		}
		return sum;
	}

}
