package practice;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="race";
		String s2="care";
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Anagram identified:");
			
		}
		else
		{
			System.out.println("Not Anagram:");
		}
	}

}
