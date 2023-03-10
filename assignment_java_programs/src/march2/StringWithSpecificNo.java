package march2;

import java.util.regex.*;

public class StringWithSpecificNo {

	public static void main(String[] args) {
		System.out.println(validate("5-2345861"));
		System.out.println(validate("6-2345861"));
		System.out.println(validate("A-5555861"));
        }

   public static String validate(String text) {
	    Pattern pattern = Pattern.compile("^[0-9](.+)$");
		 Matcher m = pattern.matcher(text);
		
	   if (m.find()) {
		   return "Found a match!";
	   }
       else {
    	   return "Not matched!";
       }
                
   }	

}
