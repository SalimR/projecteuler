package projecteuler.problem20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem22 {

	static String alpha = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static int calculateWorth(String name) {
		int result = 0;
		for (int i = 0; i < name.length(); i++) {
			int worth = alpha.indexOf(name.charAt(i));
			if (worth < 1) {
				throw new IllegalArgumentException("invalid char: "
						+ name.charAt(i));
			}
			result += worth;

		}
		return result;
	}

	public static long calculateSumOfScores(String names) {

		String[] namesArray = names.split(",");
		Arrays.sort(namesArray);

		long result = 0;
		for (int i = 0; i < namesArray.length; i++) {
			String name = namesArray[i];
			result = result + calculateWorth(name) * (i + 1);

		}

		return result;
	}

	// public static int findBiggestSum(InputStream resourceAsStream)
	// throws IOException {
	// if (resourceAsStream == null)
	// throw new NullPointerException("stream was null");
	// StringBuilder pyramid = new StringBuilder();
	// BufferedReader reader = new BufferedReader(new InputStreamReader(
	// resourceAsStream));
	// String line = reader.readLine();
	// while (line != null) {
	// pyramid.append(line).append("\n");
	// line = reader.readLine();
	// }
	//
	// return new Pyramid(pyramid.toString()).findBiggestPath();
	// }

	public static long calculateSumOfScoresIo(InputStream resourceAsStream)
			throws IOException {

		if (resourceAsStream == null)
			throw new NullPointerException("stream was null");
		StringBuilder pyramid = new StringBuilder();
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				resourceAsStream));
		String line = reader.readLine();
		line = line.replaceAll("\"", "");
		return calculateSumOfScores(line);
	}
}
