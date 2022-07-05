package Basic;

import java.util.ArrayList;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {23,23,40,45,45,68,68,70,70};
		System.out.print("Old array: ");
		for(int a=0;a<arr.length; a++)
		{
			System.out.print(arr[a]+" ");
		}
		int [] temp = new int[10];
		int j = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j] = arr[i];
				j++;
			}
		}
		System.out.println();
		System.out.print("New array: ");
		for(int k=0; k<temp.length;k++)
		{
			System.out.print(temp[k]+" ");
		}
		
		                   

}
}
