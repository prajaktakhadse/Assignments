package com.question1;

public  class PermanentEmployee extends Employee{
	//define one private field
  private double basicPay;

  //getter n setter method
	public double getBasicPay() {
		return basicPay;
	}
	
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	
	//Define a 3 parameter constructor
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		this.setEmployeeId(employeeId);
		this.setEmployeeName(employeeName);
	}
	public PermanentEmployee() {
		
	}
	
	//Implement the calculateSalary method 
	public void calculateSalary(String per) {
		  double PFamount = this.basicPay*0.12;
		 double salary =  this.basicPay - PFamount;
		 this.setSalary(salary);
		
	 }

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		
	}

	
	  
}
