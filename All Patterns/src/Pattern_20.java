
public class Pattern_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==j ||j==1||i==7)
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
