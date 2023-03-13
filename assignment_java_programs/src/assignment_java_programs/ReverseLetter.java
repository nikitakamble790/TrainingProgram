package assignment_java_programs;

public class ReverseLetter {

	public static void main(String[] args) {
		String str="ab-12cd";
		System.out.println("original string:"+str);
		String re=Reverse(str);
		System.out.println("reversed string:"+re);

	}
	static String Reverse(String str)
	{
		
		char arr[]=str.toCharArray();
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			
			if(!Character.isLetter(arr[start])) {
				start++;
			}
			else if(!Character.isLetter(arr[end])) {
				end--;
			}
			else {
				char temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
			
		}
		return String.valueOf(arr);
	}
	
}
