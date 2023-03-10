package assignment_java_programs;

import java.util.*;

public class Union_Intersection {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(1);
		al.add(4);
		al.add(1);
		al.add(1);
		al.add(2);
		al.add(2);

		ArrayList<Integer> al1 = new ArrayList();
		al1.add(6);
		al1.add(7);
		al1.add(8);
		al1.add(1);
		al1.add(44);
		al1.add(6);
		al1.add(9);
		al1.add(2);
		al1.add(2);
		ArrayList<Integer> union = new ArrayList();

		for (int i = 0; i < al.size(); i++) {
			if (!union.contains(al.get(i))) {
				union.add(al.get(i));
			}
		}
		for (int i = 0; i < al1.size(); i++) {
			if (!union.contains(al1.get(i))) {
				union.add(al1.get(i));
			}
		}
		System.out.println("union is: "+union);
		ArrayList<Integer> inters = new ArrayList();
		for (int i = 0; i < al.size(); i++) {
			int temp=al.get(i);
			if(!inters.contains(temp)) {
				for (int j = 0; j < al1.size(); j++) {
					if(temp==al1.get(j))
					{
						inters.add(temp);
					}
				}
			}
		}
		System.out.println("Intersection is: "+inters);
	}

}
