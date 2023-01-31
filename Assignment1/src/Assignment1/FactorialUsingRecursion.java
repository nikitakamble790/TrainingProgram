package Assignment1;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int no;
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		FactorialUsingRecursion obj1=new FactorialUsingRecursion();
		int fact=obj1.factorial(no);
		System.out.println("factorial is"+fact);


	}
	int factorial(int no)
	{
		int fact=1;
		int i=no;
		while(i>=1)
		{
			fact=fact*i;
			i--;
		}
		
		return fact;
	}

}
