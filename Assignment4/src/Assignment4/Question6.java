package Assignment4;

import java.util.Arrays;
import java.util.List;

public class Question6 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,10,30,40,40,50);
		int var=list.stream().max(Integer::compare).get();
		System.out.println(var);

	}

}
