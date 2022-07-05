package Basic;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 88866888;
		long temp = num;
		long pali = 0;
		while(num>0)
		{
			long a = num%10;
			pali = pali*10+a;
			num = num/10;
			
		}
		System.out.println(pali);
		if(pali == temp)
		{
			System.out.println("number is Palindrome");
		}
		else
			System.out.println("Not");

	}

}
