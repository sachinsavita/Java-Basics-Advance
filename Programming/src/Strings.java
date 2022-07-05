import java.util.Scanner;

public class Strings {

	public static void main(java.lang.String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
         System.out.print("Enter a String: ");

      String s = scan.nextLine();
      scan.close();
      for(int i = (s.length()-1);i>=0;i--)
      {
    	  System.out.print(" "+s.charAt(i));
      }
	}

}



