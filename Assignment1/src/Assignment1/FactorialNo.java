package Assignment1;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		int no;
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		int fact=1;
		int i=no;
		while(i>=1)
		{
			fact=fact*i;
			i--;
		}
		System.out.println("factorial is"+fact);

	}

}
