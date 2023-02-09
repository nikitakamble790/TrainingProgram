package AscedingSort;

import java.util.Scanner;

public class LeftRotate {

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
		System.out.print("\n");
		int count=0;
		for(int i=1;i<=size;i++)
		{
			
			int temp=arr[1];
			for(int j=1;j<size;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[size]=temp;
			count++;
			System.out.print(count+" :rotation:");
			for (int k = 1; k <= size; k++) {
				System.out.print(arr[k] + "\t");
			}
			System.out.print("\n");
			
			
		}


	}

}
