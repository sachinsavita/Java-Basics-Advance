/* 
     *
    * *
   *   *
  *     *
 *       *
*    0    *
 *       *
  *     *
   *   *
    * *
     *
 */












public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int n=6;
		int i,j;
		//top patterm
		for(i=1;i<=n;i++)
		{
			//outer gap
		 for(j=n-1;j>=i;j--)
		 {
			 System.out.print(" ");
		 }
		 System.out.print("*");
		 //inner gap
		 for(j=1;j<(i-1)*2;j++)
		 {
			
			 if(i==6 && j>4 && j<=5)
			 {
				 System.out.print("0");
			 }
			 else
			 {
				 System.out.print(" ");
			 }
		 }
		 if(i>1)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
		}
		//bottom 
		for(i=n-1;i>=1;i--)
		{
			for(j=n-1; j>=i;j--)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			//inner gap
			for(j=1;j<(i-1)*2;j++)
			{
				System.out.print(" ");
			}
			if(i>1)
			{
				System.out.print("*");
			}
			System.out.println();
		
		}
		
		
		
	}

}
