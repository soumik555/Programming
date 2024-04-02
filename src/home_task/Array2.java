package home_task;

public class Array2 {
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int acc[]= {4,0,7};
	
		int ans[][]= {arr,acc};
		
		for(int i=0;i<ans.length;i++)
		{
			for(int j=0;j<ans[i].length;j++)
			{
				System.out.print(ans[i][j] + " ");
				
			}
			System.out.println();
			
		}
	}

}
