package com.masai;
import java.util.Scanner;
public class Main {
     public static Employee getEmployeeDetails(){
    	 Employee emp1 = new Employee();
    	 Scanner scanner = new Scanner(System.in);
    
    	 System.out.println("Enter EmployeeId:-");
    	 int Id = scanner.nextInt();
    	 
    	 System.out.println("Enter EmployeeName:-");
    	 String Name = scanner.next();
    	 
    	 System.out.println("Enter Salary:-");
    	 double salary = scanner.nextDouble();
    	 
    	 System.out.println("Enter PFpercentage:-");
    	 int pf = scanner.nextInt();
    	
    	  int S = Main.getPFPercentage(pf);
    	  emp1.setEmployeeId(Id);
    	  emp1.setEmployeeName(Name);
    	  emp1.setSalary(salary);
    	  emp1.calculateNetSalary(S);
    	 
    	
    	 
    	  scanner.close();
    	  return emp1;
     }                              
     
     public static int getPFPercentage(int S) {
    	 return S;
     }
     
     public static void main(String[] args) {
		Employee emp2 = Main.getEmployeeDetails();
		
		System.out.println("Employee Id:-"+emp2.getEmployeeId());
		System.out.println("Employee Name:-"+emp2.getEmployeeName());
		System.out.println("Employee  Salary:-"+emp2.getSalary());
		System.out.println("Employee NetSalary:-"+emp2.getNetSalary());
	}
}
