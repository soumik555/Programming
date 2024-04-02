package practicepractice2;

import java.util.Arrays;

public class Arraysmerge {
	public static void main(String[] args) {
		int arr[]= {10,20,30,50,60};
		int brr[]= {90,100,200,300,400};
		int ans[]=new int[arr.length+brr.length];
		int j=0;
		for(int i=0;i<arr.length;i++,j++)
		{
			ans[j]=arr[i];
			
			
		}
		
		for(int k=0;k<brr.length;k++,j++)
		{
			ans[j]=brr[k];
			
			
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
