
public class Pattern_3 {
/*
	
    *
   **
  ***
 ****
*****                      */
	
	
	public static void printPattern(int length)
	{   int z =1;
		for(int i =1; i<=length;i++)
		{
			for(int j=length-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=z;k++)
			{
				System.out.print("*");
			}
			z++;
			System.out.println();
		
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}

}
