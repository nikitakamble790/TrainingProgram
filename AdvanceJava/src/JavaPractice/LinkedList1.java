package JavaPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// Declare LinkedList
		LinkedList l1 = new LinkedList();

		// LinkedList <Integer> l2=new LinkedList<Integer>();
		// Add elements
		l1.add(100);
		l1.add("new");
		l1.add('a');
		System.out.println(l1);

		// size
		System.out.println(l1.size());

		// remove
		l1.remove(2);// by passing index
		System.out.println(l1);
		l1.add(100);
		l1.add("new");
		l1.add('c');
		System.out.println(l1);

		// Insert new element in middle
		l1.add(1, 11);
		l1.add(1, "new1");
		System.out.println("new list after insertion" + l1);
		// retriving value from

		System.out.println(l1.get(1));

		// replace value with new value
		l1.set(1, "welcome");
		System.out.println(l1);

		// contains
		System.out.println(l1.contains('c'));

		// empty or not
		System.out.println(l1.isEmpty());
		
		//read data using for
		for(int i=0;i<l1.size();i++)
		{
			System.out.print(l1.get(i)+"\t");
		}
		
		//read data using for each
		for(Object e:l1)
		{
			System.out.print(e+"\t");
		}
		
		//read data using iterator
		//Iterator it=l1.Iterator();

	}

}
