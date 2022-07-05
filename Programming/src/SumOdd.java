
public class SumOdd {
	
	static int sumOdd(int n)
	{    int sum= 0;
	int i;
		for(i=1;i<=n;i=i+2)
		{
			sum=sum+i;
			System.out.println(i);
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = sumOdd(20);
		System.out.println(sum);

	}

}
