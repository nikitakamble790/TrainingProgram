package Practice1;

import java.util.Scanner;

public class SortArray {

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
				if(arr[i]>arr[j])
				{
					int swap=arr[i];
					arr[i]=arr[j];
					arr[j]=swap;
				}
			}
		}
		System.out.print("sort is:");
		for (int i = 1; i <= size; i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}

}
