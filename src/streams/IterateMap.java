package streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMap {
	
	
	public static void main(String[] args) {
		
		Map <Integer,String> mp = new LinkedHashMap<>();
		
		mp.put(1, "Ajith");
		mp.put(2, "Vijay");
		mp.put(3, null);
		
		Set<Entry<Integer, String>> set = mp.entrySet();
		
		for (Entry<Integer, String> entry : set) {
			
			System.out.println(entry);
		}
		
		
		
	}

}
