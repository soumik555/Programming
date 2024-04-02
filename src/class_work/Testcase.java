package class_work;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Testcase {
	public static void main(String[] args) {
		String arr[]= {"Hari","Ravi","Hari","Rahul"};
		String arr2[]= {"Shyam","Madhu","Shyam","Roni"};
		String res[]=new String[arr.length+arr2.length];
	    int j=0;
	
	for(int i=0;i<arr.length;i++,j++)
	{
		res[j]=arr[i];
		
		
	}
	
	for(int i=0;i<arr2.length;i++,j++)
	{
		res[j]=arr2[i];
		
		
	}
	
//	System.out.println(Arrays.toString(res));
	
	LinkedHashSet l1=new LinkedHashSet();
	
	for(int i=0;i<res.length;i++)
	{
		l1.add(res[i]);
		
	}
	
	System.out.println(l1);
	}
	
	
	

}
