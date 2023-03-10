package Assignment4;

import java.util.ArrayList;

public class Question1 {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		for(int i=0;i<100;i++)
		{
			list1.add(i);
		}
		System.out.println(list1);
		System.out.println("Even no are:");
		for(int i=1;i<=100;i++)
		{
			if(list1.indexOf(i)%2==0)
			{
				System.out.print(list1.indexOf(i)+"\t");
			}
		}
	}
}
