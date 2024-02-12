package prog;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Min_and_Max_Number {
	
	public static void main(String[] args) {
		
		int[] num = {1,2,3,8,9};
		
		OptionalInt optmin = Arrays.stream(num).min();
		int min = optmin.getAsInt();           		
		System.out.println(min);
		
		OptionalInt optmax = Arrays.stream(num).max();
		int max = optmax.getAsInt();           		
		System.out.println(max);
		
		int first_Min_Number = Arrays.stream(num).boxed().sorted().skip(1).mapToInt(Integer::intValue).findFirst().getAsInt();
		System.out.println(first_Min_Number);
		
		int  first_Max_Number = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).skip(1).mapToInt(Integer::intValue).findFirst().getAsInt();
		System.out.println(first_Max_Number);
		
	}

}
