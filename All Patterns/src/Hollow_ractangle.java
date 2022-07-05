
public class Hollow_ractangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		int i,j;
		
		// top pattern 
         for( i=1; i<=n;i++)
         {
         
            for(j=n-1;j>=i;j--)
             {
        	 System.out.print(" ");
             }
             System.out.print("*");
         // inner gap loop
           for( j=1; j<(i-1)*2; j++)
    	    {
    		 System.out.print(" ");
    	    }
    	   if(i>1)
    	    {
    		 System.out.print("@");
    	    }
        	 System.out.println();
        }
         //bottom pattern
        for(i=n-1;i>=1;i--)
        {
        	//outer gap
        	for(j=n-1;j>=i;j--)
        	{
        		System.out.print(" ");
        	}
        	System.out.print("#");
        	//inner gap
        	for(j=1;j<(i-1)*2;j++)
        	{
        		System.out.print(" ");
        	}
        	if(i>1)
        	{
        		System.out.print("$");
        	}
        	System.out.println();
        }
       
	}

}
