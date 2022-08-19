//1.Import the package
import java.sql.*; 
public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//1. import the package---> java.sql.*;
		//2. Load and Register the driver---> com.mysql.jdbc.driver
		//3. Establish the connection
		//4. Create the statement
		//5. Execute the query
		//6. Process result
		//7. close connection
	String url = "jdbc:mysql://localhost:3306/demodatabase";
	String uname = "root";
	String pass = "mysqlDB123";
	String query = "select * from student";
	String query1 = "select sname from student where rollno = 1";
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");//class forname telusko     //2. register or load driver
	Connection con = DriverManager.getConnection(url,uname,pass);         //3. establish the connection
	Statement st = con.createStatement();                                 //4. create the statement
	ResultSet rs = st.executeQuery(query);                                //5. execute the query
	while(rs.next())
	{
		String userdata = rs.getInt(1)+ " : " + rs.getString(2);          //6. process the result
		System.out.println(userdata);
		
	}
	
	System.out.println();
	ResultSet rs1 = st.executeQuery(query1);
	
	rs1.next();
	String name = rs1.getString("sname");
	System.out.println(name);
	
	st.close();                                                           //7.close statement & connection
	con.close();
		

	}

}
