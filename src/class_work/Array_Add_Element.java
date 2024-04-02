package class_work;

import java.util.Arrays;

public class Array_Add_Element {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		int ans[]=new int[arr.length+1];
		
		int index=4;
		int element=50;
		
		for(int i=0;i<ans.length;i++)
		{
			if(index==i)
			{
				ans[i]=element;
				
			}
			else
			{
				ans[i]=arr[i];
			}
			
		}
		System.out.println(Arrays.toString(ans));
	}

}
