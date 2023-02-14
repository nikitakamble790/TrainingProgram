package Assignment3;

import java.util.Scanner;

public class Queue {
	int front = 0, rear = 0;
	static Scanner sc = new Scanner(System.in);

	// System.out.println("ENter size of stack");
	// int size=sc.nextInt();
	int size = 100;
	int arr[] = new int[size];
	static int ch;
	static Queue obj = new Queue();

	public static void main(String[] args) {
		int j=1;
		while(j==1) {	
		System.out.println("Enter choice to perform stack operation:1.Enqueue\t2.Dequeue\t3.Capacity\t4.Display");
		 ch=sc.nextInt();
		
				

		switch(ch)
		{
		case 1:obj.Enqueue();
		break;
		case 2:obj.Dequeue();
		break;
		case 3:obj.Capacity();
		break;
		case 4:obj.Display();
		break;
		default:System.out.println("This is your default choice");
		}
	}

	}

	public void Enqueue() {
		if (rear == size) {
			System.out.println("queue is full");
		} else {

			System.out.println("ENter element which u want to push");
			int ele = sc.nextInt();

			arr[rear] = ele;
			rear = rear + 1;

			System.out.println("element is pushed");
			System.out.println("rear is:" + rear);
			System.out.println(arr[rear-1]);

		}

	}

	public void Dequeue() {
		if (front == rear) {
			System.out.println("queue is empty");
		} else {
			int ele = arr[front];
			for (int i = front; i < rear; i++) {
				arr[i] = arr[i + 1];
			}
			rear = rear - 1;

			System.out.println("element is deleted");
			System.out.println("rear is:" + rear);
			System.out.println(ele);

		}
	}
	public void Display() {
		System.out.print("elements are:");
		for(int i=front;i<rear;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	public void Capacity() {
		int len=rear;
		System.out.println("Capacity is:"+len);
	}

}
