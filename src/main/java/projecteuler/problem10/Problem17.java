package projecteuler.problem10;

public class Problem17 {

	static String[] to_19 = { "zero", "one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine", "ten", "eleven", "twelve",
			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen" };
	static String[] tens = { "", "", "twenty", "thirty", "forty", "fifty",
			"sixty", "seventy", "eighty", "ninety" };
	static String[] denom = { "hundred", "thousand", "million", "billion",
			"trillion", "quadrillion", "quintillion", "sextillion",
			"septillion", "octillion", "nonillion", "decillion", "undecillion",
			"duodecillion", "tredecillion", "quattuordecillion",
			"sexdecillion", "septendecillion", "octodecillion",
			"novemdecillion", "vigintillion" };

	public static String numberWritten(int i) {
		String result;
		if (i < 20) {
			result = to_19[i];
		} else if (i < 100) {
			result = tens[i / 10];
			if (i % 10 != 0) {
				result += to_19[i % 10];
			}
		} else if (i < 1000) {
			result = to_19[i / 100] + denom[0];
			if (i % 100 != 0) {
				result = result + "and" + numberWritten(i % 100);
			}
		} else if (i == 1000) {
			result = to_19[1] + denom[1];
		} else {
			throw new IllegalArgumentException(i + "is not < 1000");
		}

		return result;
	}

	public static int calculateLettersUntil(int max) {
		int letters = 0;
		for (int i = 1; i <= max; i++) {
			letters += numberWritten(i).length();
		}
		return letters;
	}

	public static int numberLetters(int i) {

		return numberWritten(i).length();
	}
}
