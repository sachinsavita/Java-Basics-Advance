
public class Pattern_14 {
/*	
         *
        * *
       *   *
      *     *
     *       *
    *         *
   *           *                          */

             public static void main(String[] args) {
			
        	 for(int i=1; i<=7; i++)
        	 {
        		 for(int j=6; j>=i; j--)
        		 {
        			 System.out.print(" ");
        		 }
        		 for(int k=1; k<(i*2);k++)
        		 {
        			 if(k>=2 && (k<((i*2)-1)))
                     {
        				 System.out.print(" ");
        			 }
        			 else{
        				 System.out.print("*");
        			 }


        		 }
        		 
        		 System.out.println();
        	 }
        	 
		}
}
