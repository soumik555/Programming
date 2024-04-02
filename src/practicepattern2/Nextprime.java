package practicepattern2;

public class Nextprime {
	public static void main(String[] args) {
		int sr=9;
		int er=100;
		for(int i=sr+1;i<=er;i++)
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
				System.out.println(no + " is the next prime number:");
				break;
				
			}
			
		}
	}

}
