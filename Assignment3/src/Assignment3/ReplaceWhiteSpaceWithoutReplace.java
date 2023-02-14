package Assignment3;

public class ReplaceWhiteSpaceWithoutReplace {

	public static void main(String[] args) {
		String str1="Nikita Babaso Kamble";
		String str2="";
		char ch;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=' ')
			{
				str2=str2+str1.charAt(i);
			}
		}
		System.out.println(str2);

	}

}
