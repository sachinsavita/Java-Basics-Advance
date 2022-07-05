import java.util.Scanner;

public class Test {
    static void getPattern(int rows)
    {    int k = 2*rows -2; 
    	for(int i=0;i<rows;i++)
    	{
    		for(int j=0; j<k;j++)
    		{
    			System.out.print(" ");
    		}
    		k=k-1;
    		for(int j=0;j<=i;j++)
    		{
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    	
    	
    	
    	for(int i=rows;i>0;i--)
    	{
    		for(int j=k; j>0;j--)
    		{
    			System.out.print(" ");
    		}
    		k=k+1;
    		for(int j=i;j>0;j--)
    		{
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    	
    	
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the value of rows: ");
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		scan.close();
		getPattern(rows);
		
		

	}

}
