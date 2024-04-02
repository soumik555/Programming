package class_work;

public class UppercasetoLowercase {
	public static void main(String[] args) 
	{
		
		String s1="PROGRAM";
		String ans="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ans=ans+(char)(ch+32);
			}
		}
		System.out.println(ans);
		
	}

}
