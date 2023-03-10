package Assignment_1to150Question;

public class Program3 {

	public static void main(String[] args) {
		int no=121;
		int temp=no;
		int reverse=0;
		while(no>0)
		{
			int r=no%10;
			reverse=reverse*10+r;
			no=no/10;
		}
		if(temp==reverse)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
