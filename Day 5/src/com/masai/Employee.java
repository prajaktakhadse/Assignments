//Create a class Employee as Java Bean class with the following private member
//variables.
//int employeeId
//String employeeName
//double salary
//double netSalary
//Write the following method in the Employee class: public void calculateNetSalary(int
//pfpercentage)  - This method should take PF percentage as argument. Deduct the PF
//amount from the salary and set the netSalary.
//Create a Main class which has the main method which invokes the method to get the
//input and prints the details as shown in the sample.
//Also write a method :
//public static Employee getEmployeeDetails() -  which gets the employee details - id,
//name and salary from the user and returns the employee object.
//public static int getPFPercentage() -  which gets the PF percentage and returns the
//same
//In the main method invoke the above two methods, and then call the calculateNetSalary
//method in Employee class and print the output as shown below.
//Sample Input 1:
//Enter Id: 101 Enter Name: Vivek Enter salary: 20000 Enter PF percentage: 7
//Sample Output 1:
//Id : 101
//Assignment Day5: 2
//Name : Vivek
//Salary : 20000.0
//Net Salary : 18600.0

package com.masai;


public class Employee {
 

	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	
	
	
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
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	 
	//zero arguments constructor
	public Employee() {
		
	}
	
	//parameterized constructor
	public Employee(int employeeId, String employeeName, double salary, double netSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.netSalary = netSalary;
	} 
	
	//calculateNetSalary
	public void calculateNetSalary(int pfpercentage) {
		//Deduct the PF amount from the salary and set the netSalary.
		 double netSalary =  salary-(((double)pfpercentage/100)*salary);
		 setNetSalary(netSalary);
     }
	
	//main class
	public static void main(String[] args) {
		
	}
}
