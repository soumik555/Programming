package practice;

public class Desarium {
	public static void main(String[] args) {
		int no=135;
		int count=0;
		int sum=0;
		int copy=no;
		int b=no;
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
			count--;
			
			
		}
		if(copy==sum)
		{
			System.out.println("Desarium number:");
			
		}
		else
		{
			System.out.println("Not a Desarium number:");
		}
	}

}
