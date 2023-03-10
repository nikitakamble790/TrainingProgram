package OopsConcepts;

//Single level inheritance
//multi-level inheritance
//multiple inheritance
class A{
	int a,b;
	public void Display()
	{
		System.out.println(a+b);
	}
}
class B extends A{
	int x,y;
	public void Show()
	{
		System.out.println(x+y);
	}
}
class C extends B{
	
}

public class Test1 {

	public static void main(String[] args) {
		/*A obj=new A();
		obj.a=10;
		obj.b=20;
		obj.Display();*/
		
		/*B obj1=new B();
		obj1.x=100;
		obj1.y=200;
		obj1.Show();
		
		obj1.a=2;
		obj1.Display();*/
		
		C obj2=new C();
		obj2.b=30;
		

	}

}
