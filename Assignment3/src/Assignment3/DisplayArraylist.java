package Assignment3;

import java.util.ArrayList;
import java.util.Iterator;

public class DisplayArraylist {

	public static void main(String[] args) {
		ArrayList fruit=new ArrayList();
		fruit.add("apple");
		fruit.add("banana");
		fruit.add("orange");
		fruit.add("fig");
		fruit.add("papaya");
		fruit.add("staberry");
		
		System.out.println(fruit);
		
		//using advance for
		System.out.println("using for each");
		for(Object obj:fruit)
		{
			System.out.print(obj+"\t");
		}
		
		int count=fruit.size();
		//System.out.println(count);
		System.out.println("using for");
		for(int i=0;i<count;i++)
		{
			System.out.print(fruit.get(i)+"\t");
		}
		
		//using while
		System.out.println("Using while");
		Iterator it=fruit.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+"\t");
		}

	}

}
