package com.usecases;
///7th page--3rd point..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
import java.util.Collections;
import java.util.List;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;

public class GetAllEmployeeUseCase {
     public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		
		List<Employee>  lemp = dao.getAllEmployees();
		
		Collections.sort(lemp,(e1,e2) -> e1.getSalary() > e2.getSalary() ?  +1 : -1);
		
		lemp.forEach(emp ->{
			System.out.println("Employee id : "+ emp.getEmpid());
			System.out.println("Employee name:  "+ emp.getName());
			System.out.println("Employee address:  "+ emp.getAddress());
			System.out.println("Employee salary:  "+ emp.getSalary());
			
			System.out.println("-----------------------------------------");
		});
	}
}
