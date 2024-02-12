package prog;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Map_To_Arrays {
	
	public static void main(String[] args) {
		
		int [] num = {1,2,3,4};
		int[] number = {5,6,7,8,9};
		
		IntStream.range(0, Math.min(num.length, number.length)).boxed()
		.collect(Collectors.toMap(x->num[x], x->number[x],(a,b)->b))
		.forEach((key,value)->System.out.println("Key: "+key+ " Value: "+value));
		
		Map<Integer,Integer> m = new HashMap<>(); 
		int min = Math.min(num.length, number.length);
		for (int i = 0; i < min; i++) {
			m.put(num[i], number[i]);
			
		}

		Set<Entry<Integer,Integer>> set = m.entrySet();
		for (Entry<Integer, Integer> entry : set) {
			System.out.println("Key: "+entry.getKey() +"Values: "+entry.getValue());
		}
	}

}
