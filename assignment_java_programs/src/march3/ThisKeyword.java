package march3;

public class ThisKeyword {

	public static void main(String[] args) {
		Test t = new Test();
		t.setData(10);
		t.show();
	}
}

class Test {
	int i;

	void setData(int i) {
		this.i = i;	
	}

	void show() {
		System.out.println(i);
	}
}
