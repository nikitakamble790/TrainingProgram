package Practice1;

import java.util.Scanner;

public class ArrayProgram {
   //all array program trying with switch case and with method calling
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("All arrays program\tpress no to continue with programs\t1.Large element"
				+ "\t2.PeakElement\t3.Reverse Array\t4.sortArray");
		int choice = sc.nextInt();
		ArrayProgram obj = new ArrayProgram();
		switch (choice) {
		case 1:
			System.out.println("u are in 1st program");
			obj.LargeElement();
			break;
		case 2:
			obj.PeakElement();
			break;
		case 3:
			obj.reverseArray();
			break;
		}

	}

	// Find a peak element which is not smaller than its neighbours
	void LargeElement() {
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

	void PeakElement() {

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

	void reverseArray() {
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
	/*
	 * void sort() { int arr[]=new int[100]; //int arr1[]=new int[100];
	 * 
	 * System.out.println("enter size of array"); Scanner sc=new Scanner(System.in);
	 * int size=sc.nextInt(); for(int i=1;i<=size;i++) { arr[i]=sc.nextInt(); }
	 * System.out.print("Elements are:"); for(int i=1;i<=size;i++) {
	 * System.out.print(arr[i]+"\t"); } }
	 */
}
