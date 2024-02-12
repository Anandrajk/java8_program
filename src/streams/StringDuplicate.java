package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringDuplicate {
	
	public static void main(String[] args) {
		
		//String array[] = {"Anand","Raj"};
		
//		List<String> li = new ArrayList<>();
//		li.add("Anand");
		
		
		
		List<String> asList = Arrays.asList("Anand","Raj","Arul","Arun","Anand");
		
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		set.addAll(asList);
		
		System.out.println(asList.size()-set.size());
		
		for (String dup : set) {
			
			System.out.println("Duplicate:  "+dup);
			
		}
		
		
		System.out.println();
		
		asList.stream().distinct().forEach(System.out::println);
		
		
		
		List<String> list1 = Arrays.asList("Anand","Raj",null,"Arul","Anand");
		
		list1.iterator().forEachRemaining(ans->{System.out.println(ans);});
		
		list1.stream().filter(dup->dup!=null).collect(Collectors.toList()).forEach(System.out::println);
		
		
	}

}
