//1******
//12*****
//123****
//1234***
//12345**
//123456*
//1234567
public class Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=6;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
