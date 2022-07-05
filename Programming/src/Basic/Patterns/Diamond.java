package Basic.Patterns;

public class Diamond {

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
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		
		int space = 1;
		for(int i=n-1;i>0;i--)
			
		{
			
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");	
				
			}
			space++;
			for(int k=i;k>0;k--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		

	}

}
