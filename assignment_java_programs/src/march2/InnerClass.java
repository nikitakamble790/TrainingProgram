package march2;

public class InnerClass {

	public static void main(String[] args) {
		Outer obj1 = new Outer();
		Outer.Inner obj2 = obj1.new Inner();
		obj2.display();
	}

}

class Outer {
	int a = 20;

	class Inner {
		void display() {
			System.out.println("accessing member of outer class in inner class== " + a);
		}
	}
}
