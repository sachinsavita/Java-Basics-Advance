import java.util.Scanner;

public class Pattern_22 {
	
	
	public static void sqare(int height, int width)
	{   
		if(height<=0 || width<=0)
		{
			System.out.println("Please enter a positive value!");
		}
		else
		{
			for(int i=1; i<=height;i++)
			{
				for(int j=1;j<=width;j++)
				{
					System.out.print("B");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the height: ");
		int height= scan.nextInt();
		System.out.print("Enter the width: ");
		int width= scan.nextInt();
		scan.close();
		Pattern_22.sqare(height, width);
	}

}
