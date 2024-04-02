package class_work;

public class Arraymaxmin {
	public static void main(String[] args) {
		int arr[]= {50,90,30,40};
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
		System.out.println(max);
		System.out.println(min);
	}

}
