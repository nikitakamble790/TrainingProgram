package Assignment;

import java.util.*;

public class HashMapKey {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(10, "Red");
		map.put(20, "Green");
		map.put(40, "Black");
		map.put(50, "White");
		map.put(60, "Pink");
		Map<Integer,String> result=new HashMap<>();
		int key;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key to compare");
		key=sc.nextInt();
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> entry :map.entrySet()) {
			if(entry.getKey()<=key) {
				result.put(entry.getKey(), entry.getValue());
			}
		}
		
		System.out.println("result is: "+result);

	}

}
