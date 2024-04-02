package practice23;

import java.util.LinkedHashSet;

public class Removeduplicatesfromstring {
	public static void main(String[] args) {
		String s1="jaava";
		char[] arr=s1.toCharArray();
		
		LinkedHashSet l1=new LinkedHashSet();
		
		for(int i=0;i<arr.length;i++)
		{
			l1.add(arr[i]);
			
		}
		
		System.out.println();
	}
	

}
