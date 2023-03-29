package assignment6;

public class MethodOverloading {

	public static void main(String[] args) {
		sum(10,20,33);
		sum(10,20,33,22);
		sum(10,20,33,66,55);
		sum(10,20,33);

	}
	static void sum(int a, int b, int c) {
		System.out.println("addition is: "+(a+b+c));

	}
    static void sum(int a, int b, int c, int d) {
		System.out.println("addition is: "+(a+b+c+d));
	}
    static void sum(int a, int b, int c, int d, int e) {
		System.out.println("addition is: "+(a+b+c+d+e));
	}

}
