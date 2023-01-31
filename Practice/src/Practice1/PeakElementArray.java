package Practice1;

import java.util.Scanner;

public class PeakElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[100];
		int arr1[] = new int[100];
		int j = 1;
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
		for (int i = 2; i < size; i++) {
			if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {

				arr1[j] = arr[i];
				j++;
			}
		}
		System.out.println("\n peak point element is element is:");
		for (int i = 1; i <= j; i++) {
			System.out.print(arr1[i] + "\t");
		}

	}

}
