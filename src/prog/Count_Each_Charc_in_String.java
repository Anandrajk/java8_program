package prog;

import java.util.HashMap;
import java.util.Map;

public class Count_Each_Charc_in_String {
public static void main(String[] args) {
	String s= "Anand";
	
	char[] charArray = s.toCharArray();
	
	Map<Character,Integer> m = new HashMap<>();
	
	for (char c:charArray) {
		if (m.containsKey(c)) {
			
			Integer key = m.get(c);
			m.put(c, key+1);
			
		} else {
			m.put(c,1);
		}
		
		
	}
	System.out.println(m);
}
}
