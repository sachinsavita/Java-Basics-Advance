
public class KSolves_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 7;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=rows;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i=rows-1;i>0;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=rows;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}
}


