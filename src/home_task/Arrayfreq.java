package home_task;

import java.util.Scanner;

public class Arrayfreq {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the elements present in the array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		    
			
		}
		
		int fr[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					fr[j]=-1;
					count++;
					
				}
				
				
			}
			if(fr[i]!=-1)
			{
				fr[i]=count;
				
			}
			
		}
		
		for(int i=0;i<fr.length;i++)
		{
			System.out.println(arr[i] + " " + fr[i]);
			
		}
		
		
			
	}

}
