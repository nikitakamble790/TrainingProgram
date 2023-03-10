package Assignment4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question3 {

	public static void main(String[] args) {
			List<Integer> list=Arrays.asList(10,20,10,30,40,40,50);
		 Set<Integer> dup=list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
		 System.out.println(dup);
	}

}
