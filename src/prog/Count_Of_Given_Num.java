package prog;

public class Count_Of_Given_Num {

	public static void main(String[] args) {
		int num=12345678;
		long count=0;
		while (num>0) {
			num=num/10;
		count++;
		
		}
		
		System.out.println(count);
	}
	
}
