package projecteuler.problem1;

public class Problem8 {

	public static int findLargestProduct(int inter, String n) {
		int[] number = new int[n.length()];
		for (int j = 0; j < n.length(); j++) {
			number[j] = Integer.parseInt("" + n.charAt(j));
		}

		int maxProd = 0;

		for (int i = 0; i < number.length - inter; i++) {
			int newProd = 1;
			for (int offset = 0; offset < inter; offset++) {
				newProd *= number[i + offset];
			}
			if (newProd > maxProd) {
				maxProd = newProd;
				System.out.println("found " + newProd + " at index " + i);
			}
		}

		return maxProd;
	}

}
