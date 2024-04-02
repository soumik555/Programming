package practicepractice2;

import java.util.Scanner;

public class Arraymatrix {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows=sc.nextInt();
		System.out.println("Enter the columns");
		int columns=sc.nextInt();
		
		int arr[][]=new int[rows][columns];
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
				
				
			}
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
			
		}
	}

}
