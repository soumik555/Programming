package class_work;

public class STrings {
	public static void main(String[] args) {
		try
		{
			//double i=1.1/0;
			double i=1/0.0;
			System.out.println(i);
			
		}
		catch ( ArithmeticException a) 
		{
			System.out.println("Exception is handled smoothly");
			
		}
		
			
	}

}
