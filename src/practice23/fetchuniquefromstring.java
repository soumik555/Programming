package practice23;

public class fetchuniquefromstring {
	public static void main(String[] args) {
		String s1="java";
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
			if(count>1)
			{
				System.out.print(arr[i]);
				
			}
			
		}
	}

}
