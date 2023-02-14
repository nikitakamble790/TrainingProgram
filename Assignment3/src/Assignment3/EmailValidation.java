package Assignment3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		ArrayList <String> list1=new ArrayList<>();
		list1.add("nikitakamble@prorigo.com");
		String e= "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern p=Pattern.compile(e);
		
		for(String o:list1)
		{
			Matcher m=p.matcher(o);
			System.out.println(o+":"+m.matches()+"\n");
		}
	}

}
