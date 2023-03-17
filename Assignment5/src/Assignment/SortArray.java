package Assignment;

import java.util.*;

public class SortArray {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("Nikita");
		al.add("Susmita");
		al.add("Vrushali");
		al.add("Kanika");
		al.add("Rahul");
		al.add("Janak");
		System.out.println("original list: "+al);
		Collections.sort(al);
		System.out.println("after ascending sorting: "+al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("after descending sorting: "+al);
		
	}

}
