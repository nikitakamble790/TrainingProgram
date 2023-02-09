package AscedingSort;

public class VowelConsonents {

	public static void main(String[] args) {
		String str= "Nikita";
        char ch;
        int vowel=0, consonant=0;
        
      System.out.println("String is: "+str);
       //Example word
        
      for (int i=0; i<str.length(); i++)
      {
    	  ch= str.charAt(i);
    	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='I' || ch=='E' || ch=='O' || 
    			ch=='U')
    	{
    		vowel++;
    	}
    	else
    	{
    		consonant++;
    	}
        
      }
      System.out.println("Count is: "+ vowel);
      System.out.println("Count is: "+ consonant);

	}

}
