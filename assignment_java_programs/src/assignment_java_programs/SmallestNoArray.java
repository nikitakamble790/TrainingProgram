package assignment_java_programs;

import java.util.*;

public class SmallestNoArray {

	public static void main(String[] args) {
		//int arr[]=new int[20];
		int arr1[]= {1,2,3,4};
		int j,k;
		int small=arr1[0];
		
		for(int i=1;i<arr1.length;i++)
		{	
				if(arr1[i]<small)
				{
					small=arr1[i];
					//k=i;
				}	
		}
		
		System.out.print("smallest no is:"+small);
		
		/*
		LinkedList<String> list = new LinkedList<String>();
		list.add("java");list.add("php");
		list.add("javascript");
		System.out.println("linked list:" + list);
		LinkedList<String> newlist = new LinkedList<String>();
		newlist.add("html");
		newlist.add("css");
		newlist.add("cpp");
		list.addAll(2, newlist);
		System.out.println("LinkedList" + list);
		*/

	}

}
