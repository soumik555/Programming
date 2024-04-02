package twodimensionalarrays;

public class Arrayeven {
public static void main(String[] args) {
	int arr[][]= {{7,6,2,5},{9,5,2,8},{10,16,8,2},{4,5,62,8}};
	for(int i=0;i<arr.length;i++)//rows
	{
		if(i%2==0)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		else
		{
			for(int j=arr[i].length-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	
		
	}
}

}
