
public class Pattern_6 {
/*     *
      ***
     *****
    *******
   *********
  ***********
 *************
***************        */
	
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
			for(int l=2; l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	public static void main(String[] args) {
		printPattern(8);
	}

}
