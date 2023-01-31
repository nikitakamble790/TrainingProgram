package Assignment1;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		
		int reverse=0, re;
		while(no>0)
		{
			re=no%10;
			reverse=reverse*10+re;
			no=no/10;
		}
		System.out.println("reverse no is "+reverse);
		
	}

}
