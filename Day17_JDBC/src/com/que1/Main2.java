//Develop a JDBC application to get all employee’s all details from the table

package com.que1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main2 {
     public static void main(String[] args) {
		//2nd step: load the driver
    	 
    	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	 
    	 //3rd step: prepare connection
    	 
    	 String url = "jdbc:mysql://localhost:3306/db1";
    	 
    	 //4thh step: establish the connection in try catch block
    	  
    	 try(Connection conn = DriverManager.getConnection(url,"root", "root")){
    		 
    		 //5th step: perform the operation            |-----query--------------|
    		 PreparedStatement ps2 = conn.prepareStatement("select * from employee");
    		 //as all we have to print no need to set the value ,directly excute
    		ResultSet rs =  ps2.executeQuery();
    		
    		//iterate 
    		while(rs.next()) {
    		 //get the value
    			int id = rs.getInt("eid");
    			String name = rs.getString("name");
    			String add = rs.getString("address");
    			int Sal = rs.getInt("salary");
    			
    			//output
    			System.out.println("Employee ID: "+ id);
    			System.out.println("Employee Name: "+ name);
    			System.out.println("Employee Address: "+ add);
    			System.out.println("Employee Salary "+ Sal);
    			System.out.println("****************************");
    			
    		}
    		 
    		 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
	}
}
