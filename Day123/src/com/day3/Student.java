//Create a class Student with 3 instance variables:
//roll: int
//name: String
//marks: int
//Create a non-static method inside the Student class:
//displayStudentDetails: void
//
//inside the above method print all the details of the student in the following format:
//
//Roll is :
//
//Name is :
//
//Marks is :
//
//From the main method of the Student class create 2 Student 
//class objects and sets the proper details to both objects and call 
//the above displayStudentDetails method on the both student objects.
//
//After calling the method on both student objects, make both the object 
//eligible for the garbage collector.

package com.day3;

public class Student {
     int Roll;
     String Name;
     int Marks;
     
     
     void displayStudentDetails() {
    	 System.out.println("Roll is :"+ Roll );
    	 System.out.println("Name is :"+ Name );
    	 System.out.println("Marks is :"+ Marks );
     }
     
     public static void main(String[] args) {
		Student Details1 = new Student();
		Details1.Roll = 21;
		Details1.Name = "Krishna";
		Details1.Marks = 100;
		Details1.displayStudentDetails();
	   
		System.out.println(" ");
		
		Student Details2 = new Student();
		Details2.Roll = 31;
		Details2.Name = "Radha";
		Details2.Marks = 98;
		Details2.displayStudentDetails();
		
	}
     
}
