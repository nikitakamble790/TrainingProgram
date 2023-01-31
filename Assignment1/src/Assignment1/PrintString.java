package Assignment1;

public class PrintString {

	public static void main(String[] args) {
		String str= "Prorigo", rstr="";
        char ch;
        
      System.out.println("Original word: "+str);
       //Example word
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        rstr= rstr+ch; //adds each character in front of the existing string
        System.out.println(rstr);
      }
      
    
	}

}
