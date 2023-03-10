package Assignment4;

import java.util.Arrays;
import java.util.List;

public class Question5 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,10,30,40,40,50);
		long total=list.stream().count();
		System.out.println(total);
	}

}
