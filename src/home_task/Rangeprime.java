package home_task;

public class Rangeprime {
	public static void main(String[] args) {
		for(int i=2;i<=100;i++)
		{
			boolean flag=true;
			int no=i;
			for(int j=2;j<no;j++ )
			{
				if(no%j==0)
				{
					flag=false;
					break;
					
				}
				
			}
			if(flag==true)
			{
				System.out.println(no + " is the range prime number:");
				
			}
			
			
		}
		
	}

}
