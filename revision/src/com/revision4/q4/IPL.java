package com.revision4.q4;

import java.util.Scanner;

public class IPL {
   public void methodhomeTeamStadium(Stadium stad) {
	   switch(stad) {
	   case  EDEN_GARDENS_STADIUM :
		   System.out.println("This is the home ground of KKR");
		   break;
		   
	   case WANKHEDE_STADIUM :
		   System.out.println("This is the home ground of Mumbai Indians");
		   break;
		   
	   case CHIDAMBARAM_STADIUM:
		   System.out.println("This is the home ground of CSK");
		   break;
		   
//	   case M_CHINNASWAMY_STADIUM:
		  default:
		   System.out.println("This is the home ground of RCB");
		   break;
		   
	   }
	   
   }
   
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   IPL ms = new IPL();
	   
	   System.out.println("Enter the stadium:-");
	   String stad = sc.next();
	   try {
	        ms.methodhomeTeamStadium(Stadium.valueOf(stad) );
	   }
	   catch(Exception e){
		   System.out.println("Error Somewhere in Code....!!!");
	   }
	  sc.close(); 
   }
}
