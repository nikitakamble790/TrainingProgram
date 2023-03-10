package Assignment4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question9 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(100,200,10,30,40,40,50);
		List<Integer> list1=list.stream().sorted().collect(Collectors.toList());
		System.out.println(list1);
	}

}
