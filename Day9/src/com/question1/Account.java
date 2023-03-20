package com.question1;

public class Account {
  String accountNumber;
    double balance;
 
    public Account()
	{
		// Zero Argument constructor
	}
    
  public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public void deposit(double amount) {
	 balance += amount;
	 setBalance(balance);
    }
    
	double withdraw(double amount) throws InsufficientFundsException{

		if(amount>balance) {
			 InsufficientFundsException se = new InsufficientFundsException("Amount Entered is less  than availablel balance");
			throw se;
		}
		else {
			balance -= amount ;
			setBalance(balance);
			
		}
		return amount;
	}
}	
 

