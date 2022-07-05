import java.util.Scanner;

public class Power {
	
	static int getPower(int digit, int power)
	{
		int pow=1;
		for(int i=1;i<=power;i++)
		{
			pow= pow* digit; 
		}
		return pow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //  System.out.println(Power.getPower(2,4));
		System.out.print("Enter digit and power: ");
		Scanner scan = new Scanner(System.in);
		   int digit = scan.nextInt();
		   int power = scan.nextInt();
		   scan.close();
		   
		  int n= getPower(digit, power);
		   System.out.print(n);
	}

}
