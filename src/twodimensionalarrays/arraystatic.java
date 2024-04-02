package twodimensionalarrays;

public class arraystatic {
public static void main(String[] args) {
	int arr[]= {1,2,3};
	int brr[]= {4,5,6};
	
	int ans[][]= {arr,brr};
	for(int i=0;i<ans.length;i++)
	{
		for(int j=0;j<ans[i].length;j++)
		{
			System.out.print(ans[i][j]+" ");
			
		}
		System.out.println();
		
		
	}

	
	
}
}
