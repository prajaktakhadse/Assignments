package com.que3;

public class ScienceStudent extends Student{
	int physhicMarks;
	int chemistryMarks;
	int mathMarks;
    static int noOfStudents;

	public ScienceStudent(String name, String address, int physhicMarks, int chemistryMarks, int mathMarks) {
	  super(name,address);
		this.physhicMarks = physhicMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}
	

	@Override
	void getPercentage() {
		// TODO Auto-generated method stub
    int total = ((physhicMarks +  chemistryMarks +  mathMarks)/300)*100;
		System.out.println(total);
	}
	

	
}
