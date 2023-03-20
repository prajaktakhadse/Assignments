//COURSE DETAILS WITH AUTHENTICATION:
//Create a class Course with 3 instance variables:
//
//courseId: int
//courseName: String
//courseFee: int
//Define a non-static method inside the Course class as follows:
//
//displayCourseDetails: void
//
//Inside the above method print all the details of the course.
//
//Define a static method inside the Course class
//
//authenticate: void
//
//This method will take 2 parameters:
//
//username: String
//
//password: String
//
//Implement this authenticate() method as follows:

//If the supplied username is "Admin" and the password is "1234" then inside this method 
//create the Course class object and set the value of courseId, 
//courseName, courseFee on that object and 
//call the displayCourseDetails() method on that course object. 

//Otherwise, print "Invalid Username or password"

//Define the main method inside the Course class and call the authenticate() method 2 
//times first time with a valid username and password and the second time with an
//invalid username and password

package com.week;

public class Course {
  int courseId;
  String  courseName;
  int courseFee;
  
 public  static void main(String[] args) {
	 String userName ="Admin";
	 String passWord ="1234";
	 authenticate(userName ,passWord);
	 authenticate("Admin","1234");
	 authenticate("Admin","2568");
	 
 }
  
  
   void  displayCourseDetails() {
	   System.out.println("courseID:"+ courseId);
	   System.out.println("courseName:"+ courseName);
	   System.out.println("courseFee:"+ courseFee);
   }
   
    static void authenticate(String userName , String passWord) {
    	
    	if(userName=="Admin" && passWord =="1234") {
    		Course obj = new Course();
	
    		obj.courseId = 1;
    		obj.courseName ="Ayan";
    		obj.courseFee =15000;
    		obj.displayCourseDetails();
    		
    		System.out.println(" ");
    		System.out.println("Valid Username or password");
    	}
    	else {
    		System.out.println("Invalid Username or password");
    	}
    }
}
