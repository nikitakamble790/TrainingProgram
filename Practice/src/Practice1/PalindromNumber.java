package Practice1;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		no=sc.nextInt();
		
		
		int reverse=0,re;
		int temp=no;
		while(no>0)
		{
			re=no%10;
			reverse=reverse*10+re;
			no=no/10;
		}
		System.out.println("reverse no is:"+reverse);
		if(temp==reverse)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}

	}

}
