package practice23;

public class checkreverse {
	static String reverse(String s1)
	{
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		return rev;
		
	}
	
	public static void main(String[] args)
	{
		String s1="L#$@!an124gua&*^ge#%134 ";
		s1=s1.replaceAll("[0-9!#$@&*^%]","");
		System.out.println(reverse(s1));
		
		
	}

}
