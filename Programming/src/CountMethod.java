import java.util.Scanner;

public class CountMethod {
	int num;
	static int count;
	
	static int countNum(int num)
	{
		while(num!=0)
		{
			int last = num%10;
			count++;
			num = num / 10;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		CountMethod.countNum( num);
		System.out.println(count);
		
	}

}
