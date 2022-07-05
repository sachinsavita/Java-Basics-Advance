package Basic;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {3,4,5,6,33,44,66,88,46,38,23,445};
		int [] Earr = new int[10];
		int [] Oarr =  new int[10];
		int j=0;
		int k=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				Earr[j] = arr[i]; 
				j++;
			}
			else
			{
				Oarr[k] = arr[i];
				k++;
			}
			
			
		}
		
		System.out.println("Even numbers: " );
		for(int l = 0;l<Earr.length;l++)
		{
			System.out.print(Earr[l]+" ");
		}
		System.out.println();
		System.out.println("Odd numbers: " );
		for(int m= 0;m<Oarr.length;m++)
		{
			System.out.print(Oarr[m]+" ");
		}
		
		
		

	}

}
