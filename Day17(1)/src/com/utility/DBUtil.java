package com.utility;
//1st page

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
     
		 public static Connection provideConnection() {
			 
			 ////2nd step:optional----load the driver 
			 Connection conn = null;
			  
			  try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} 
			  catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			//3rd step:-
				//Prepare the connection
			  String url = "jdbc:mysql://localhost:3306/dao";
			  
			//4:establish the connection
			try {
				conn =  DriverManager.getConnection(url,"root", "root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//System.out.println("hello..!");
				e.printStackTrace();
			}
			
			
		return conn;
	 }
		
}
