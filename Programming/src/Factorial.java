import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int fact=1,number,i;
        System.out.print("Enter a number for Factorial Value: ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        scan.close();
        for(i=1;i<=number;i++)
        {
              fact = fact * i;
        }
              System.out.println("Factorial of "+number+ " is "+fact+ ".");
	
        
	}

}
