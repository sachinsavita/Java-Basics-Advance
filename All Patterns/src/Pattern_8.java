
public class Pattern_8 {
                          
/*       *
        **
       ***
      ****
     *****
    ******
   *******   */

	
	public static void printPattern(int length)
	{
		for(int i=1;i<=length;i++)
        {
        	for(int j=length-1; j>=i;j--)
        	{
        		System.out.print(" ");
        	}
        	for(int k=1; k<=i;k++)
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
