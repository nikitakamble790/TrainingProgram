package Assignment3;

public class PascalTraingle {

	public static void main(String[] args) {
		int n = 4, i, j;
		PascalTraingle g = new PascalTraingle();
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= n - i; j++) {

				// for left spacing
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {

				// nCr formula
				System.out.print(" " + g.factorial(i) / (g.factorial(i - j) * g.factorial(j)));
			}

			// for newline
			System.out.println();
		}
	}

	public int factorial(int i) {
		if (i == 0)
			return 1;
		return i * factorial(i - 1);
	}

}
