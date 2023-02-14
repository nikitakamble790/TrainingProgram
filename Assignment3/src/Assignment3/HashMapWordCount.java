package Assignment3;

import java.util.HashMap;
import java.util.Scanner;


public class HashMapWordCount {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string, word seperated by space");
		str=sc.nextLine();
		HashMap<String, Integer> m=new HashMap<>();
		
		String word[]=str.split(" ");
		int count;
		for(String obj:word)
		{
			if(m.containsKey(obj))
			{	
				//count=m.get(word);
				//count=count+1;
				//m.put(obj, count);
				m.put(obj, m.get(obj)+1);
			}
			else
			{
				m.put(obj, 1);
			}
		}
		System.out.println(m);
	}

}
