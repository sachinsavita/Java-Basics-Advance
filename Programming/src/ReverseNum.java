import java.util.Scanner;

public class ReverseNum {
	
	static int reverseNum(int num)
	{     int reverse = 0;
		while(num>0)
		{
			int last = num%10;
			reverse	= reverse*10+last;
				num = num/10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.print("Enter a number to reverse: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int rev= reverseNum(num);
		scan.close();
		System.out.println(rev);
		
		
	}

}
