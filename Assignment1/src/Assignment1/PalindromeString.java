package Assignment1;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String str= "Nikita", rstr="";
        char ch;
        
      System.out.println("Original word: "+str);
       //Example word
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        rstr= ch+rstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ rstr);
      if(str.equals(rstr))
      {
    	  System.out.println("String is palindrome");
      }
      else
      {
    	  System.out.println("String is not palindrome");
      }
    }
		

	

}
