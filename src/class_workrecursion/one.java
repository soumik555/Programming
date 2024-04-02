package class_workrecursion;

public class one {
	
	
	static int num(int no)
	{
		
		int sum=0;
		if(no<=10)
		{
	
			if(no%2==0)
			{
				sum=sum+no;
			
				
			}
			
			
			num(no+1);
			
		}
		
		return sum+1;
		
	}
	
	
	
	
	
	public static void main(String[] args) 
	{   int sum=0;
		System.out.println(num(1));
		
	}

}
