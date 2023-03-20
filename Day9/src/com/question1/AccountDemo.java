package com.question1;

import java.util.Scanner;

public class AccountDemo {
     public static void main(String[] args) {
		Account  ac =  new Account();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Number");
		String accNum = sc.nextLine();
		
		ac.setAccountNumber(accNum);
		
		System.out.println("Enter amount to deposit");
		double dep =  sc.nextInt();
		ac.deposit(dep);
		
		
		try {
			System.out.println("Enter amount to withdraw");
			double vdrw = sc.nextInt();
			ac.withdraw(vdrw);
			
			System.out.println("________________________");
			System.out.println("Withdrawl Successful");
			System.out.println("Total balance after withdrawl : "+ ac.getBalance());
		
			
		
	   }catch(InsufficientFundsException e){
		    System.out.println(" ");
		    System.out.println(e.getMessage());
	   }
		sc.close();
	}
}