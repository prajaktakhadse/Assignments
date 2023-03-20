package com.revision2;

public class Instructor extends Person{
	private int instructorId  ;
	private int salary ;
	
	
	
	public Instructor() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Instructor(int instructorId, int salary) {
		super();
		this.instructorId = instructorId;
		this.salary = salary;
	}




	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + ", Address" +
				getAddress() + "]";
	}
	
	
}
