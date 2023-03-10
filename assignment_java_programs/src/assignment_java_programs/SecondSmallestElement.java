package assignment_java_programs;

public class SecondSmallestElement {

	public static void main(String[] args) {
		int arr[] = { 44, 33, 66, 44, 99, 67 };
		int size = arr.length;
		int j = 0;
		int secondsmall = arr[size - j - 1];
		int small = arr[0];
		for (int i = 1; i < size; i++) {
			if (small > arr[i]) {
				small = arr[i];
				j = i;
			}
			if (secondsmall > arr[i] && j != i) {
				secondsmall = arr[i];
			}

		}
		System.out.println(" smallest:" + small);
		
		/*for (int i = 0; i < size; i++) {
			if (secondsmall > arr[i] && j != i) {
				secondsmall = arr[i];
			}
		}*/
		System.out.println("second smallest:" + secondsmall);
		

	}

}

//code optimize
