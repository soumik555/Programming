package patterns;

public class A {
	
	static String replace(String s1)
	{
		
		String s2=s1.replace('F', 'T');
		
		return s2;
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(replace(replace("Fire")));
	}

}
