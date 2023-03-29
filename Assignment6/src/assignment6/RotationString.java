package assignment6;

public class RotationString {
	static int count=0;
	public static void main(String[] args) {
		String str="abcd";
		String str1="dabc";
		int flag=0;
		int i=0;
		while(i<3) {
			if(str==str1) {
				System.out.println("string equal");
				 flag=1;
				break;
			}
			str=rotate(str);
			System.out.println("string rotated "+str);	
			i++;
		}
	}
	static String rotate(String str) {
		count++;
		System.out.println(count);
		String temp="";
		char arr[]=str.toCharArray();
		for(int i=1;i<arr.length;i++) {
			 temp=temp+arr[i];
		}
		temp=temp+arr[0];
		str=temp;
		System.out.println("string rotated "+str);
		return str;
	}

}
