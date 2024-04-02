package twodimensionalarrays;

public class missingelementarray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int brr[]= {5,6,1,3,2};
		int sum=0;
		int sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		for(int j=0;j<brr.length;j++)
		{
			sum1=sum1+brr[j];
			
		}
		if(brr.length>arr.length)
		{
			sum1=sum1-sum;
			
			
		}
		else
		{
			sum=sum-sum1;
		}
		System.out.println(sum);
		
		
	}

}
