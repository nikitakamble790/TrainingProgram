package assignment_java_programs;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int no1 = 0, no2 = 1, no3 = 0;
		int limit;
		System.out.println("ENter Limit upto where u want to print fabonacii");
		Scanner sc = new Scanner(System.in);
		limit = sc.nextInt();
		System.out.println("fabonacci series is: ");
		System.out.print(no1 + "\t" + no2 + "\t");
		no3 = no2 + no1;
		while (no3 <= limit) {
			System.out.print(no3 + "\t");
			no1 = no2;
			no2 = no3;
			no3 = no2 + no1;

		}
	}
}
