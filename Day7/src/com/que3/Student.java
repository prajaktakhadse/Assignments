//Create a class Student that has:
//Instance Variables:
//name: String,
//address: String
//Methods:
//abstract: getPercentage( ) 
//static getTotalNoStudents( )
//Constructors: Initialize name and address



package com.que3;

public abstract class Student {
    String name;
    String address;
    
   abstract  void getPercentage( );
    
   public static void getTotalNoStudents( ) {
         int totalNoStudents =  ScienceStudent.noOfStudents + HistoryStudent.noOfStudents;
         System.out.println("Total No of Students:-"+totalNoStudents);
   }
    	
    
    
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	
	
    
    
}
