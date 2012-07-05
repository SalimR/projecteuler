package projecteuler.problem10;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem13 {

	public static String calculateFirst10DigitsOfSum(String largeNumbers) {
		BigInteger sum = BigInteger.ZERO;
		List<BigInteger> numbers = parseBigIntegers(largeNumbers);
		for (BigInteger number : numbers) {
			sum = sum.add(number);
		}
		System.out.println(sum);
		return sum.toString().substring(0, 10);
	}

	static List<BigInteger> parseBigIntegers(String largeNumbers) {
		String[] numbers = largeNumbers.split("\\s");
		List<BigInteger> numbersAsBigInts = new ArrayList<BigInteger>(
				numbers.length);
		for (int i = 0; i < numbers.length; i++) {
			numbersAsBigInts.add(new BigInteger(numbers[i]));

		}
		return numbersAsBigInts;
	}

}
