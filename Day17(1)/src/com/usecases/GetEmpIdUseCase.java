package com.usecases;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.exceptions.EmployeeException;
import com.model.Employee;

public class GetEmpIdUseCase {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//import scanner class to give input
		
		System.out.println("Enter EmpId: ");//id only as the question is GetEmployeeById
		int id = sc.nextInt();
		
		//create the object from where we want to take...
		EmployeeDao empdao = new EmployeeDaoImpl();
		//System.out.println(empdao);com.dao.EmployeeDaoImpl@5a42bbf4
		try {
			Employee EmpName = empdao.getEmployeeById(id);//connected to employeedaoimpl
			System.out.println(EmpName);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
