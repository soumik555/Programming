package class_work;

import java.util.Arrays;

public class Array_Delete_Element {
	public static void main(String[] args) {
		int element=60;
		int index=5;
		int arr[]= {10,20,30,40,50,60};
		int ans[]=new int[arr.length-1];
		
		for(int i=0;i<ans.length;i++)
		{
			
			if(arr[i]!=element)
			{
				ans[i]=arr[i];
			
			
			}
		}
		System.out.println(Arrays.toString(ans));
		
	}

}
