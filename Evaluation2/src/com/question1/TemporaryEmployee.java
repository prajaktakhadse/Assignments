package com.question1;

public class TemporaryEmployee extends Employee{

	private int hoursWorked;
	private int hourlyWages;
	
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	public TemporaryEmployee(int hoursWorked, int hourlyWages, int employeeId, String employeeName) {
		super();
		
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
		this.setEmployeeId(employeeId);
		this.setEmployeeName(employeeName);
		
	}
	public TemporaryEmployee() {
		
	}
	
	public void calculateSalary(String per) {
		
		double salary = this.hourlyWages * this.hoursWorked;
		
		this.setSalary(salary);
		
	}
	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
