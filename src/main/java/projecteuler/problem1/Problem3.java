package projecteuler.problem1;

public class Problem3 {
	public static long calculatelargestPrimeFactor(long value) {
		System.out.print("primefactors for " + value + " are: [");
		long result = 1;
		long i = 2;
		long toFactor = value;
		while (i <= toFactor && i < value) {
			if (toFactor % i == 0) {
				System.out.print(i + ", ");
				result = i;
				toFactor = toFactor / result;
			} else {
				i++;
			}
		}
		System.out.println("], largest is " + result);
		return result;

	}
}
