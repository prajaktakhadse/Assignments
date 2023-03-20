//Develop a JDBC application to provide the bonus to all 
//the employees as 500/.

package com.que1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
    	//put the bonus as user input
    	Scanner sc =  new Scanner (System.in);
    	System.out.println("Enter the bonus:");
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
  	  
   	 try(Connection conn = DriverManager.getConnection(url,"root", "root")){
   		 
   		 //5th step: perform the operation            |-----query--------------|
   		    PreparedStatement ps2 = conn.prepareStatement("update employee set salary = salary+?");
   		 //as all we have to print we need to set the value ,directly excute
   	    	ps2.setInt(1,Sal);
   		    int rs =  ps2.executeUpdate();
   			
   			//output
   		    if(rs>0) {
   			
   			System.out.println(rs +" record updated......");
   			System.out.println("****************************");
   		    }
   		 else
				System.out.println("not updated...");
   		 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	 sc.close();
	}
}
