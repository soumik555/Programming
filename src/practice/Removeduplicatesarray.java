package practice;

import java.util.LinkedHashSet;

public class Removeduplicatesarray {
	public static void main(String[] args) {
		int arr[]= {10,10,45,78,78,34,34};
		
		LinkedHashSet<Integer> l1=new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			l1.add(arr[i]);
			
		}
		System.out.println(l1);
		
	
	
		
		

}
	
}
