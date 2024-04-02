package practicepractice2;

import java.util.TreeSet;
//Remove duplicates from a String
public class Removedupliactesfromstring {
	public static void main(String[] args) 
	{
		String s1="ddccbbaa";//output->abcd
		
		char[] arr=s1.toCharArray();
		
		
		TreeSet l=new TreeSet();
		
	for(int i=0;i<arr.length;i++)
	{
			l.add(arr[i]);
			
		}
	System.out.println(l);
	
		

}
	
}