package class_work;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int arr[]= {200,76,99,100,40,30,20};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
				
				
			}
			
		}
		System.out.println(Arrays.toString(arr));//Bubble Sort Logic Output
		
		
	}

}
