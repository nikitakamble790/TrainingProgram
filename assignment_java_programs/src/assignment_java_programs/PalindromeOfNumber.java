package assignment_java_programs;

public class PalindromeOfNumber {

	public static void main(String[] args) {
		int no = 123210;
		int temp = no;
		int reverse = 0;
		while (no > 0) {
			int r = no % 10;
			reverse = reverse * 10 + r;
			no = no / 10;
		}
		if (temp == reverse) {
			System.out.println("no is palindrome");
		} else {
			System.out.println("no is not palindrome");
		}
	}

}
