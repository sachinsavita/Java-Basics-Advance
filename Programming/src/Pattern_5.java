
public class Pattern_5 {
	
/*	*   *
	 * * 
	  *  
	 * * 
	*   *   */
	

	public static void printPattern(int length)
	{
		for(int i = 0; i<length; i++)
		{
			for(int j =0; j<length; j++)
			{
				if(i == j || i+j == length-1)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printPattern(5);
	}
	
}
