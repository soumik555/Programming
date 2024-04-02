package practicepractice2;

public class Decimaltobinary {
	public static void main(String[] args) {
		int no=4;
		String result="";
		while(no!=0)
		{
			int rem=no%2;
			result=result+rem;
			no=no/2;
			
		}
		System.out.println(result);
	}

}
