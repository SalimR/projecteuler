package projecteuler.problem1;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

	public static int sumEvenFiboSmallerThan(int i) {
		List<Integer> fibos = calculateFibos(i);
		int result = 0;
		for (Integer integer : fibos) {
			if (integer % 2 == 0) {
				result += integer;
			}
		}
		return result;
	}

	public static List<Integer> calculateFibos(int i) {
		if (i < 3) {
			throw new IllegalArgumentException("invalid parameter");
		}
		List<Integer> fibos = new ArrayList<>();
		fibos.add(1);
		fibos.add(2);
		boolean keepGoing = true;

		while (keepGoing) {
			int nextFibo = fibos.get(fibos.size() - 1)
					+ fibos.get(fibos.size() - 2);
			if (nextFibo <= i) {
				fibos.add(nextFibo);
			} else {
				keepGoing = false;
			}
		}
		return fibos;
	}

}
