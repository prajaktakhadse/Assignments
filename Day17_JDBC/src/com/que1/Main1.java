
//Develop a JDBC application to get the salary of a
//particular employee, whose Id is given by the user.


package com.que1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class Main1 {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
     	 
     	 System.out.println("Enter empid: ");
     	 int empid = sc.nextInt();
     	 
     	 ////2nd step:optional----load the driver
 		try {
 			Class.forName("com.mysql.cj.jdbc.Driver");
 		} catch (ClassNotFoundException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		
 		//3rd step:-
 				//Prepare the connection
 				String url = "jdbc:mysql://localhost:3306/db1";
 				
 				//4:establish the connection
 				try {
					Connection conn = DriverManager.getConnection(url,"root", "root");
					
					PreparedStatement s1 = conn.prepareStatement("select Salary from employee where eid = ?");
				   //0s1.execute();
					s1.setInt(1,empid);
					ResultSet x = s1.executeQuery();
				   if(x.next()) {
					   //int r = x.getInt(epmid);
					   int Salary = x.getInt("Salary");
					   System.out.println("---------------------");
					   System.out.println("EmpID is: "+empid);
					   System.out.println("EmpSalary is:"+Salary);
				   }
				   else {
					   System.out.println("somwhere u have doene incorrect");
				   }
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 				sc.close();
	}
}
