package com.question1;

public abstract class Employee {
   protected int  employeeId;
   protected String employeeName;
   protected double salary;
   
   
   // getter setter methods.
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//argument constructor
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		
	}
	
	//abstract method
	 abstract void calculateSalary() ;
		
	
   public Employee() {
	   super();
   }
	
	
	
	
   
}
