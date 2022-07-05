import java.util.Scanner;

public class FactMethod {
	static int fact = 1;
	static int factorial(int num)
	{
		
		for(int i = 1; i<num; i++)
		{
			fact = fact * i;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter : ");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		    scan.close();
		FactMethod.factorial(num);
		
		System.out.println(fact);
	}
	
}
