package Practice1;

public class fabonaciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1, c;
		System.out.print(a+"\t"+b);
		for(int i=3;i<=10;i++)
		{
			c=a+b;
			System.out.print("\t"+c);
			a=b;
			b=c;
		}
		

	}

}
