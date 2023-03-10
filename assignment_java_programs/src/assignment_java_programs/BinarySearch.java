package assignment_java_programs;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {2, 3, 4, 5, 66, 77, 88};
		System.out.println("enter value which u want to search");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int size = a.length;
		int beg = 0, end = size - 1, mid;
		int flag=0;
		while (beg <= end) {
			mid = (beg + end) / 2;
			if (a[mid] == val) {
				System.out.println("element found");
				flag=1;
				break;							
			}
			if (a[mid] < val) {
				beg=mid+1;
			}

			if (a[mid] > val) {
				end=mid-1;
			}
			
		}
		if(flag==0)
		{
			System.out.println("element is not found");
		}
	}
}
