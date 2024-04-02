package practicepractice2;

public class Arraymax {
	public static void main(String[] args) {
		int arr[]= {20,30,40,50,60};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			
			if(arr[i]<max)
			{
				min=arr[i];
				
			}
			
			
		}
		System.out.println(min);
		System.out.println(max);
	}

}
