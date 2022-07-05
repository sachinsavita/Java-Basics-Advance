import java.util.Scanner;

public class ArrPrime {
	
       static void arrPrime(int[] arr)
       {   int count = 0;
    	  for(int i : arr){
    		  for(int j = 2;j<i;j++)
    		  {
    			  if(i%j==0){
    				  count++;
    			  }
    			  
    		  }
    		  if(count == 0)
    		  {
    			  System.out.println(i+" is prime");
    		  }
    		  else
    		  {
    			  System.out.println(i+" is not prime");
    		  }
    		  count = 0;
    	  }
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print("Enter array Length: ");
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		System.out.print("Enter elements for Array: ");
		int[] arr= new int[length];
		for(int i = 0;i<length;i++){
	    Scanner s = new Scanner(System.in);
		 arr[i]= s.nextInt();
		 
		}
		arrPrime(arr);
		
	}

}
