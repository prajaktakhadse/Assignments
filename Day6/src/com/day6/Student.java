//Create a class Student and the sub classes DayScholar and Hosteller,
//Student:
//Instance Variables:
//studId : integer,
//studName :String,
//examFee:double
//Methods:
//displayDetails(): void,
//payFee() :double
//Provide suitable constructors
//DayScholar :
//Instance Variables :
//transportFee: double
//Methods:
//Hosteller :
//Instance Variables:
//hostelFee: double
// Provide suitable constructors
//Create a general class “RunClass”. In this create two objects for each DayScholar and
//Hosteller classes. Invoke payFee() method with suitable amount and obtain the
//remaining amount to be paid.
package com.day6;

public class Student {
  int studId;
  String studName;
  double examFee;
  
  //methods
  void displayDetails() {
	  System.out.println("Name:-"+studName);
	  System.out.println("Id:-"+studId);
	  System.out.println("Exam Fee:-"+examFee);
  }

double payFee(double fee) {
	  return fee;
  }
  
  //getter n setter 
public int getStudId() {
	return studId;
}
public void setStudId(int studId) {
	this.studId = studId;
}
public String getStudName() {
	return studName;
}
public void setStudName(String studName) {
	this.studName = studName;
}
public double getExamFee() {
	return examFee;
}
public void setExamFee(double examFee) {
	this.examFee = examFee;
}

//provide suitable constructor
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int studId, String studName, double examFee) {
	super();
	this.studId = studId;
	this.studName = studName;
	this.examFee = examFee;
}
}
