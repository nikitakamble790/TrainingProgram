package Practice1;

import java.util.Scanner;

public class demo123 {

	public static void main(String[] args) {
		
	    //practice programs contains all basic concept programs
		
		  Scanner sc=new Scanner(System.in);
		//simple program 
          System.out.println("new program");
          int x=30;
          int y=20;
          int z=x+y;
          System.out.println("output is"+(x+y)+"now");
          
          //creating object of class
          demo123 d1= new demo123();
          
          //using conditional statement
         int max=(x>y)? x:y; 
         System.out.println((x>y)?x:y);
         System.out.println(max);
         
         //using if block
         if(x<0)
        	 System.out.println("positive");
         else
        	 System.out.println("neg");
         int i=1;
         
         
         //using do while
         do
         {
        	 System.out.println(i);
         i++;
         }
         while(i<=10);
         
         
         //using for loop
         for(i=1;i<=10;i++)
         {
        	 	System.out.println(i);
        	 	
         }
         
         
         //using nested for loop
         int j, k;
         
         for(j=1;j<=4;j++)
         {
           for(k=1;k<=j;k++)
           {
        	   System.out.print("*");
           }
           System.out.println();
         }
         
         //using switch case statement
         char g='b';
         switch(g)
         {
         case 'a':System.out.println("first");
         break;
         case 'b':System.out.println("secomd");
         break;
         case 'c': System.out.println("third");
         break;
         
         }
         
         //using switch case
         String day="hh";
         switch(day) {
         case "mon":System.out.println("monday");
         break;
         case "tue":System.out.println("tue");
         break;
         case "wen":System.out.println("wen");
         break;
         case "fri":System.out.println("mondfiray");
         break;
         case "sun":System.out.println("sinhdh");
         break;
         default:System.out.println("hhhhhhhhhhhhhhhhhhh");
         
         
         }
		
         //getting input
		 System.out.println("enter int value");
         int h= sc.nextInt();
         System.out.println("h value is:"+h);
         
		 System.out.println("enter float value");
         float l=sc.nextFloat();
         System.out.println("value is"+l);
         
		 System.out.println("enter double value");
         double d=sc.nextDouble();
         System.out.println("double value is:"+d);
         
		 System.out.println("enter int value");
		 String st=sc.next();
		 System.out.println("string is"+st);
		 
		 //learn array
		 System.out.println("enter size of an array");
		 int size=sc.nextInt();
		 int arr[]= new int[size];
		 for(int n=0;n<size;n++)
		 {
			 System.out.print("enter"+n+" value");
			 arr[n]=sc.nextInt();
			 
		 }
		 
		 System.out.print("array is:");
		 for(int n=0;n<size;n++)
		 {
			 System.out.print(arr[n]+"\t");
			
		 }
		
		 
		 
         
        
	
	}
	

}
