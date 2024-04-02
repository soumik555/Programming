package class_work;

public class String2 {

	//prime factor
	public static void main(String[] args) 
	{
		int no=100;
		
		for(int i=1;i<=no/2;i++)
		{
			if(no%i==0 && i>1 && prime(i))
			{
				System.out.println("prime factor is= "+i);
			}
		}
	}
	
	static boolean prime(int n)
	{
		boolean flag=true;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
			
		}
		return flag;
		
	}
	
	
	
	
}
