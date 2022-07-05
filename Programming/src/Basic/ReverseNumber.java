package Basic;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6754;
		int rev = 0;
		
		while(num>0)
		{
			int r = num%10;
			rev = rev*10+r;
			num = num/10;
		}

		System.out.println(rev);
	}

}
