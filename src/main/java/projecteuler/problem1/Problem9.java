package projecteuler.problem1;

public class Problem9 {
	public static int solve() {

		int a, b;

		for (a = 0; a < 1000 / 3; a++) {
			for (b = a + 1; b < 1000 / 2; b++) {
				if (1000 * (a + b) - a * b == 500000) {
					int c = 1000 - a - b;
					System.out.println(String.format(
							"found solution: a = %s, b=%s, c=%s", a, b, c));
					return a * b * c;
				}

			}
		}
		return 0;

	}

	public static int solveBrute() {

		int a, b, c;

		for (a = 1; a < 1000 / 3; a++) {
			for (b = a + 1; b < 1000 / 2; b++) {
				for (c = b + 1; c < 1000; c++)
					if (a < b && b < c && a + b + c == 1000) {
						if (a * a + b * b == c * c) {
							System.out.println(String.format(
									"found solution: a = %s, b=%s, c=%s", a, b,
									c));
							return a * b * c;
						}
					}

			}
		}
		return 0;

	}
}
