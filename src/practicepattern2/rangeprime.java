package practicepattern2;

public class rangeprime {

	static void rangeprimee()
	{
		for(int i=2;i<=100;i++)
		{
			boolean flag=true;
			int no=i;
			for(int j=2;j<no;j++)
			{
				if(no%2==0)
				{
					flag=false;
					break;
				}
				
			}
			if(flag==true)
			{
				System.out.println(no+ " is ranged prime number:");
			}
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		rangeprimee();
		
	}

}
