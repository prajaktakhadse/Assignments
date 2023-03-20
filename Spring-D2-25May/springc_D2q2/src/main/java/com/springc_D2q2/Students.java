//Write a Spring application to inject the following type of Dependency
//List cities; // read the 5 cities name from the properties file and inject it
//into this List.
//List students; // 5 student details (hard-coded details)
//Make sure to demonstrate the init and destroy the life cycle method also.


//step1:
package com.springc_D2q2;



public class Students {
  
	 private Integer roll_no;
	 private String name;
	 private Integer marks;

	 
	 public Students() {
		// TODO Auto-generated constructor stub
	}



	public Students(Integer roll_no, String name, Integer marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
		
	}


	public Integer getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(Integer roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Students [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + "]";
	}

	
	
}


  
