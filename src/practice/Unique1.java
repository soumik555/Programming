package practice;

public class Unique1 {
	public static void main(String[] args) 
	{
		String s1="hello today is thursday";
		char arr[]=s1.toCharArray();
		
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					
				}
				
			}
			if(count==1)
			{
				System.out.println(arr[i] + " is counted for " + count + " times");
				
			}
			
			
		}
		
	}

}
