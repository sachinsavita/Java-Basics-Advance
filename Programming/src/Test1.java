import java.util.Scanner;

public class Test1 {
	
	public static int reverse(int num)
	{
		int reverse = 0;
		while(num>0)
		{
			int last = num%10;
			reverse = reverse*10+last;
			num = num/10;
		}
		return reverse;
	}
	public static void main(String[] args)
	
	{
		int rev = reverse(234);
		System.out.println(rev);
	}

}
