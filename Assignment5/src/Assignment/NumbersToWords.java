package Assignment;

import java.util.Scanner;

public class NumbersToWords {

	//private static final String[] d = null;
	static String d[]= {"","one","two","three","four","five","six","seven","eight","nine"};
	 static String t[]= {"ten","Eleven","twelve","thirteen","fourteen","fiftheen","sixteen","seventeen","eighteen","nineteen"};
	 static String th[]= {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	 
	 static String result="";
	public static void main(String[] args) {
		// String h[]= {""};
		
		int n;
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		
		if(n<10) {
			//result=d[n];
			oneDigit(n);
		}
		else if(n>=10 && n<=19) {
			result=twoDigit(n);
			
		}
		else if(n>=20 && n<=99) {
			result=twoDigitLarge(n);
		}
		else if(n>=100 && n<=999) {
			result=threeDigit(n);
			
			
		}
		else if(n>=1000 && n<=99999) {
			result=fourDigit(n);
		}
		System.out.println(result);
		
		
	}
	static void oneDigit(int n) {
		result=result+d[n];
	}
	static String twoDigit(int n) {
		int temp=n;
		int digit=temp%10;
		result=result+t[digit];
		return result;
	}
	 static String twoDigitLarge(int n){
		int temp=n;
		int digit=temp/10;
		result=result+th[digit];
		int di=temp%10;
		result=result+" "+d[di];
		return result;
	}
	static String threeDigit(int n) {
		int temp=n;
		int digit=temp/100;
		result=result+" "+d[digit]+" "+"hundred"+" ";
		int di=temp%100;
		if(di<10) {
			oneDigit(di);
		}
		else if(di>=10 && di<=19) {
			result=twoDigit(di);
			
		}
		else if(di>=20 && di<=99) {
			result=twoDigitLarge(di);
		}
		return result;
	}
	static String fourDigit(int n) {
		int temp=n;
		int digit=temp/1000;
		if(digit<10) {
			result=result+d[digit]+" "+"thousand"+" ";
		}
		else if(digit>=10 && digit<=19) {
			int temp1=digit;
			int di=temp1%10;
			result=result+t[di]+" "+"thousand"+" ";
			//result=result+t[digit]+" "+"thousand"+" ";
			
		}
		else if(digit>=20 && digit<=99) {
			int temp1=digit;
			String result1=twoDigitLarge(digit);
			result=result1+" "+"thousand"+" ";
		}
		//result=result+d[digit]+" "+"thousand"+" ";
		int di=temp%1000;
		if(di<10) {
			oneDigit(di);
		}
		else if(di>=10 && di<=19) {
			result=twoDigit(di);
			
		}
		else if(di>=20 && di<=99) {
			result=twoDigitLarge(di);
		}
		else if(di>=100 && di<=999) {
			result=threeDigit(di);
			}
		return result;
	}

}
