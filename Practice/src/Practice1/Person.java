package Practice1;

import java.util.Scanner;

public class Person {
	//ATM class and Person class both are for practice of methods calling, object creation and oops concept

	Scanner sc =new Scanner(System.in);
	 public String name;
	public int age2;
	int age;
	NewName obj4=new NewName();
	//obj4.age4=40;
	void insert()
	{
		System.out.println("Enter Emplye Information");
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("name is:"+name);
		System.out.println("Enter name");
		age=sc.nextInt();
		System.out.println("name is:"+age);
		obj4.age4=40;
	}
	void talk()
	{
		String newname;
		System.out.println("to change method");
		NewName obj1=new NewName();
		name=obj1.new_name();
	}
	
	
	int z;
	Person(int z)
	{
		
	}
	void showage()
	{
		System.out.println("constructor person value:"+z);
	}
	
}
 class NewName{
	 Scanner sc =new Scanner(System.in);
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
	         //Person obj=new Person();
	         //obj.insert();
	         //obj.talk();
		}
	 public int age4;
       
       //obj3.age2=sc.nextInt();
     
	 String new_name()
	 {
		 System.out.println("U  have selected choice to rename");
		 System.out.println("enter name to rename");
	
		 
	       //obj3.age2=sc.nextInt();
		String name = sc.next();
		return name;
		
	 }
	
}
