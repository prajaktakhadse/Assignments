//Develop a JDBC application to search Employees based
//on Id.

package com.que1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		
		//to take the input from user
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter  employee id:");
		int id = sc.nextInt();
		
		//2nd step:load the driver
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	 //3rd step: prepare connection
   	    String url = "jdbc:mysql://localhost:3306/db1";
   	    
   	    
   	//4thh step: establish the connection in try catch block
   	 try (Connection conn = DriverManager.getConnection(url,"root", "root")){
			//select is used use result set
	   		PreparedStatement ps5 = conn.prepareStatement("select * from employee where eid = ?");
	   		
	   		ps5.setInt(1,id);
	   		
	   	    ResultSet rs5 = ps5.executeQuery();
	   	    
	   	//iterate 
    		while(rs5.next()) {
    		 //get the value
    			int empid = rs5.getInt("eid");
    			String name = rs5.getString("name");
    			String add = rs5.getString("address");
    			int Sal = rs5.getInt("salary");
    			
    			//output
    			System.out.println("****************************");
    			System.out.println("Employee ID: "+ empid);
    			System.out.println("Employee Name: "+ name);
    			System.out.println("Employee Address: "+ add);
    			System.out.println("Employee Salary "+ Sal);
    			System.out.println("****************************");
    			
    		}
	   		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   sc.close();		 
	}
	
			
			
}
