package assignment_java_programs;

import java.util.Scanner;

public class GCDOfTwoNumbers {

	public static void main(String[] args) {
		int no1, no2, gcd = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		/*for (int i = 1; i <= no1 && i <= no2; i++) {
			if (no1 % i == 0 && no2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println("GCD of 2 no is:" + gcd);*/
		
		gcd = 1;
		int small = (no1 > no2) ? no2 : no1;
		
		for (int i = small; i >= 1; i--) {
			if (no1 % i == 0 && no2 % i == 0) {
				gcd = i;
				break;
			}
		}
		System.out.println("by using second logic GCD of 2 no is:" + gcd);

	}

}
//code optimize
