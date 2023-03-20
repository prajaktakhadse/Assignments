package com.question3;

public class Bank {
   String branchName;
   String ifscCode;
   
   void displayDetails() {
	   System.out.println("BranchName:"+branchName);
	   System.out.println("IFSCCode:"+ifscCode);
   }
   
   //constructor
   public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

   public Bank(String branchName, String ifscCode) {
	super();
	this.branchName = branchName;
	this.ifscCode = ifscCode;
}

//getter n setter methods
public String getBranchName() {
	return branchName;
}

public void setBranchName(String branchName) {
	this.branchName = branchName;
}

public String getIfscCode() {
	return ifscCode;
}

public void setIfscCode(String ifscCode) {
	this.ifscCode = ifscCode;
}
}
