package Basic;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Use of class object
		Random obj = new Random();
		System.out.println(obj.nextInt(100));
		
		//Use of method
		int a = (int)(Math.random()*(200-100+1)+100);
		System.out.println(a);

	}

}
