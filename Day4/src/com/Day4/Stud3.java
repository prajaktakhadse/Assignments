
//Create a Student class with the following fields:
//roll: Integer
//name: String
//address: String
//collageName: String
//Include appropriate getter methods
//Create a static method inside this class as follows:
//public static Student getStudent(boolean isFromNIT)
//Assume most of the students are from “NIT” college. So the user has
//to call the above
//method by passing true or false input whether the student is from NIT or not.
//1. If the student belongs to NIT, then create a student object with a 3-argument
//constructor to initialize the values for (roll, name, address) and
//set the collageName
//as “NIT” and return that Student object.
//2. If the student belongs to another college, create the student object with a 4-
//argument constructor to initialize all the values and return that Student object.
//Assignment Day4: 3
//Call the above method from the main method of the Demo class 2 times and print both
//the Student details.

package com.Day4;

public class Stud3 {
	int roll;
	String name;
	String address;
	String collegeName;

	//Include appropriate getter methods
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
    
	//Create a static method inside this class as follows:
	//public static Student getStudent(boolean isFromNIT)
	public static Stud3 getStudent(boolean isFromNIT){
			Stud3 s1 = new Stud3();
			
			if(isFromNIT == true) {
				s1.setName("Ayan");
				s1.setRoll(101);
				s1.setAddress("Dhruv colony");
				s1.setCollegeName("NIT");
		        System.out.println("Name is:-"+ s1.getName());	
		        System.out.println("Roll No. is:-"+s1.getRoll());
		        System.out.println("College:-"+s1.getCollegeName());
		        System.out.println("Address :-"+s1.getAddress());
		}
			else {
				s1.setName("Purvi");
				s1.setRoll(121);
				s1.setAddress("Krishna colony");
				s1.setCollegeName("YCC");
		        System.out.println("Name is:-"+ s1.getName());	
		        System.out.println("Roll No. is:-"+s1.getRoll());
		        System.out.println("College:-"+s1.getCollegeName());
		        System.out.println("Address :-"+s1.getAddress());
			}
			return s1;
		
	}
	public static void main(String[] args) {
		getStudent(false);
	}
}
