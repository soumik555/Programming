package class_work;

public class LowercasetoUppercase 
{
	public static void main(String[] args) 
	{
		String s1="program";
		String ans="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ans=ans+(char)(ch-32);
			}
		}
		System.out.println(ans);
		
	}

}
