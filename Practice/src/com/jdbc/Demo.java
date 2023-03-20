package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) {
		
		//2nd step:optional
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3rd step:
		String url = "jdbc:mysql://localhost:3306/question1";
		
		try {
			Connection conn = DriverManager.getConnection(url, "root","root");
			
			//Statement 
			if(conn != null)
				System.out.println("connected......");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
     
}
