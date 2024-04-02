package practice23;

import java.util.HashMap;
import java.util.Map;

public class freuencyofwordsusingHashMap {
public static void main(String[] args) {
	String s1="two three two two four seven two";
    Map<String, Integer> m1=new HashMap<String, Integer>();
	String arr[]=s1.split("\\s+");
	for(String s:arr)
	{
		if(m1.containsKey(s))
		{
		m1.put(s, m1.get(s)+ 1);
		}
		else
		{
			m1.put(s, 1);
		}
		
	}
	for(Map.Entry<String, Integer> e1:m1.entrySet())
	{
		System.out.println(e1.getKey()+"->"+ e1.getValue()+":Times");
		
	}
	
}
}
