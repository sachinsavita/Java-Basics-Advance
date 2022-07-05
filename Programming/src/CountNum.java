
public class CountNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 989;
        System.out.println(num);
        while(num!=0)
        {
        	int last = num%10;
        	System.out.println(last);
        	num = num/10;
        }
	}

}
