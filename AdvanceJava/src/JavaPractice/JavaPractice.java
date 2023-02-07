package JavaPractice;

import java.util.ArrayList;

public class JavaPractice {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		//ArrayList <Integer> al1=new ArrayList();
		ArrayList  al2=new ArrayList();
		al.add(100);
		al.add("no");
		al.add(true);
		System.out.println(al);
		
		//size
		int size1=al.size();
		System.out.println(size1);
		
		//remove
		al.remove(0);
		System.out.println(al);
		al.remove("no");
		System.out.println(al);
		
		//Insert new element
		al.add(1,90);
		System.out.println(al);
		
		//retrive specific element get()

		System.out.println(al.get(0));
		
		//set=change or replace
		al.set(1, "new object");
		System.out.println(al);
		
		//contains=return true or false
		System.out.println(al.contains("new object"));
		
		//isempty=true or false
		System.out.println(al.isEmpty());
		
		//addAll, removeAll
		al2.addAll(al);
		System.out.println(al2);
		
		al2.removeAll(al2);	
		System.out.println(al2);
		
		//sort
		//shuffle
		}

}
