package AscedingSort;

public class UpperToLower {

	public static void main(String[] args) {
		String str1="Nikita Babaso Kamble";    
        StringBuffer newStr=new StringBuffer(str1);    
            
        for(int i = 0; i < str1.length(); i++) {    
                
            
            if(Character.isLowerCase(str1.charAt(i))) {    
            	//char ch=(char) Character.toUpperCase(i);
            	
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
             
            else if(Character.isUpperCase(str1.charAt(i))) {    
                //Convert it into upper case using toLowerCase() function    
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
            }    
        }    
        System.out.println("String after case conversion : " + newStr);    

	}

}
