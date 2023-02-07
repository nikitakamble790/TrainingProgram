package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add("X");
		al.add("Y");
		al.add("C");
		al.add("Z");
		al.add("A");
		al.add("B");
		
		System.out.println(al);
		ArrayList a1=new ArrayList();
		
	a1.addAll(al);
	System.out.println(a1);
	a1.removeAll(a1);
	System.out.println(a1);
	Collections.sort(al);
	System.out.println(al);
	Collections.sort(al,Collections.reverseOrder());
	System.out.println(al);
	
	//how to convert String or arrays into ArrayList
	String arr[]= {"cat","dog","monkey"};
	for(String value:arr)
	{
		System.out.println(value);
	}
	
	
	
	}

}
