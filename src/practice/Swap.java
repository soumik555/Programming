package practice;
public class Swap {
	
	public static void main(String[] args) {
		
		int a=2;
		int b=3;
		
		System.out.println("Before swapping");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("After Swapping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
	}

}
