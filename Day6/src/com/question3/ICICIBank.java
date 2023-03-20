package com.question3;

public class ICICIBank extends Bank{
     double rateOfInterest;
     
 	@Override
 	void displayDetails() {
 		 System.out.println("BranchName:-"+branchName);
 		 System.out.println("IFSCCode:-"+ifscCode);
 		 System.out.println("RateOfInterest:-"+rateOfInterest);
 	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}



//	public ICICIBank() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	
 	
     
}
