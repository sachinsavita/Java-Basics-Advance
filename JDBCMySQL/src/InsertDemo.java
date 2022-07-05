import java.sql.*;
public class InsertDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/demodatabase";
		String uname = "root";
		String pass = "mysqlDB123";
	
		int rollno = 10;
		String sname = "Priyanshu";
		String query = "insert into student values(?,?)";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		PreparedStatement stmt = con.prepareStatement(query); //**
		stmt.setInt(1, rollno);
		stmt.setString(2, sname);
		
		int count = stmt.executeUpdate();  //DDL, DML, DQL
		
		System.out.println(count+ " rows affected");
		
		
		
		
		stmt.close();
		con.close();
		
		

	}

}
