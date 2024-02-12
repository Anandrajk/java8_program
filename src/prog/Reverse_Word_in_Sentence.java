package prog;

import java.util.Iterator;

public class Reverse_Word_in_Sentence {
	
	public static void main(String[] args) {
		
		String s="Anand is watching Kamal";
		
		String rev="";
		String reverse="";
		String[] split = s.split(" ");
		
//		for (int i = split.length-1; i >= 0; i--) {
//			System.out.println(split[i]);
//			
//			
//		}
		
		for (int i = split.length-1; i >= 0; i--) {
		
			
			String rever= rev+split[i];
			
		
			
			System.out.println(rever);
		}
		
		
	}
	
}
