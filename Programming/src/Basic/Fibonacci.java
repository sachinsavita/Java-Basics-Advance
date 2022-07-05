package Basic;

class PintFibonacci
{
	// Iterative method
	public static void printFibonacciSeries(int n)
	{
		int a = 0;
		int b = 1;
		int c;
		System.out.print(a+" "+ b+" ");
		
			c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		
	}
	
}

public class Fibonacci {
	
	static int a = 0, b = 1;
	
	//Recursive method
		public static void printFib(int n)
		{
			while(n>=0)
			{
				int c = a+b;
				System.out.print(c+" ");
				a =b;
				b=c;
				printFib(n-1);
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling Iterative method
//		PintFibonacci.printFibonacciSeries(10);
		
		int n =11;
		System.out.print(a+" "+b+" ");
		printFib(n-2);
		
		
		
		
		
		

	}

}
