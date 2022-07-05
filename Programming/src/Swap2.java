import java.util.Scanner;

public class Swap2 {
	
	public static void swap(int a, int b)
	{
		a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping");
        System.out.println("New value of a " +a);
        System.out.println("New value of b " +b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the Value of a ");
        a= scan.nextInt();
        System.out.print("Enter the Value of b ");
        b= scan.nextInt();
        scan.close();
        
        swap(a,b);
        
	}

}
