package march1;

public class PrimeNo {

	public static void main(String[] args) {
		int no=41, flag=0;
		for(int i=2;i<=no/2;i++)
		{
			if(no%i==0)
			{
				System.out.println("it is not prime no");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("it is prime no");
		}

	}

}
