import java.util.Scanner;

class Fabonacci{
	public static void main(String[] args) {
		long n1=0, n2=1,n3,length;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of fabbonacci Series you want: ");
		length = scan.nextInt();
		System.out.print(n1+" "+n2+" ");
		for(int i =0;i<length;i++)
		{
			n3 = n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		
		
	}
}
