package practice23;

public class Testcase1 {
	public static void main(String[] args) {
		
		String s1="welcome to urbanPro welcome to bangalore";
		String arr[]=s1.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
					
				}
				
			}
			System.out.println(arr[i] + " " + count+ " times");
			
		}
	
	}

}
