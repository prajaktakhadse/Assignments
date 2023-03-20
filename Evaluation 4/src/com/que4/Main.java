package com.que4;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		List<Student> stu = new ArrayList<>();
		stu.add(new Student(12,"Ayan",600));
		stu.add(new Student(13,"Riyan",700));
		stu.add(new Student(14,"Pari",800));
		stu.add(new Student(15,"purvi",500));
		stu.add(new Student(16,"Darsh",400));
		
		Collections.sort(stu,(a,b)->{
            return a.getMarks() > b.getMarks() ? 1 : -1;
        });
        stu.stream().forEach(stud->{
            int empId = stud.getRoll();
            int empSalary = 1000*stud.getMarks();
            String empName = stud.getName();
            System.out.println("Employee Name : "+empName);
            System.out.println("Employee Id : "+ empId);
            System.out.println("Employee Salary : " + empSalary);
            System.out.println("------------------------------------");
        });
		
	}
}
