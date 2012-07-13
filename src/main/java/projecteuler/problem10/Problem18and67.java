package projecteuler.problem10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem18and67 {

	static class Pyramid {
		List<List<Integer>> rows = new ArrayList<>();
		int formattingHint;

		public Pyramid(String pyramid) {
			String[] unparsedRows = pyramid.split("\\n");
			for (String unparsedRow : unparsedRows) {
				String[] values = unparsedRow.split(" ");
				List<Integer> row = new ArrayList<>();
				for (String valueString : values) {
					row.add(Integer.valueOf(valueString));
				}
				rows.add(row);
			}
			formattingHint = pyramid.split("\\n")[0].length();
		}

		@Override
		public String toString() {
			StringBuilder result = new StringBuilder();
			for (List<Integer> row : rows) {
				for (Integer integer : row) {
					result.append(
							String.format("%0" + formattingHint + "d", integer))
							.append(" ");
				}
				result = result.deleteCharAt(result.length() - 1).append("\n");
			}
			result.deleteCharAt(result.length() - 1);
			return result.toString();
		}

		public int findBiggestPath() {
			for (int i = rows.size() - 2; i >= 0; i--) {

				List<Integer> currentRow = rows.get(i + 1);
				List<Integer> upperRow = rows.get(i);
				for (int j = 0; j < currentRow.size() - 1; j++) {
					int left = currentRow.get(j);
					int right = currentRow.get(j + 1);
					int max = Math.max(left, right);
					int valueToSet = upperRow.get(j) + max;

					upperRow.set(j, valueToSet);
				}

			}
			return rows.get(0).get(0);
		}

	}

	public static int findBiggestSum(String pyramid) {
		return new Pyramid(pyramid).findBiggestPath();
	}

	public static int findBiggestSum(InputStream resourceAsStream)
			throws IOException {
		if (resourceAsStream == null)
			throw new NullPointerException("stream was null");
		StringBuilder pyramid = new StringBuilder();
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				resourceAsStream));
		String line = reader.readLine();
		while (line != null) {
			pyramid.append(line).append("\n");
			line = reader.readLine();
		}

		return new Pyramid(pyramid.toString()).findBiggestPath();
	}

}
