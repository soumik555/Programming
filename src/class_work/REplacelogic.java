package class_work;

public class REplacelogic {
	public static void main(String[] args) {
		String str="jaava";//7$$@$
		String em="";
		char arr[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(arr[1]=='a')
			{
				arr[1]=	'1';
			}
			
			if(arr[2]=='a')
			{
				arr[2]=	'#';
			}
			if(arr[i]=='v')
			{
				arr[i]=	'@';
			}
			if(arr[i]=='j')
			{
				arr[i]=	'7';
			}
			
		}
//		for(char c:arr)
//		{
//			em=em+c;
//			
//		}
		
		for(int i=0;i<arr.length;i++)
		{
			em=em+arr[i];
			
		}
		System.out.println(em);
		
	}

}
