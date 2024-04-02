package class_work;

import java.util.Arrays;

public class ArrayZigZag {
	public static void main(String[] args) {
		int arr[]= {12,78,24,62,45};
		
		int brr[]= {7,8,6,2,9};
		
		int res[]= {arr.length+brr.length};
		
		int i=0;
		int j=0;
		
		for(int k=0;k<res.length;)
		{
			
			if(i<arr.length)
			{
				res[k]=arr[i];
				i++;
				k++;
				
			}
			
			if(j<brr.length)
			{
				res[k]=brr[j];
				j++;
				k++;
				
			}
		  
	      
		}
		Arrays.toString(res);
		
//		for(int k2=0;k2<res.length;k2++)
//		{
//			System.out.print(res[k2]+" ");
//			
//		}
//		System.out.println();
		
		
	}

}
