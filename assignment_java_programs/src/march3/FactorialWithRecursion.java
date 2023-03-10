package march3;

public class FactorialWithRecursion {

	public static void main(String[] args) {
		int num=3,f;
		f=fact(num);
		System.out.println(f);
	}
	static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return(n*fact(n-1));
		}
				
		
	}

}
