package class_work;

import java.util.Set;
import java.util.TreeSet;

public class Panagram 
{
	public static void main(String[] args) {
		String s1="The quick Brown Fox Jumps over the lazy dog";
		s1=s1.toLowerCase();
		Set s=new TreeSet();
		
		for(int i=0;i<s1.length();i++ )
		{
			char ch=s1.charAt(i);
			if(ch!=' ')
			{
				s.add(ch);
				
			}
			
		}
		if(s.size()==26)
		{
			System.out.println("Panagram identified:");
			
		}
		else
		{
			System.out.println("Not a Panagram:");
		}
		
			
	}

}
