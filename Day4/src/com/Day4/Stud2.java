//Create a Java class Demo with 4 parameterized constructors as follows:
//1. Demo()
//2. Demo(String s)
//3. Demo(int i)
//Assignment Day4: 2
//4. Demo(float f)
//Put a statement in all the constructors which will denote it is the part of the respected
//constructor.
//Create a Single java object of the Demo class in such a way that it will call all the 4
//constructors.

package com.Day4;

public class Stud2 {
	
	//zero argument constructor
  public Stud2() {
	  this("Hello");
	  System.out.println("inside the zero argument constructor Stud2()");
  }
  //string argument
  public Stud2(String s) {
	  this(10);
	  System.out.println("inside one(string) argument consrtuctor Stud2(String s)");
	  
  }
  
  //integer argument
public Stud2(int i) {
	  this(10.55f);
	  System.out.println("inside one(int) argument constructor Stud2(int i)");
  }

//float argument
public Stud2(float f) {
	  System.out.println("inside one(float) argument constructor Stud2(float f)");
}

public static void main(String[] args) {
	 new Stud2();
}
}
