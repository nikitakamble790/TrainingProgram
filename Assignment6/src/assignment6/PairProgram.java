package assignment6;

public class PairProgram {

	public static void main(String[] args) {
		int arr[]= {1,4,3,2};
		int key=5;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]+arr[j]==5) {
					System.out.println("{"+arr[i]+","+arr[j]+"}");
				}
			}
		}
	}

}
