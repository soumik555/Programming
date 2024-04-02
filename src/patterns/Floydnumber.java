package patterns;

import java.util.Scanner;

public class Floydnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		
		
		int num=1;
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num + " ");
				num++;
				
			}
			System.out.println();
			
		}
		
		
	}

}
