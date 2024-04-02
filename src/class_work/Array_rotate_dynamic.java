package class_work;

import java.util.Arrays;
import java.util.Scanner;

public class Array_rotate_dynamic {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements of the array:");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		int index=0;
		int rotate=4;
		
		int ans[]=new int[arr.length];
		
		for(int i=rotate;i<arr.length;i++)
		{
			ans[index]=arr[i];
			index++;
			
		}
		
		for(int i=0;i<rotate;i++)
		{
			ans[index]=arr[i];
			index++;
		}
		
		System.out.println(Arrays.toString(ans));
		
	}

}
