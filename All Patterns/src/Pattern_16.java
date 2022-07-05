//1 
//2 9 
//3 10 16 
//4 11 17 22 
//5 12 18 23 27 
//6 13 19 24 28 31 
//7 14 20 25 29 32 34 
//8 15 21 26 30 33 35 36
public class Pattern_16 {
	public static void main(String[] args) {
		
	
	
	
	for(int i=1; i<=8; i++)
	{ int num =i;
		for(int j=1; j<=i;j++)
		{
			System.out.print(num+" ");
			num=num+8-j;;
		}
		
		
		System.out.println();
	}

}
}
