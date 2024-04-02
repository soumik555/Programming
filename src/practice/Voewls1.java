package practice;

public class Voewls1 {
	public static void main(String[] args) 
	{   String s1="hello";
		String vowels="";
		String cons="";
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels=vowels+ch;
				
			}
			else
			{
				cons=cons+ch;
			}
			
		}
		System.out.println(cons+vowels);
		
	}

}
