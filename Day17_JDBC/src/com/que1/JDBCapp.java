//Create the Database and tables as follows:
//
//create database db1;
//
//use db1;
//
//table:
//employee
//	eid int primary key
//  name varchar(15)
//  address varchar(15)
//  salary int
//Develop a JDBC application to get the salary of a
//particular employee, whose Id is given by the user.
//
//Develop a JDBC application to get all employee’s all 
//details from the table
//
//Develop a JDBC application to provide the bonus to all 
//the employees as 500/.
//
//Develop a JDBC application to insert employee details 
//without address, input should be given by the user.
//
//Develop a JDBC application to search Employees based
//on Id.
//
//Develop a JDBC application to list out all the Employee
//Details whose salary is less than 80000;



package com.que1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCapp {
     public static void main(String[] args) {
    	 //take input from user  
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.println("Enter empid: ");
    	 int empid = sc.nextInt();
    	 
    	 System.out.println("Enter empName: ");
    	 String name = sc.next();
    	 
    	 System.out.println("Enter empAddress: ");
    	 String add = sc.next();
    	 
    	 System.out.println("Enter empSalary");
    	 int Salary = sc.nextInt();
    	 
    	 
    	 
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
		
		
		//step4:establish the connection                    //name , // password
		try(Connection conn = DriverManager.getConnection(url, "root", "root")){
			
			//create Statement
			PreparedStatement ps1 = conn.prepareStatement("insert into employee values(?,?,?,?)");
			ps1.setInt(1, empid);
			ps1.setString(2, name);
			ps1.setString(3,add);
			ps1.setInt(4, Salary);
			
			int x = ps1.executeUpdate();
			
			if(x>0) {
				System.out.println("record inserted....");
			}
			else
				System.out.println("not inserted.....");
			
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}

























