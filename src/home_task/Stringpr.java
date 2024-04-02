package home_task;

public class Stringpr {
	public static void main(String[] args) {
//		String s1="hello";
//		char arr[]=s1.toCharArray();
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print(arr[i] +"");
//			
//		}
		
//		String s1="Hello how are you my name is Soumik Sardar";
//		String arr[]=s1.split(" ");
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print(arr[i]+ " ");
//			
//			
//		}
		String s2="Hello how are you my name is Soumik Sardar";
		char arr2[]=s2.toCharArray();
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]=='e')
			{
				arr2[i]='$';
			}
			if(arr2[i]=='S')
			{
				arr2[i]='@';
				
			}
			
		}
		System.out.println(arr2);
	
		
	}

}
