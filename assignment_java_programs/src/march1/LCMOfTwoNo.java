package march1;

import java.util.Scanner;

public class LCMOfTwoNo {

	public static void main(String[] args) {
		int no1 = 12, no2 = 2, lcm = 1;

		int large = (no1 > no2) ? no1 : no2;
		for (int i = large; i <= no1 * no2; i++) {
			if (i%no1==0 && i%no2==0) {
				lcm = i;
				break;
			}

		}
		System.out.println("by using second logic lcm of 2 no is:" + lcm);

	}

}
