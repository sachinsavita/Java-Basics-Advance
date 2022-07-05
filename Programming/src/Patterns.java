import java.util.Scanner;

public class Patterns {

	
		static void printPattern(int n)
		{
        int i,j;
        for(i=0;i<=n;i++)
        {
        	for(j=0;j<=i;j++)
        	{
        		System.out.print("* ");
        	}
        	System.out.println();
        	
        }
        for(i=n;i>=1;i--)
        {
        	for(j=i;j>0;j--)
        	{
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        System.out.print("Enter the Pattern Column length: ");
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        scan.close();
	        printPattern(n);
		}
}

