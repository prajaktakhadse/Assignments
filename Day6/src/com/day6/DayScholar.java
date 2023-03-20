package com.day6;

public class DayScholar extends  Student {
	
	//create object
	Student s1 = new Student();
   double transportFee = 20000;
   
   
   //constructor
   
   DayScholar(){
   
   }
   
   public DayScholar(Student s1,double transportFee) {
   
		super();
		this.transportFee = transportFee;
	}

   
   //getter n setter
public double getTransportFee() {
	return transportFee;
}

public void setTransportFee(double transportFee) {
	this.transportFee = transportFee;
}

//override
@Override
void displayDetails() {
	System.out.println("Student ID:-"+studId);
	System.out.println("Student Name:-"+studName);
	System.out.println("Exam Fee:-"+ examFee);
	System.out.println("Transport Fee:-"+ transportFee);
	
}

@Override
double payFee(double fee) {
	return (getTransportFee()-fee);
}
   
   
   
  
}
