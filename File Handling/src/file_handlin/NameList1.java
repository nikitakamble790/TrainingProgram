package file_handlin;

import java.util.*;

public class NameList1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		al.add("raj");
		al.add("ravi");
		al.add("aditya");
		al.add("vikram");
		al.add("ravindra");
		// System.out.println("original List " + al);
		// ArrayList<String> newlist = new ArrayList();
		List<Character> chars = new ArrayList<>();
		for (int i = 0; i < al.size(); i++) {
			String temp = al.get(i);
			char a = temp.charAt(0);
			ArrayList<String> newlist = new ArrayList();
			if (!chars.contains(a)) {
				for (int j = 0; j < al.size(); j++) {
					String str = al.get(j);
					char aa = str.charAt(0);
					if (temp.charAt(0) == str.charAt(0)) {
						// System.out.println("divided list : " + newlist);
						newlist.add(str);
						chars.add(a);
					}
				}
				System.out.print(newlist + " ");
			}
								
		}

		/*
		 * List<String> names = new ArrayList<String>(); names.add("nikita");
		 * names.add("smita"); names.add("sneha"); names.add("vidya");
		 * names.add("vivek"); names.add("ankita"); names.add("kajal"); List<String>
		 * arr1 = new ArrayList<String>(); List<Character> chars = new ArrayList<>();
		 * for (String obj : names) { char temp = obj.charAt(0); char char1 = 'a'; if
		 * (!chars.contains(temp)) { chars.add(temp); char1 = temp; }
		 * 
		 * List<String> newList = new ArrayList<>(); for (int j = 0; j < names.size();
		 * j++) { String obj1 = names.get(j); char temp1 = obj1.charAt(0); if (char1 ==
		 * temp1) { newList.add(names.get(j)); }
		 * 
		 * System.out.print("new devided list of " + char1 + " char is: "); for (int k =
		 * 0; k < newList.size(); k++) { System.out.print(newList.get(k) + " "); }
		 * System.out.println(); } }
		 * 
		 * }
		 */
	}
}
