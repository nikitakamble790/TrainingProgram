package assignment_java_programs;

import java.util.Scanner;

public class LCMOfTwoNumbers {

	public static void main(String[] args) {
		int no1, no2, lcm=1;
		boolean i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		int m=no1*no2;
		int large = (no1 > no2) ? no1 : no2;
	//	while(i) {
			if (no1 % large == 0 && no2 % large == 0) {
				lcm = large;
				//break;
			}
			large++;
		}
		//System.out.println("by using second logic lcm of 2 no is:" + lcm);



	

}
