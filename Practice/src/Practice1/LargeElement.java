package Practice1;

import java.util.Scanner;

public class LargeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("u are in 1st program");
		Scanner sc = new Scanner(System.in);
		int large = 0;
		int arr[] = new int[100];
		System.out.println("enter size of array");
		int size = sc.nextInt();
		for (int i = 1; i <= size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Elements are:");
		for (int i = 1; i <= size; i++) {
			System.out.print(arr[i] + "\t");
		}
		for (int i = 1; i <= size; i++) {
			for (int j = i + 1; j <= size; j++) {
				if (arr[i] > arr[j]) {
					large = arr[i];
				} else {
					large = arr[j];
				}
			}
		}
		System.out.println("\n large element is:" + large);

	}

}
