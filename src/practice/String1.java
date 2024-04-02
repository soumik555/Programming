package practice;

public class String1 {
	public static void main(String[] args)
	{
		String s1="Java";
		System.out.println(rev(s1));
		
		
		
	}
	
	
	static String rev(String s1)
	{
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
			
		}
		return s2;
		
		
	}

}
