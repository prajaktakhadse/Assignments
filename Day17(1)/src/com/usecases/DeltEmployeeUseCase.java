package com.usecases;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.exceptions.EmployeeException;


public class DeltEmployeeUseCase {
       public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the id which want to be delted:");
		int delid = sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			String deltEmp = dao.deleteEmployee(delid);
			
			
				System.out.println(deltEmp);
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
