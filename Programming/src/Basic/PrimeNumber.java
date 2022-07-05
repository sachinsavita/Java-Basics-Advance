package Basic;

public class PrimeNumber {
	static int count = 0 ;
	static int isPrime(int num)
	{
		for(int i = 2;i<num;i++)
		if(num==0 || num==1 || num%i==0)
		{
			count++;
			System.out.println("Number is not Prime.");
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    	 int res = isPrime(9);
	    	 if(res==0)
	    	 {
	    		 System.out.println("Number is Prime.");
	    	 }

	}

}
