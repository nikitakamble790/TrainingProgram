package march1;

public class ArmstrongNo {

	public static void main(String[] args) {
		int no=153;
		int temp=no;
		int r,mul=1,sum=0;
		while(no>0)
		{
			r=no%10;
			mul=r*r*r;
			sum=sum+mul;
			no=no/10;
		}
		if(sum==temp)
		{
			System.out.println("it is armstrong no");
		}
		else
		{
			System.out.println("it is not armstrong");
		}

	}

}
