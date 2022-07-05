
public class AccArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] values = new int[10];
        values[2] = 12;
        values[4] = 33;
        values[3] = 65;
        values[1] = 44;
        values[0] = 98;
        values[6] = 13;
        values[5] = 36;
        values[7] = 62;
        values[9] = 49;
        values[8] = 91;
        System.out.println("Using for each loop: ");
        for(int i: values)
        {
        	System.out.print(" "+i);
        }
        System.out.println();
        System.out.println("Using for loop: ");
        
        for(int i=0;i<values.length;i++)
        {
        	System.out.print(" "+values[i]);
        }
        
        
        
	}

}
