package practice23;

public class Arrayfrequency {
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,2,2,3};
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
			if(count>1 && arr[i]!=1)
			{
				System.out.println(arr[i]+ " occours " +count + " times");
				
			}
			
		}
	}
	

}
