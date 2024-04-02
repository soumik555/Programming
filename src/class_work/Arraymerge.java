package class_work;

import java.util.Arrays;

public class Arraymerge {
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int acc[]= {60,70,80,90,100};
		int res[]=new int[arr.length+acc.length];
		int j=0;
		for(int i=0;i<arr.length;i++,j++)
		{
			res[j]=arr[i];
			
			
		}
		
		for(int i=0;i<acc.length;i++,j++)
		{
			res[j]=acc[i];
			
			
		}
		System.out.println(Arrays.toString(res));
	}

}
