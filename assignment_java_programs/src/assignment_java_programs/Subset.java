package assignment_java_programs;

public class Subset {

	public static void main(String[] args) {
		String str="Nikita";
		int len=0;
		char arr[]=str.toCharArray();
		//String subsetArray[] = new String[numberOfChar * (numberOfChar + 1) / 2];

		String result[]= {};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				result[len]=str.substring(i, j);
				len++;
				
			}
		}
		System.out.println("n");
		
	}

}
