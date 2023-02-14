package Assignment3;

import java.util.Scanner;

public class Stack {
	static Scanner sc=new Scanner(System.in);
	int top=-1;
	//System.out.println("ENter size of stack");
	//int size=sc.nextInt();
	int size=100;
	int arr[]=new int[size];
	static int ch;
	static Stack obj=new Stack();
	
	public static void main(String[] args) {
		int j=1;
		while(j==1) {	
		System.out.println("Enter choice to perform stack operation:1.Push\t2.pop\t3.IsEmpty\t4.Size\t5.display");
		 ch=sc.nextInt();
		
				

		switch(ch)
		{
		case 1:obj.Push();
		break;
		case 2:obj.pop();
		break;
		case 3:obj.IsEmpty();
		break;
		case 4:obj.Size();
		break;
		case 5:obj.Display();
		break;
		default:System.out.println("This is your default choice");
		}
	}
		
			
	}
	public void Push() {
		if(top>=size)
		{
			System.out.println("Stack is overflow");
		}
		else
		{
			System.out.println("ENter element which u want to push");
			int ele=sc.nextInt();
			top=top+1;
			arr[top]=ele;
			
			System.out.println("element is pushed");
			System.out.println("top is:"+top);
			System.out.println(arr[top]);
		}
	}
	public void pop() {
		if(top==-1)
		{
			System.out.println("Stack is is empty");
		}
		else
		{
			int ele=arr[top];
			top=top-1;;
			System.out.println(ele+" element is poped");
		}
	}
	public void IsEmpty() {
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Stack is is not empty");
		}
	}
	public void Size() {
		int len=top+1;
		System.out.println("size of stack is: "+len);
		
	}
	public void Display() {
		System.out.print("stack element is:");
		for(int i=top;i>-1;i--)
		{
			
			System.out.println(arr[i]);
		}
	}

}
