package Basic;

public class Factorial {
	
	static int result = 1;
	
	public static int printFact(int n)
	{
	   if(n>0)
	   {
		   result = result*n;
		   printFact(n-1);
		   
	   }
		   return result;
	  
	   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factValue = printFact(4);
		System.out.println(factValue);

	}

}
