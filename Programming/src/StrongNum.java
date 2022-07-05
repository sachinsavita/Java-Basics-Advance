import java.util.Scanner;

public class StrongNum {
	
	static int factorial(int num)
	{    int fact = 1;
		 for(int i=1;i<=num;i++)
	        {
	              fact = fact * i;
	        }
		 return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("Enter a number to check whether it is Strong or not: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int temp = num;
		int sum=0;
		while(num>0)
		{
			int last = num%10;
			sum = sum+ factorial(last);
			num = num / 10;
			
		}
		
		if(sum==temp)
		{
			System.out.println("Number is Strong.");
			
		}
		else{
			System.out.println("Number is not Strong.");
		}
		
	}

}
