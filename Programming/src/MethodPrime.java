import java.util.Scanner;

public class MethodPrime {
	
	static boolean isPrime(int num)
	{
		boolean flag = true;
		
		if(num == 0 || num==1){
			flag = false;
		}
		
		for(int i=2; i<num;i++)
		{
			if(num%i==0){
				flag = false;
			}
			
		}
		return flag;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to check whether it is prime or not? ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.close();
        	boolean res = MethodPrime.isPrime(i);
        	if (res==true)
        	{
        		System.out.println(i+" is prime");
        	}
        	else{
        		System.out.println(i+" is not prime");
        	}
        
        
	}

}
