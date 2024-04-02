package practice;

public class Frequency1 {
	public static void main(String[] args) {
		String s1="aabbcccddd";
		int arr[]=new int[127];
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			arr[ch]++;
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				System.out.println((char) i + " is repeated for " + arr[i] + " times");
				
			}
			
		}
	}

}
