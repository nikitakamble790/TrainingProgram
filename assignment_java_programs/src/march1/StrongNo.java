package march1;

//145=1!+4!+5!=145
public class StrongNo {

	public static void main(String[] args) {
		int no = 145, r, sum = 0, mul;
		int temp = no;
		while (no > 0) {
			r = no % 10;
			int i = 1, res = 1;
			while (i <= r) {
				res = res * i;
				i++;
			}

			sum = sum + res;
			no = no / 10;
		}
		if (sum == temp) {
			System.out.println("it is strong no");
		} else {
			System.out.println("it is not strong no");
		}

	}
	
	//seperate function

}
