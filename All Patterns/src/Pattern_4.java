
public class Pattern_4 {
	
/*	********
	*      *
	*      *
	*      *
	*      *
	*      *
	*      *
	********                */
	
	
	public static void printPattern(int length)
	{
		for(int i=1; i<=length; i++)
		{
			for(int j=1;j<=length;j++)
			{
				if(i>=2 && j>=2 && i<=length-1 && j<=length-1)
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
		printPattern(10);
	}

}
