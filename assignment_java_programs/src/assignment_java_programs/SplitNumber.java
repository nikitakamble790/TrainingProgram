package assignment_java_programs;

public class SplitNumber {

	public static void main(String[] args) {
		int no=123;
		while (no > 0) {
			int r = no % 10;
			System.out.print(r+"\t");
			no = no / 10;
		}

	}

}
