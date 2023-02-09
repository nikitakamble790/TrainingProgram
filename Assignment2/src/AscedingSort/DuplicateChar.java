package AscedingSort;

public class DuplicateChar {

	public static void main(String[] args) {
		String str= "Nikitaa";
        char ch,ch1;
      
        
      System.out.println("Original word: "+str);
       //Example word
        
      for (int i=0; i<str.length()-1; i++)
      {
    	  for(int j=i+1;j<str.length();j++)
    	  {
    		  ch= str.charAt(i);
    		  ch1= str.charAt(j);//extracts each character
    		  if(ch==ch1)
    		  {
    			  System.out.print("duplicate char is:"+ch+"\t");
    		  }
    	  }
         
      }
   


	}

}
