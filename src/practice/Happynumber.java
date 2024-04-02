package practice;

public class Happynumber 
{
	
	
	static int numSum(int no)
	{ 
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem*rem;
			no=no/10;
			
			
		}
		return sum;
		
	}
	
	
	public static void main(String[] args) 
	{
		int no=49;
		while(no>9)
		{
			no=numSum(no);
			
		}
		if(no==7||no==1)
		{
			System.out.println("Happy number:");
			
		}
		else
		{
			System.out.println("Not a Happy number:");
		}
		
	}

}
