import java.util.Scanner;

public class BuzzFizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        
        
        if(n%3==0 && n%5==0){
        	System.out.println("BuzzFizz");
        }
        else if(n%5==0){
        	System.out.println("Fizz");
        }
        
        else if(n%3==0 )
        {
        	System.out.println("Buzz");
        }
        		
	}

}
