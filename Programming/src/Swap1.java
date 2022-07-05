import java.util.Scanner;

public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,c;
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the Value of a ");
        a= scan.nextInt();
        System.out.print("Enter the Value of b ");
        b= scan.nextInt();
        scan.close();
        c=a;a=b;b=c;
        System.out.println("After Swapping");
        System.out.println("New value of a " +a);
        System.out.println("New value of b " +b);
        
        
	}

}
