package practicepractice2;

import java.util.Arrays;

public class deletearray {
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,50,60,90};
		int ans[]=new int[arr.length-1];
		
		int element=90;
		int index=5;
		for(int i=0;i<ans.length;i++) 
		{
			if(arr[i]!=element)
			{
				ans[i]=arr[i];
				index++;
				
			}
			
		}
		System.out.println(Arrays.toString(ans));
	}
	

}
