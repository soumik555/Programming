package practicepractice3;

import java.util.Arrays;
import java.util.Scanner;

public class arraydelete {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int element=5;
		int index=4;
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		System.out.println("Enter the elements");
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		int ans[]=new int[arr.length-1];
		
		for(int i=0;i<ans.length;i++)
			
		{
			if(arr[i]!=element)
			{
				ans[i]=arr[i];
				index++;
				
			}
			
		}
		System.out.println(Arrays.toString(ans));
		
	}

}
