package practice;

public class Armstrong {
	public static void main(String[] args) {
		int no=153;
		int sum=0;
		int copy=no;
		int count=0;
		int b=no;
		while(b!=0)
		{
			b=b/10;
			count++;
			
			
		}
		while(no!=0)
		{
			int rem=no%10;
			sum=(int) (sum+Math.pow(rem, count));
			no=no/10;
			
		}
		if(copy==sum)
		{
			System.out.println("Strong number verified:");
			
		}
		else
		{
			System.out.println("Not a Strong number:");
		}
	}

}
