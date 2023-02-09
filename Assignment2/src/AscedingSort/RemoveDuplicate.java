package AscedingSort;

import java.util.Scanner;

public class RemoveDuplicate {

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
		for(int i=1;i<size;i++)
		{
			for(int j=i+1;j<=size;j++)
			{
				if(arr[i]==arr[j])
				{
					for(int k=j+1;k<=size;k++)
					{
						arr[k-1]=arr[k];
					}
					size--;
					System.out.println(arr[i]+"is removed");
				}
			}
		}
		System.out.print("Final Array is:");
		for (int i = 1; i <= size; i++) {
			System.out.print(arr[i] + "\t");
		}


	}

}
