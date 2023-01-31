package Practice1;

import java.util.Scanner;

public class PalindromeArray {

	public static void main(String[] args) {
		int arr[] = new int[100];
		

		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for (int i = 1; i <= size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Elements are:");
		for (int i = 1; i <= size; i++) {
			System.out.print(arr[i] + "\t");
		}
		int flag=0;
		for(int i=1;i<=size/2;i++)
		{
			if(arr[i]!=arr[size-i+1])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Array is not palindrome");
			
		}
		else
		{
			System.out.println("Array is palindrome");
		}

	}

}
