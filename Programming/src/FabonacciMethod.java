import java.util.Scanner;

public class FabonacciMethod{
	static void printFabo(int length)
	{
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1);
		System.out.print(" "+n2+" ");
		for(int i=2;i<=length;i++)
		{
		
		int n3= n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the length of Fabonacci Series: ");
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		printFabo(length);
	}

}
