
public class Pattern_13 {
/*	
    *
   * 
  *  
 *   
*    */  

	
	

	public static void printPattern(int length)
	{   
		for(int i =1; i<=length;i++)
		{
		  for(int j=length-1; j>=i; j--)
		  {
			  System.out.print(" ");
		  }
		  for(int k=1; k<=i;k++)
		  {
			 if(i>=2 && (k<=length && k>=2))
			 {
				 System.out.print(" ");
			 }
			 else
			 {
				 System.out.print("*");
			 }
		  }
		  System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}

}
	

