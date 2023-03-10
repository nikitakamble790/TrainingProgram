package assignment_java_programs;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit of natural no");
		n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum is:"+sum);
	}

}
