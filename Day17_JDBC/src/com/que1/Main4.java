//Develop a JDBC application to insert employee details 
//without address, input should be given by the user.

package com.que1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		
		//to take the input from user
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter  employee id:");
		int id = sc.nextInt();
		
		System.out.println("Enter employee name:");
		String name = sc.next();
		
	
		System.out.println( "Enter employee salary:");
		int Sal = sc.nextInt();
	  	
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
			
	   		PreparedStatement ps4 = conn.prepareStatement("insert into employee(eid,name,salary) values(?,?,?)");
	   		
	   		ps4.setInt(1,id);
	   		ps4.setString(2,name);
	   		ps4.setInt(3,Sal);
	   		
	   		
	   		int updt = ps4.executeUpdate();
	   		
	   		if(updt>0) {
	   			System.out.println(updt + "record inserted.......");
	   		}
	   		else {
	   			System.out.println("record not inserted.....");
	   		}
	   		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	   sc.close();		 
	   	 
	}

}
