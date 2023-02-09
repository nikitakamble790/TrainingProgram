package AscedingSort;

public class CountChar {

	public static void main(String[] args) {
		// having doubt null char at end of string
		String str = "Nikita";
		char ch;
		int count = 0;

		System.out.println("Original word: " + str);
		// Example word

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); // extracts each character
			count++;
		}
		System.out.println("Count is: " + count);
	}

}
