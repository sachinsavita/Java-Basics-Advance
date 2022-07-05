
public class Pattern_9 {
	
/*	**********
	 *********
	  ********
	   *******
	    ******
	     *****
	      ****
	       ***
	        **
	         *  */
	
	
	public static void printPattern(int length)
	{
		for(int i=1; i<=length; i++)
		{
			for(int j=2; j<=i; j++)
			{
				System.out.print(" ");
			}
		for(int k=length; k>=i; k--)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 printPattern(10);
	}

}
