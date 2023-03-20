package com.question3;

import java.util.Scanner;

public class AccountDetails {
	public Account getAccountDetails() {
		Account ac =  new Account();//create obj
      Scanner sc = new Scanner(System.in);//take i/p
      
      System.out.println("Enter account id:-");
      int id = sc.nextInt();//define class
      ac.setAccountId(id);///set
      
      System.out.println("Enter account type:-");
      String type =sc.next();
      ac.setAccountType(type);
      
      System.out.println("Enter Balance:-");
      int bal = sc.nextInt();
     
      while(bal<=0) {
    	  //continue;
    	  System.out.println("Balance should be positive");
    	   System.out.println("Enter Balance:-");
           bal = sc.nextInt();
      }
      ac.setBalance(bal);
      
      
      int p = getWithdrawAmount();
      ac.withdraw(p);
      sc.close();
      return ac;//return obj
      
   }
	public int getWithdrawAmount(){
		Scanner sc1 = new Scanner(System.in);//take i/p
         System.out.println("Enter amount to be withdrawn:");
         int wd = sc1.nextInt();
         while(wd<=0) {//check the amount
        	 System.out.println("Balance should be positive");
        	 wd=sc1.nextInt();
         }
         sc1.close();
         return wd;
		}
	
	public static void main(String[] args) {
		AccountDetails get = new AccountDetails();//create the new obj of class name
		 get.getAccountDetails();

		
	}
}