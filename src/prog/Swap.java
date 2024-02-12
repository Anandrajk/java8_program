package prog;

public class Swap {
	
	public static void main(String[] args) {
		
		int a=2,b=3,c=4;
		
//		c=a;
//		a=b;
//		b=c;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a--"+a);
		System.out.println("b--"+b);
		
	}
	
}
