package practicepractice3;

public class ReplacecharactersinString {
	public static void main(String[] args) {
		String s1="jaava";
		char arr[]=s1.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a')
			{
				arr[i]='$';
				
			}
			if(arr[i]=='j')
			{
				arr[i]='@';
				
			}
			
		}
		for(char ch:arr)
		{
			System.out.print(ch+"");
		}
	}

}
