package file_handlin;

import java.util.*;

public class NameList {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("nikita");
		names.add("smita");
		names.add("sneha");
		names.add("vidya");
		names.add("nikita123");
		names.add("vivek");
		names.add("ankita");
		names.add("kajal");
		names.add("komal");
		List<String> arr1 = new ArrayList<String>();
		List<Character> chars = new ArrayList<>();
		for (String obj : names) {
			char temp = obj.charAt(0);
			if (!chars.contains(temp)) {
				chars.add(temp);
			}
		}
		
		for (int i = 0; i < chars.size(); i++) {
			List<String> newList = new ArrayList<>();
			for (int j = 0; j < names.size(); j++) {
				String obj = names.get(j);
				char temp = obj.charAt(0);
				if (chars.get(i) == temp) {
					newList.add(names.get(j));
				}
			}	
			System.out.print(newList+" ");
		}
		
	}
}
