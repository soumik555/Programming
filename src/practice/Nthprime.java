package practice;

public class Nthprime {
	public static void main(String[] args)
	{
		int count=1;
		int n=2;
		for(int j=3;j<=15;j++)
		{
			int no=j;
			boolean flag=true;
			for(int i=2;i<no;i++)
			{
				if(no%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				if(count==n)
				{
					System.out.println(no+" is "+count+" th prime number");
				}
				else
				{
					count++;
				}
			}
		}
	
	
		
		
	}

}
