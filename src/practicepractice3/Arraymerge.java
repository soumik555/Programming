package practicepractice3;

import java.util.Arrays;

public class Arraymerge {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		int brr[]= {50,60,70,80};
		int j=0;
		int res[]=new int[arr.length+brr.length];
		for(int i=0;i<arr.length;i++,j++)
		{
			res[j]=arr[i];
			
		}
		
		for(int i=0;i<brr.length;i++,j++)
		{
			res[j]=brr[i];
			
		}
		System.out.println(Arrays.toString(res));
	}

}
