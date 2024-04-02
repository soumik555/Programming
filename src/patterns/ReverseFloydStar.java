package patterns;

public class ReverseFloydStar {
	
	public static void main(String[] args) {
		
		

		for(int i=1;i<=5;i++)
		{
			for(int j=2*5-i;j<=i;j--)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
	}

}
