package AscedingSort;

public class MaxMinChar {

	public static void main(String[] args) {
		String str= "Nikita";
        char ch, ch1;
        int max=0, min=0;
        char maxocc ='a',minocc;
        
      System.out.println("Original word: "+str);
       //Example word
        
      for (int i=0; i<str.length(); i++)
      {
    	  int count=1;
    	  for(int j=i+1;j<str.length();j++)
    	  {
    		  ch= str.charAt(i);
    		  ch1= str.charAt(j);//extracts each character
    		  if(ch==ch1)
    		  {
    			  count++;
    			 
    		  }
    	  }
    	  if(count>max)
    	  {
    		  max=count;
    		  maxocc=str.charAt(i);
    	  }
    	  else if(count<min)
    	  {
    		  min=count;
    		  minocc=str.charAt(i);
    	  }
      }
      System.out.println("maxoccring: "+maxocc);


	}

}
