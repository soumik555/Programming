package practice;

public class S {
	public static void main(String[] args) 
	{
		
		int no=145;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+fact(rem);
			no=no/10;
			
		}
		if(copy==sum)
		{
			System.out.println("Strong");
			
		}
		else
		{
			System.out.println("Not a Strong");
		}
		
		

}
	
	static int fact(int no)
	{
		int fact=1;
		for(int i=no;i>=0;i--)
		{
			fact=fact*i;
			
		}
		return fact;
		
	}
}
