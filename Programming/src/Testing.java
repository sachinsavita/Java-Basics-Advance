class Check
{
	static void isPrime(int num)
	{
		int flag = 0 ;
		
		for(int i=2;i<num;i++)
		{
			if (num%i==0)
			{
				flag++;
			}
			
			
		}
		
		if (flag==0)
		{
			System.out.println("Number is Prime");
		}
		else System.out.println("Not prime");
	}
}




public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 101;
		Check.isPrime(num);

	}

}
