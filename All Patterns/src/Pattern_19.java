//12345&
//1234&&
//123&&&
//12&&&&
//1&&&&&
//&&&&&&
public class Pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z=1;
		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>i;j--)
			{
				System.out.print(z);
				z++;
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("&");
			}
			z=1;
			System.out.println();
		}

	}

}
