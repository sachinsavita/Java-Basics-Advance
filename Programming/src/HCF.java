
public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int min =0;
		int x = 21;
		int y= 14;
		int z= 7;
		if(x<y && x<z)
		{
			min = x;
		}
		else if(y<x && y<z)
		{
			min = y;
		}
		else{
			min = z;
		}
		
		int gcd = 0;
		for(int i = min ; i>=1; i--)
		{
			if((x%i == 0 && y%i ==0)&& (y%i == 0 && z%i ==0) && (z%i==0 && x%i==0))
			{
				gcd=i;
				break;
			}
		}
		System.out.println(gcd+ " is gcd");
		
	}

}
