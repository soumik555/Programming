package class_work;

public class SumofintegersinaString {
	public static void main(String[] args)
	{    int sum=0;
		String str="4PREP2INSTAA62";
		
		
		for(int i=0;i<str.length();i++)
		{ 
		if(str.charAt(i)>='0' && str.charAt(i)<='9')
		{
		sum+=(str.charAt(i)-'0');

	}
		

}
		System.out.println("Sum of all digits is "+ sum);
		
		

	}
}
