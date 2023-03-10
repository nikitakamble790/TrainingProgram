package OopsConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		//Integer sum = list.stream();
		//list.stream().filter(i -> i%2 != 0).sum();
		List<Integer> OddList= list.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println(OddList);
		Integer sum=OddList.stream().reduce(1, (a,b)->a*b);
		
		System.out.println(sum);
		
		
		
	}

}
