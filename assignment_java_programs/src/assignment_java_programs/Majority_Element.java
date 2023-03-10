package assignment_java_programs;

import java.util.*;

public class Majority_Element {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(1);
		al.add(4);
		al.add(1);
		al.add(1);
		al.add(2);
		al.add(2);
		
		int maj=al.size()/3;
		List<Integer> al1=new ArrayList();
		//System.out.println(maj);
		for(int i=0;i<al.size();i++)
		{
			
			//int count=0;
			int temp=al.get(i);
			int count=0;
			if(!al1.contains(temp))
			{
				
				for(int j=0;j<al.size();j++)
				{
					if(al.get(j)==temp)
					{
						count++;
					}
				}
				al1.add(temp);
			}
			if(count>maj)
			{
				System.out.print(temp+" ");
			}
			
			
		}
	}

}
