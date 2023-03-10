package JavaPractice;

import java.util.Scanner;

public class ClassObject {

	public static void main(String[] args) {
		System.out.println("enter name and age");
		Scanner sc=new Scanner(System.in);
	// 	String name=
		Employe e1=new Employe();
		
		e1.age=20;
		e1.name="Nikita";
		e1.Display();
		//System.out.println("age is:"+e1.age);
		
	}

}
class Employe
{
	String name;
	int age;
	Scanner sc=new Scanner(System.in);
	/*public Employe(String name, int age) {
	
		this.name = name;
		this.age = age;
	}*/
	void Display()
	{
		System.out.println("enter name and age");
		//name=sc.nextLine();
		//age=sc.nextInt();
		System.out.println("info is:"+name+" "+age);
		
	}
	
	
}
