package Basic.Patterns;

public class LeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");	
				
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");   //Add a space after * for pyramid
			}
			
			System.out.println();
			
		}
		

	}

}
