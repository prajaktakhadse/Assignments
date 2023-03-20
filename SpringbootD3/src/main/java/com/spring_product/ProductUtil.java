package com.spring_product;


/*step2:--*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProductUtil {
	public  static Connection provideConnection() {
		Connection conn = null;
		/*step2:--load the driver*/
		try {
			Class.forName("com.mysql.cj.j"
					+ "dbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*step3:-prepare the statement */
		String url =  "jdbc:mysql://localhost:3306/prod1";
		
		/*step4:-establish the  connection*/
		 try {
			conn = DriverManager.getConnection(url,"root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
		return conn;  
	}
}
