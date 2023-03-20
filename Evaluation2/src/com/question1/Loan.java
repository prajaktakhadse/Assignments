package com.question1;

public class Loan  {
	double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof PermanentEmployee) {
			PermanentEmployee perm = new PermanentEmployee();
			String per = "perm";
			perm.calculateSalary(per);
		}
		else if(employeeObj instanceof TemporaryEmployee) {
			String per = "prem";
			TemporaryEmployee perm = new TemporaryEmployee();
			perm.calculateSalary(per);
		}
	
	return 0.0;
}
}