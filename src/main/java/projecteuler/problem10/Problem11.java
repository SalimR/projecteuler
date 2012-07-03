package projecteuler.problem10;

public class Problem11 {

	public static int findLargestProduct(int tupelsize, String field) {
		int result = 0;
		int[] intField = transformIntoArray(field);
		int fieldWidth = (int) Math.sqrt(intField.length);
		System.out.println("Breite: " + fieldWidth);
		for (int i = 0; i < intField.length; i++) {

			int toRight = tupleToTheRight(tupelsize, intField, fieldWidth, i);
			if (toRight > result) {
				result = toRight;
				System.out.println(String.format(
						"to the Right: index %s with value %s", i, result));
			}

			int toBottom = tupleToTheBottom(tupelsize, intField, fieldWidth, i);
			if (toBottom > result) {
				result = toBottom;
				System.out.println(String.format(
						"to the bottom: index %s with value %s", i, result));
			}
			int toBottomRight = tupleToBottomRight(tupelsize, intField,
					fieldWidth, i);
			if (toBottomRight > result) {
				result = toBottomRight;
				System.out.println(String.format(
						"to the bottom right: index %s with value %s", i,
						result));
			}
			int toBottomLeft = tupleToBottomLeft(tupelsize, intField,
					fieldWidth, i);
			if (toBottomLeft > result) {
				result = toBottomLeft;
				System.out.println(String
						.format("to the bottom left: index %s with value %s",
								i, result));
			}

		}
		return result;
	}

	private static int tupleToBottomLeft(int tupelsize, int[] intField,
			int fieldWidth, int i) {
		int diagonal = 1;

		for (int j = 0; j < tupelsize; j++) {
			int nextIndex = i + (j * (fieldWidth - 1));
			if (nextIndex < intField.length
					&& nextIndex / fieldWidth == i / fieldWidth + j) {
				diagonal *= intField[nextIndex];
			}
		}
		return diagonal;
	}

	private static int tupleToBottomRight(int tupelsize, int[] intField,
			int fieldWidth, int i) {
		int diagonal = 1;
		for (int j = 0; j < tupelsize; j++) {
			int nextIndex = i + (j * (fieldWidth + 1));
			if (nextIndex < intField.length) {
				diagonal *= intField[nextIndex];
			}
		}
		return diagonal;
	}

	private static int tupleToTheBottom(int tupelsize, int[] intField,
			int fieldWidth, int i) {
		int toBottom = 1;
		for (int j = 0; j < tupelsize; j++) {
			if (i + j * fieldWidth < intField.length) {
				toBottom *= intField[i + j * fieldWidth];
			}
		}
		return toBottom;
	}

	private static int tupleToTheRight(int tupelsize, int[] intField,
			int fieldWidth, int i) {
		int toRight = 1;
		for (int j = i; j < i + tupelsize; j++) {
			if (j / fieldWidth == i / fieldWidth) {
				toRight *= intField[j];
			}
		}
		return toRight;
	}

	static int[] transformIntoArray(String field) {
		String[] split = field.trim().split("\\s");
		int[] result = new int[split.length];
		for (int i = 0; i < split.length; i++) {
			result[i] = Integer.parseInt(split[i].trim());

		}
		return result;
	}

}
