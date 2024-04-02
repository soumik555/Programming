package practice;

public class P1 {
	public static void main(String[] args) {
		String s1="#123helloJAVA";
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch);
				
			}
			else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				System.out.println(ch);
				
			}
			
		}
	}

}
