package practicepattern2;

public class Practice {
	static int numsum(int no) 
	{
		int sum=0;
		while(no!=0)
		{
			
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		return sum;
		
		
	}
	
	
	public static void main(String[] args) 
	{
		int no=24;
		while(no>9)
		{
			no=numsum(no);
			
		}
		System.out.println(no);
	
	}

}
