package prog;

import java.util.HashMap;
import java.util.Map;

public class Count_Each_Word_in_String {

	public static void main(String[] args) {
		String s = "Anand Raj Akshaya Hello Anand Raj";
		String[] split = s.split(" ");
//		int count=1;
//		int word=0;
//		
//		for (int i = 0; i < split.length; i++) {
//			word=count++;
//		}
//		System.out.println(word);
		
		Map<String,Integer> m = new HashMap<>();
		for (String word : split) {
		if (m.containsKey(word)) {
			Integer key = m.get(word);
			m.put(word, key+1);
			
		} else {
			m.put(word, 1);
		}
		}
		
		System.out.println(m);
		
	}
}
