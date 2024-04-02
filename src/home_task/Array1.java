package home_task;

public class Array1 {
	
	static void evenindex()
	{
		int arr[]= {1,2,3,4,5,6,7};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i] + " ");
				
			}
			
		
		
			
		}
		
		
	}
	
	static void oddindex()
	{
		int arr[]= {1,2,3,4,5,6,7};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			{
				System.out.print(arr[i] + " ");
				
			}
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		evenindex();
		oddindex();
		
		
	}

}
