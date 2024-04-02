package practice;

public class ASCII1 {
	
	static  String print (String str,int no)
	{
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			result+=(char) (ch+no);
			
			
			
		}
		return result;
		
	}
	public static void main(String[] args) 
	{
		int no=5;
		String str="soum";
		System.out.println(print(str, no));
		
	}

}
