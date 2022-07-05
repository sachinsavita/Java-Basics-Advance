  import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number,a,n,arm=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check, Is it Armstrong or not? ");
        number = scan.nextInt();
        scan.close();
        n = number;
        while(number>0) 
        {
        a= number%10;
        arm =arm + (a*a*a);
        number = number/10;
        }
        if(n==arm)
        {   
        	System.out.println("The number You Entered is Armstrong! ");
        }
        else{
        	System.out.println("The number You Entered is not Armstrong!");
        }
        
        
	}

}
