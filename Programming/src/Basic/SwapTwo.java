package Basic;

public class SwapTwo {
	
	public static void swap(int a, int b)
	{
		a= a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a+" value of a--------"+b+" value of b");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 11;
		int b = 99;
		swap(a,b);
	}

}
