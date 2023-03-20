package com.usecases;
//5th page......
import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;

public class InsertEmployeeCase {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter empId:");
		int id =  sc.nextInt();
		
		System.out.println("Enter name:");
		String name = sc.next();
		
		System.out.println("Enter address:");
		String add = sc.next();
		
		System.out.println("Enter salary:");
		int sal = sc.nextInt();
		
		
		
		Employee employee = new Employee(id,name,add,sal);
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		String result = dao.saveEmployeeDetails(employee);
		
		System.out.println(result);
		
		sc.close();
	}
}
