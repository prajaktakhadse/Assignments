//Create a java bean class Employee with following fields:
//empId: integer
//empName: String
//salary : double

//Create a Main class with the main method and do the following things inside the main method:
//Create 4 Employee class object by taking details from the user using the Scanner class
//Add all 4 Employee object inside the TreeSet class (Employee should be sorted according to the salary)
//Print all 4 Employee Details one by one from the TreeSet object

package com.que3;

public class Java implements Comparable<Java>{

	private int empId;
    private String empName;
    private Double salary;
    
    

	public Java() {
		super();
		// TODO Auto-generated constructor stub
	}

    
	public Java(int empId, String empName, Double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	
	
	
	public int getEmpId() {
		return empId;
	}




	public void setEmpId(int empId) {
		this.empId = empId;
	}




	public String getEmpName() {
		return empName;
	}




	public void setEmpName(String empName) {
		this.empName = empName;
	}




	public Double getSalary() {
		return salary;
	}




	public void setSalary(Double salary) {
		this.salary = salary;
	}


//  public void detail() {
//	    System.out.println("Emp ID : "+getEmpId());
//		System.out.println("Emp Name : "+getEmpName());
//		System.out.println("Emp Salary : "+getSalary());
//  }

	@Override
public String toString() {
	return "Emp ID : " + getEmpId() + "\n" + "Emp Name : " + getEmpName() + "\n" 
          + "Emp Salary : " + getSalary() ;
}
    
	//Overriding to compareTo method to sort the object according to the Salary

	@Override
	public int compareTo(Java emp) {
		// TODO Auto-generated method stub
		return salary.compareTo(emp.salary);
	}
	
}
