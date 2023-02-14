package Assignment3;

import java.util.Scanner;

public class PrimeNo {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter no");
		int no=sc.nextInt();
		int flag=0;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("not Prime no");
		}
		else
		{
			System.out.println("prime");
		}

	}

}
