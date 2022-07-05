import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int flag = 0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0){
				flag++;
			}
			
		}
		if(flag == 0)
		{
			System.out.println(num+ ": is Prime");
		}
		else{
			System.out.println(num + ": is not prime.");
		}
		System.out.println("Flag value: "+flag);
			 
		

	}

}
