package com.que3;

import java.util.Scanner;

public class AllStudents {
      
    public static void main(String[] args) {
    	
    	int count = 0;
    	Scanner sc = new Scanner(System.in);
   
    	System.out.println("ScienceStudents:---");
    	
    	System.out.println("Student1 Details : --");
    	
    	System.out.println("Enter the name:");
    	String n = sc.nextLine();
    	
    	System.out.println("Enter the Address:-");
    	String ad = sc.nextLine();
    	
    	System.out.println("Enter Physics Marks: ");
    	int pm = sc.nextInt();
    	
    	System.out.println("Enter Chemistry Marks:");
    	int cm =  sc.nextInt();
    	
    	System.out.println("Enter Maths Marks: ");
    	int mm = sc.nextInt();
    	
    	ScienceStudent.noOfStudents++;
    	ScienceStudent ss = new ScienceStudent(n, ad, pm, cm, mm);
     
    	System.out.println("**********************************");
     
     System.out.println("Student2 Details : --");
 	
 	System.out.println("Enter the name:");
 	String n2 = sc.nextLine();
 	
 	System.out.println("Enter the Address:-");
 	String ad2 = sc.nextLine();
 	
 	System.out.println("Enter Physics Marks: ");
 	int pm2 = sc.nextInt();
 	
 	System.out.println("Enter Chemistry Marks:");
 	int cm2 =  sc.nextInt();
 	
 	System.out.println("Enter Maths Marks: ");
 	int mm2 = sc.nextInt();
 	
 	ScienceStudent.noOfStudents++;
 	ScienceStudent ss2 = new ScienceStudent(n2, ad2, pm2, cm2, mm2);
 
 	System.out.println("**********************************");
 	
 	System.out.println("SCIENCESTUDENT PERCENTAGE:--");
 	ss.getPercentage();
 	ss2.getPercentage();
 	
 	System.out.println("Total No of Sci.Student:"+count);
 	sc.close();
    }
}
