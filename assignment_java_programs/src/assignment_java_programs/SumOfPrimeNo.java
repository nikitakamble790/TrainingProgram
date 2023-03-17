package assignment_java_programs;

import java.util.Scanner;

public class SumOfPrimeNo {

	public static void main(String[] args) {
		int n;
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int flag=0;
		int sum=2;
		for(int i=3;i<=n;i++) {
			int j=2;
			while(j<n) {
				if(i%j==0) {
					
					flag=1;
					break;
					
				}
				j++;
			}
			if(flag==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
