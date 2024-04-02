package class_work;

public class Oderofoccourancecountindex {
	
	static int occourance(int arr[],int ele,int occ)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				count++;
				
			}
			if(count>=occ)
			{
				return i;
				
			}
			
		}
	
		return -1;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,3,4,5,6};
		int result=occourance(arr, 3, 2);
		System.out.println("The index position for the repeated element is:"+result);
		
		
	}

}
