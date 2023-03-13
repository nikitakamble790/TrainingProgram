package assignment_java_programs;

import java.util.*;

public class Union_Intersection {

	public static void main(String[] args) {
		//String str1="This is";
		
		String str="This is";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
		int size=str.length();
		//formula n*(n+1)/2
		
		int temp=0;
		String subsetArray[] = new String[size * (size + 1) / 2];
		System.out.println(subsetArray.length);
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				subsetArray[temp] = str.substring(i, j + 1);
				temp++;
			}
		}
		for (int i = 0; i < subsetArray.length; i++) {
			//System.out.println(subsetArray[i]);
		}
		int count=0;
		System.out.println("repeated substring is:");
		Map<String, Integer> map=new HashMap<String, Integer>();
		for(int i=0;i<subsetArray.length-1;i++)
		{
			String temp1=subsetArray[i];
			
			if(temp1.length()>=2) {
				//System.out.println(temp1);
				for(int j=i+1;j<subsetArray.length-1;j++)
				{
					System.out.println("subset i:"+subsetArray[i]+" subset j:"+subsetArray[j]);
					if(subsetArray[i]==subsetArray[j]) {
						System.out.println();
						System.out.println();
						System.out.println("new");
						System.out.println("repeated substring is:"+subsetArray[i]);
						count++;
					}
				}
			}
		}
		System.out.println(count);
		
}
}

