package assignment6;

public class Multiplication {

	public static void main(String[] args) {
		int a=3,b=5;
		int result=0;
		result=multiply(a,b);
		System.out.println(result);
		
	}
	static int multiply(int a, int b) {
		int result=0;
		if(b==0) {
			return 0;
		}
		else if(a==0 || b==0) {
			return 0;
		}
		else if(b==1) {
			return a;
		}
		else {
			return a+multiply(a,b-1);
		}
	}

}
