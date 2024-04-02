package practice;

import java.util.Arrays;

public class Unsortedarrayadd {
	public static void main(String[] args) {
		int arr[]= {50,40,30,20,10};
		int brr[]= {100,90,80,70,60};
		int res[]=new int[arr.length+brr.length];
		int j=0;
		Arrays.sort(arr);
		Arrays.sort(brr);
		for(int i=0;i<arr.length;i++,j++)
		{
			res[j]=arr[i];
			
		}
		for(int i=0;i<brr.length;i++,j++)
		{
			res[j]=brr[i];
			
		}
		System.out.println(Arrays.toString(res));
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(brr));
		
	}

}
