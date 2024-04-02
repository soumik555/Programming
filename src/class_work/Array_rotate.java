package class_work;

import java.util.Arrays;

public class Array_rotate {
	public static void main(String[] args) {
		
		int rotate=4;
		int index=0;
		int arr[]= {1,2,6,8,4,5,6,7,8};
		int ans[]=new int[arr.length];
		System.out.println("Before rotating"+Arrays.toString(arr));
		
		System.out.println("After rotating " + rotate);
		//1st cycle
		for(int i=rotate;i<arr.length;i++)
		{
			ans[index]=arr[i];
			index++;
			
		}
		
		//2nd cycle
		for(int i=0;i<rotate;i++)
		{
			ans[index]=arr[i];
			index++;
			
		}
		System.out.println(Arrays.toString(ans));
		
		
	}

}
