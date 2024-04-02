package practice;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class UniqueString {
	public static void main(String[] args) 
	{
		
//		String  arr[]={"Hello", "Hello", "how", "are" ,"you"};
//		TreeSet t=new TreeSet();
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			t.add(arr[i]);
//			
//		}
//		
//		System.out.println(t);
		
//		TreeSet t1=new TreeSet();
//		
//		String s1="Jaavaaa";
//		char arr[]=s1.toCharArray();
//		
		
		
//		t1.add("Hello");
//		t1.add("Hello");
//		t1.add("How");
//		t1.add("are");
//		t1.add("you");
		
		
//		for(int i=0;i<arr.length;i++)
//		{
//			t1.add(arr[i]);
//			
//		}
//		
//		System.out.println(t1);
//	
	
		String s1="Jaavaa";
		char arr[]=s1.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
			if(count==1)
			{
				System.out.println(arr[i] + " is the unique element " + count + " times");
				
			}
			
		}
		
	}

}
