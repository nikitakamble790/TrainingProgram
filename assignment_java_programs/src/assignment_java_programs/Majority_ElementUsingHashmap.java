package assignment_java_programs;

import java.util.*;

public class Majority_ElementUsingHashmap {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,3,2,1,1,2,2,3,4,4};
		majority(arr);

	}
	static void majority(int arr1[])
	{
		HashMap<Integer,Integer> hm=new HashMap();
		int n=arr1.length;
		for(int i=0;i<n;i++)
		{
			//int temp=arr1[i];
			if(hm.containsKey(arr1[i]))
			{
				hm.put(arr1[i], hm.get(arr1[i])+1);	
			}
			else {
				hm.put(arr1[i], 1);
			}
		}
		for(int key:hm.keySet()) {
			if(hm.get(key)>n/3)
			{
				System.out.println(key);
			}
		}
	}

}
