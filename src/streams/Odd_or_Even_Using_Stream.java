package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class Odd_or_Even_Using_Stream {
	
	public static void toFindEven_Number() {
		List<Integer> li = Arrays.asList(10,23,33,40,50);
		li.stream().filter(x->x%2==0).collect(Collectors.toList()).forEach(System.out::println);
		

	}
	
	public Odd_or_Even_Using_Stream() {
		List<Integer> li = Arrays.asList(10,23,33,40,50);
		List<Integer> collect = li.stream().filter(x->x%2==1).collect(Collectors.toList());
		System.out.print(collect.toString());
		System.out.println();
		li.stream().filter(x->x%2==1).collect(Collectors.toList()).forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		Odd_or_Even_Using_Stream odd = new Odd_or_Even_Using_Stream();
		toFindEven_Number();
	
	}
	
	


}
