package practicepractice2;

import java.util.Arrays;

public class Arrayrotate {
public static void main(String[] args) {
	
	int arr[]= {10,20,30,40,50,60,70,80};
	int rotate=4;//from 50 it will rotate
	int index=0;
	int ans[]=new int[arr.length];
	
	for(int i=rotate;i<arr.length;i++)
	{
		ans[index]=arr[i];
		index++;
	}
	
	for(int i=0;i<rotate;i++)
	{
		ans[index]=arr[i];
		index++;
	}
	
	System.out.println(Arrays.toString(ans));
}
}
