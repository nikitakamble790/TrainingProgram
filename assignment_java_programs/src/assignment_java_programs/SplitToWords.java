package assignment_java_programs;

public class SplitToWords {

	public static void main(String[] args) {
		String str="This new string th";
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].contains(arr[j])) {
					System.out.println(arr[j]);
				}
			}
		}
		

	}

}
