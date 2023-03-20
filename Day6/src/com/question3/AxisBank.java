package com.question3;

public class AxisBank extends Bank{
	double rateOfInterest;
//	
//    public AxisBank() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	

	

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	
	@Override
	void displayDetails() {
		 System.out.println("BranchName:"+branchName);
		 System.out.println("IFSCCode:"+ifscCode);
		 System.out.println("RateOfInterest:-"+rateOfInterest);
	}
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
	


}
