package class_work;

public class String1 {
	public static void main(String[] args) 
	{
		
		
		
			String s1="a2b2c4";
			for(int i=0;i<s1.length();i++)
			{
				if(Character.isAlphabetic(s1.charAt(i)))
				{
					System.out.println(s1.charAt(i));
				}
				else
				{
					int no=(Character.getNumericValue(s1.charAt(i)));
					for(int j=1;j<no;j++)
					{
						System.out.println(s1.charAt(i-1));
					}
				}
			}
		


	}
	
}
