package Assignment_1to150Question;

import java.util.Scanner;

//
public class Addition {

	public static void main(String[] args) {
		/*int i,s=0;
		for(i=0;i<args.length;i++)
		{
			s=s+Integer.parseInt(args[i]);
		}
		int sum=s/2;
		System.out.println(sum);*/
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int sum = a + b + c + d;
		int n;
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter divisible value");
		n = sc.nextInt();
		
		try {
			float f = sum / n;
			System.out.println("ans is " + f);
		      
		    } catch (Exception e) {
		    	System.out.println(e);
		    }
	}

}
