
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] heroes = new String[5];
        heroes[2] = "Iron Man";
        heroes[4] = "Thor";
        heroes[3] = "Hulk";
        heroes[1] = "Captain America";
        heroes[0] = "Batman";
      //  System.out.println(heroes.length);
        
        String[] heroes1 = {"Sachin", "Kohli", "MS Dhoni", "Rahul","Sahwag"};
       // System.out.println(heroes1[2]);
        
        
        //print all array values
        for(int i = 0; i<heroes.length;i++)
        {
        	System.out.println(heroes[i]);
        }
        
        
        //print reverse Array
        for(int i = heroes1.length-1;i>=0;i--)
        {
        	System.out.println(heroes1[i]);
        }
        
        System.out.println();
        //for each
        for(String elem : heroes)
        {
        	System.out.println(elem);
        }
        
	}

}
