package class_work;

public class ArrayPalindrome {
	public static void main(String[] args) {
		
		int arr[]= {121,334,545,1221,4545,4589};
		
		
		display(arr);
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==reverse(arr[i]))
			{
				count++;
				
			}
		
			
		}
		System.out.println("Palindrome count are " + count);
		
	}

	
	
	
	static void display( int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i] +" ");
			
		}
	}
	
	static int reverse(int no)
	{
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			
		}
	
		return rev;
		
	}
	
}
