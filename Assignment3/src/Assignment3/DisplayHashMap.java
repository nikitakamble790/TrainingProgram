package Assignment3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DisplayHashMap {

	public static void main(String[] args) {
		HashMap m=new HashMap();

		m.put(101, "Nikita");
		m.put(102, "Shivani");
		m.put(103, "Pranali");
		m.put(104, "Sanika");
		m.put(105, "Sanket");
		m.put(106, "Karan");
		System.out.println("using simple way");
		System.out.println(m);
		System.out.println("using Advance forloop");
		//using advance for loop
		for(Object obj:m.keySet())
		{
			System.out.println("Key is "+obj+" value is "+m.get(obj));
		}
		System.out.println("using while loop");
		//using while
		Set s=m.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			//Map.Entry<K, V> entry=it.next();
		}
		
		
		

	}

}
