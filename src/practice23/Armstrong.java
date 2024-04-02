package practice23;

public class Armstrong {
	public static void main(String[] args) {
		int no=153;
		int copy=no;
		int b=no;
		int count=0;
		int sum=0;
		while(b!=0)
		
		{
			b=b/10;
			count++;
			
			
			
		}
		
		while(no!=0)
		{
			int rem=no%10;
			sum+=Math.pow(rem, count);
			no=no/10;
			
			
		}
		if(copy==sum)
		{
			System.out.println("Armstrong number verified:");
			
		}
		else
		{
			System.out.println("Not an Armstrong number:");
		}
	}
	

}
