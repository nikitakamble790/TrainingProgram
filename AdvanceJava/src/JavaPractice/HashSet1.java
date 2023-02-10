package JavaPractice;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet hs= new HashSet();
		//default capacity is 16  default factor=0.75
		
		//configure default load factor
		//HashSet hs=new HashSet(100, (float)0.90);
		
		//HashSet hs=new HashSet(100);
		
		//HashSet <Integer> hs=new HashSet<Integer>();
		
		//add object
		hs.add(100);
		hs.add(55);
		hs.add("welcome");
		
		System.out.println(hs);
		
		//remove
		hs.remove(55);
		System.out.println(hs);	
		
		//contains
		System.out.println(hs.contains(100));
		
		//isempty
		System.out.println(hs.isEmpty());
		
		for(Object o:hs)
		{
			System.out.println(o);
		}
		
		HashSet hs1=new HashSet();
		//add all, remove all
		hs1.addAll(hs);
		System.out.println(hs1);
		
		hs1.removeAll(hs1);
		
		//Union, Intersection, difference
		
		hs1.add(44);
		hs1.add(33);
		hs1.add(33);
		hs.addAll(hs1);//union will store in first string
		System.out.println(hs);
		System.out.println(hs1);
		
		hs.retainAll(hs1);//Intersection
		System.out.println(hs);
		
		//difference
		hs.removeAll(hs1);
		System.out.println(hs);
		
		//subset
		
		
		

	}

}
