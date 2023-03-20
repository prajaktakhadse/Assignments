package com.day6;

public class Hosteller extends Student{
   double hostelFee;

public double getHostelFee() {
	return hostelFee;
}

public void setHostelFee(double hostelFee) {
	this.hostelFee = hostelFee;
}

public Hosteller(double hostelFee) {
	super();
	this.hostelFee = hostelFee;
}

public Hosteller() {
	
	// TODO Auto-generated constructor stub
}
  @Override
  void displayDetails() {
		System.out.println("Student ID:-"+studId);
		System.out.println("Student ID:-"+studName);
		System.out.println("Exam Fee:-"+ examFee);
		System.out.println("Hostel Fee:-"+hostelFee);
		
	}

	@Override
	double payFee(double fee) {
		return (getHostelFee()-fee);
	}
	   
   
}
