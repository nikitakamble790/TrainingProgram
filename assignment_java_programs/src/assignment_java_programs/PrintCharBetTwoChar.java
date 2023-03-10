package assignment_java_programs;

public class PrintCharBetTwoChar {

	public static void main(String[] args) {
		char ch1='A', ch2='P';
		int diff=ch2-ch1;
		System.out.println(diff);
		for(int i=1;i<		diff;i++)
		{
			if(ch1==ch2)
			{
				break;
			}
			else
			{
				++ch1;
				System.out.print(ch1+"\t");
				
			}
		}
	}

}
