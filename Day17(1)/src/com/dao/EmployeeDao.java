package com.dao;
//3 page.........
import com.model.Employee;

import java.util.List;

import com.exceptions.EmployeeException;


public interface EmployeeDao {
	//1st point....
     public String  saveEmployeeDetails(Employee employee);
   //2nd point....
     public Employee getEmployeeById(int empId) throws EmployeeException;
     
     //3rd point..........
     public List<Employee> getAllEmployees();
     
     //4th point....
     public String deleteEmployee(int empId)throws EmployeeException;

     
     
}
