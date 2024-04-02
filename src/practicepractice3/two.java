package practicepractice3;

import java.util.Arrays;
import java.util.Scanner;

public class two {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the rows");
		int rows=sc.nextInt();
		System.out.println("Enter the columns");
		int columns=sc.nextInt();
		int ans[][]=new int[rows][columns];
		System.out.println("Enter the elements present in the array");
		
		for(int i=0;i<ans.length;i++)
		{
			for(int j=0;j<ans.length;j++)
			{
				ans[i][j]=sc.nextInt();
				
			}
			
		}
		
		for(int i=0;i<ans.length;i++)
		{
			for(int j=0;j<ans[i].length;j++)
			{
			  System.out.print(ans[i][j]+" ");
				
			}
			System.out.println();
		
			
			
		}
		
		
		
		
		
	}

}
