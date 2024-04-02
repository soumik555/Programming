package Exampractice;

import java.util.Scanner;

public class Sw {
	
	

	static void date()
	{
		System.out.println("Date");
	}
	static void rent()
	{
		System.out.println("Age");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the case:");
	    int no=sc.nextInt();
		
		switch(no)
		{
		case 1:date();
	break;
	
		case 2: rent();
		break;
		
		default:System.out.println("Wrong info");
		}
		
		
		
	}

}
