package assignment6;

import java.util.regex.Pattern;

public class VowelString {

	public static void main(String[] args) {
		String str="NikitaBabasoKamble";
		int count=0;
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			boolean result=Pattern.matches("[aeiouAEIOU]", str.substring(i, i+1));
			System.out.print(str.substring(i, i+1));
			System.out.println(": "+result);
			if(result==true) {
				count++;
			}
		}
		System.out.println("total no of vowels are present:"+count);

	}

}
