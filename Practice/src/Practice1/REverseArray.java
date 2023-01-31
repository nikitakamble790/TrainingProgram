package Practice1;

import java.util.Scanner;

public class REverseArray {

	public static void main(String[] args) {
		
		int arr[] = new int[100];
		// int arr1[]=new int[100];

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
		int j = size;

		for (int i = 1; i < j; i++) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
		System.out.print("\nreverse of array is:");
		for (int i = 1; i <= size; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
