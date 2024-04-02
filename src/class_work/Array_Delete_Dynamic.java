package class_work;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Delete_Dynamic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the array Elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter the element:");
		int ele=sc.nextInt();
//		
//		System.out.println("Enter the index value:");
//		int index=sc.nextInt();
//		
		int ans[]=new int[arr.length-1];
		for(int i=0;i<ans.length;i++)
		{
			if(arr[i]!=ele)
			{
				ans[i]=arr[i];
				
			}
			
		}
		System.out.println(Arrays.toString(ans));
		
	}

}
