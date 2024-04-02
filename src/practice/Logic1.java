package practice;

public class Logic1 {
	public static void main(String[] args) {
		int no=9;
		int sum=0;
	    int copy=no;
	    int diff=0;
		{
			while(no!=0)
			{
				int rem=no%10;
				sum=sum+rem*rem;
				no=no/10;
				
			}
			diff=sum-copy;
			System.out.println(diff);
		}
	}

}
