//Create a Java Bean class Student with the following fields :
//roll: Integer
//name: String
//age: Integer
//marks: Integer
//Make ensure that encapsulation is maintained.
//Make validation checks before setting the age and marks of the Student (i.e. are they in
//the valid range,18<age<60, 0<marks<500).
//Inside a Separate class main method, Create 2 objects of the Student class one by
//using the zero-argument constructor and the second by using the parameterized
//constructor.
//Print the details of both the Student objects.


package com.Day4;

public class JavaBean {

	private int roll;
	private String name;
	private int age;
	private int marks;
	
	

	//zero argument instructor
	
	public JavaBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	//to print zero argument output
	public void showDetails() {
		if(age>18 &&age<60&& marks<500&&marks>0) {
			System.out.println("Name:-"+ name);
			System.out.println("Roll :-"+ roll);
			System.out.println("Age:-"+ age);
			System.out.println("Marks:-"+ marks);
		}
		else {
			System.out.println("inavlid crendentials");
		}
	}
	
	//overloaded parameterized instructor
		public JavaBean(String name,int roll,  int age, int marks) {
			super();
			if(age>18 &&age<60&& marks<500&&marks>0) {
			this.roll = roll;
			this.name = name;
			this.age = age;
			this.marks = marks;
			}
			else {
				System.out.println("inavlid crendentials");
			}
		}
	
	//main class to call
	public static void main(String[] args) {
		//zero arguments
		JavaBean s1 = new JavaBean();
		
		s1.setName("Ansh");
		s1.setRoll(121);
		s1.setAge(19);
		s1.setMarks(100);
		//call the output fun.
		System.out.println("Student1 Details:--");
		s1.showDetails();
		
		
		System.out.println("-----------");
		
		System.out.println("Student2 Details:---");
		//parameterized constructor ...output by getter setter method....
		JavaBean s2 = new JavaBean("Riyan",122,17,500);
	      
		String str = s2.getName();
		if(str!= null) {
		System.out.println("Name:-"+s2.getName());
		System.out.println("Roll:-"+s2.getRoll());
		System.out.println("Age:-"+s2.getAge());
		System.out.println("Marks:-"+s2.getMarks());
		}
	}
	
}
