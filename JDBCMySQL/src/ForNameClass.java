import java.sql.DriverManager;

public class ForNameClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	    //	PQR obj = new PQR();
		
		//while loading class == will execute static block
		//while loading object == will execute instance block
		
		Class.forName("PQR").newInstance();//.newInstance will create the object
		
		
		Class.forName("com.mysql.jdbc.Driver");    //same
		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());   //same

	}
 
}
class PQR{
	
	static
	{
		System.out.println("in static");
	}
	//instance block
	{
		System.out.println("in instance");
	}
	
}
