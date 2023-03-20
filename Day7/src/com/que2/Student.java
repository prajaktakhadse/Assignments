package com.que2;

import java.util.Scanner;

public class Student {
   private int roll;
   private String name;
   private int marks;
   private char grade;
   

	
	//constructor
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//method.
	public void displayDetails() {
	   Scanner sc1 =new Scanner(System.in);
	   
	   System.out.println("Enter roll number:--");
	   int roll = sc1.nextInt();
	   this.roll = roll;
	   
	   System.out.println("Enter Name:--");
	   String name = sc1.next();
	   this.name = name;
	   
	   System.out.println("Enter the Marks:--");
	   int marks = sc1.nextInt();
	   this.marks = marks;
	   
	
	  char grade = calculateGrade( marks);
	   this.grade =grade;
	   
	   sc1.close();
	   
	   //
	}
	
	public  char calculateGrade(int marks) {
		if(marks >= 500) {
			return 'A';
		}
		else if(marks<500 && marks>=400) {
			return 'B';
        }
		else {//marks<400
			return'C';
		}
	}	
		@Override 
		
		public String toString() {
			return "Roll no : " + roll +" "+
		"Name is : "+name+" "  + "Marks is : "+
					marks+" " +  "Grade is : "+grade;
			 
		}
		
	

}
