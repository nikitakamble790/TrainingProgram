package Assignment;

import java.util.regex.*;

public class StringValidation {

	public static void main(String[] args) {
		Pattern p=Pattern.compile(".[p].");
		Matcher m=p.matcher("NNipkitaq");
		if(m.find()) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
