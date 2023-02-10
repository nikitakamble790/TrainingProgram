package JavaPractice;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(2);
		l.add(5);
		l.add(6);
		l.addFirst(22);
		l.addLast(90);
		
		
		LinkedList l1=new LinkedList();
		l1.addAll(l);
		System.out.println(l1);
		l1.removeAll(l1);
		System.out.println(l1);
		
		//sort
		Collections.sort(l);
		System.out.println(l);
		
		//reverse sort
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		
		//shuffle
		//Collections.shuffle(l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		l.removeLast();
		l.removeFirst();
		System.out.println(l);
	}

}
