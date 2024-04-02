package practice;

import java.util.Arrays;

public class Bubblesort {
	public static void main(String[] args) {
		int arr[]= {50,99,88,20,45,30};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
