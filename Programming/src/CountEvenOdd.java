
public class CountEvenOdd {
	
	static int countEvenOdd(int n)
	{
		int evenCount = 0;
		int oddCount = 0;
		while (n>0)
		{
			int rem = n%10;
			if(rem%2 == 0)
			{
				evenCount++;
			}
			else{
				oddCount++;
			}
			n = n/10;
		}
		System.out.println("Even Count: " +evenCount);
		System.out.println("Odd Count: " +oddCount);
		
		if(evenCount%2 == 0 && oddCount!=0)
		{
			return 1;
		}
		else{
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n= 3463536;
        int t =countEvenOdd(n);
        
	}

}
