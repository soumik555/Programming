package practicepractice2;

import java.util.Arrays;

public class Arrayinsert {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int ans[]=new int[arr.length+1];
		int element=90;
		int index=5;
		for(int i=0;i<ans.length;i++)
		{
			if(index==i)
			{
				ans[i]=element;
				
			}
			else
			{
				ans[i]=arr[i];
			}
			
		}
		System.out.println(Arrays.toString(ans));
	}

}
