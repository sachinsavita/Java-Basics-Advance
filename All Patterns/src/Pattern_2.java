
public class Pattern_2 {
	
/*	*****
	*****
	*****
	*****
	*****   */
	
	
	public static void printPattern(int length)
	{
		for(int i = 1; i<=length ; i++)
		{
	       for(int j = 1; j<=length; j++)
	       {
	    	   System.out.print("*");
	       }
	       System.out.println();
		}
	}

	public static void main(String[] args) {
		printPattern(5);
	}
}
