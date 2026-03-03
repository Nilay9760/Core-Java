package Ass_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class driver_run {

	Connection con;
	public Connection gConnection(){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/stud","root","");
			System.out.println("Driver loaded and Connection Established");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}
}
