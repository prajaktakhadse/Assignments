package com.que3;

import java.io.Serializable;

public class Employee implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empId;
	 private String empName;
	 private Address address = new Address("Maharashtra", "Chandrapur", "442401");
	 private String email;
	 private transient String password;
	
	
	 
	 
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Employee(int empId, String empName, String email, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		//this.address = address;
		this.email = email;
		this.password = password;
	}





	@Override
	public String toString() {
		return  "Name:"+getEmpName()+" "+"Address:"+address.getCity()+","+address.getState()+","+address.getPincode()
		       +" "+"EmpId:"+getEmail()+" "+"email:"+getEmail()+" "+"Pass:"+getPassword();
	}
	  
	
	 
	  
}
