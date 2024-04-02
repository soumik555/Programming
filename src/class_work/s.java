package class_work;

public class s {
	@SuppressWarnings("unused")
	static String reverse(String s1)
	{
		String d="";
	   char arr[]=s1.toCharArray();
		for(char ch:arr)
		{
			d=ch+d;
			
		}
		return d;
		
	}
	public static void main(String[] args) 
	{
		String s1="Java";
		System.out.println(reverse(s1));
		
	}

}
