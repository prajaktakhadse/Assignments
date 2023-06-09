//Create a Student Bean class with the following fields:
//roll: Integer
//name: String
//Assignment Day5: 5
//address: String
//marks: Integer
//Create a Demo class and perform the following operation in the main method:
//Take the number as input from the user, How many Student objects need to be
//created.
// Create an array of Students with those numbers.
//Initialize all the student objects by taking details from the user.
//print all the Student details
//print the average of all the Student marks

package com.question4;


   
	 public class Student{
	      private Integer roll ;
	      private String name ;
	      private String  address;
	      private Integer marks ;
	      

	     public Student(){
	            super();
	            //noArgsConstructor
	     }
	    
	    

	    public Student(Integer roll, String name, String address, Integer marks) {
			super();
			this.roll = roll;
			this.name = name;
			this.address = address;
			this.marks = marks;
		}



		public Integer getRoll(){
	         return roll;
	    }
	    
	    public void setRoll( Integer roll ){
	        this.roll = roll ;
	    }

	    public String getName(){
	          return name;
	    }
	    
	    public void setName( String name ){
	        this.name = name ;
	    }
	   
	    public  String getAddress(){
	       return address;
	    }
	   
	    public void setAddress( String address){
	       this.address = address ;
	    }
	   
	    public Integer getMarks(){
	       return marks;
	    }
	    
	    public void setMarks( Integer marks ){
	       this.marks = marks ;
	    }

	
	

    
}
