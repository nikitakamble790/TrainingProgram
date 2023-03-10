package march2;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class HashMapKey {

	public static void main(String[] args) {
		HashMap<Integer,String> h1=new HashMap<Integer,String>();      
		  // Put elements to the map 
		 h1.put(1, "Red");
		  h1.put(2, "Green");
		  h1.put(3, "Black");
		  h1.put(4, "White");
		 h1.put(5, "Blue");
		    
		   for (Map.Entry<Integer,String> entry : h1.entrySet())
		   {
		    System.out.println(	entry.getKey() + "=>" + entry.getValue());
		   }

	}

}
