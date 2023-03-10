package assignment_java_programs;

import java.util.*;

public class ArrayDisplayNbyN {

	public static void main(String[] args) {

		System.out.println("Enter one number input");
		Scanner sc=new Scanner(System.in);
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}

	}

}
