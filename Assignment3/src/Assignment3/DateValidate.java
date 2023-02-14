package Assignment3;

import java.util.Scanner;

public class DateValidate {

	static int maxDate = 9999;
	static int minDate = 1800;

	static boolean isLeap(int year) {
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}

	static boolean isValidDate(int d, int m, int y) {
		
		if (y > maxDate || y < minDate)
			return false;
		if (m < 1 || m > 12)
			return false;
		if (d < 1 || d > 31)
			return false;

		if (m == 2) {
			if (isLeap(y))
				return (d <= 29);
			else
				return (d <= 28);
		}
		if (m == 4 || m == 6 || m == 9 || m == 11)
			return (d <= 30);

		return true;
	}

	// Driver code

	public static void main(String[] args) {
		/*if (isValidDate(10, 12, 2000))
            System.out.println("Yes");
        else
            System.out.println("No");
 
        if (isValidDate(31, 11, 2000))
            System.out.println("Yes");
        else
            System.out.println("No");
    }*/
		
		System.out.println("Enter date, month, year");
		int date,m,year;
		Scanner sc=new Scanner(System.in);
		date=sc.nextInt();
		m=sc.nextInt();
		year=sc.nextInt();
		if (isValidDate(date,m,year))
            System.out.println("Yes");
        else
            System.out.println("No");
		
				
	}

}
