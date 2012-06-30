package projecteuler.problem1;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

	private int max;
	private final List<Integer> divisors = new ArrayList<>();

	public void setMax(int i) {
		this.max = i;
	}

	public void setDivisors(int... divisors) {
		for (int i : divisors) {
			this.divisors.add(i);
		}

	}

	public int solve() {
		int result = 0;
		for (int i = 0; i < max; i++) {
			if (isMultipleOfDivisorAny(i)) {
				result += i;
			}
		}
		return result;
	}

	private boolean isMultipleOfDivisorAny(int i) {
		for (Integer divisor : divisors) {
			if (isDivisor(divisor, i)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isDivisor(int divisor, int number) {

		return number % divisor == 0;
	}

}
