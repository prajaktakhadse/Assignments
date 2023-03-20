package com.question2;

import java.util.Scanner;

public class Main extends  Hosteller{
	
   

	public static Hosteller getHostellerDetails() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Details:");
    	
    	
    	Hosteller host = new Hosteller();
    	
    	System.out.println("Student Id:");
    	int id = sc.nextInt() ;
    	host.setStudentId(id);
    	 
    	System.out.println("Student Name:");
    	String n = sc.next();
    	host.setName(n);
    	
    	System.out.println("Department id:");
    	int dep = sc.nextInt();
    	host.setDepartmentId(dep);

    	System.out.println("Gender:");
    	String gen = sc.next();
    	host.setGender(gen);
    	
    	System.out.println("Phone Number:");
    	String cell = sc.next();
    	host.setPhone(cell);
    	
    	System.out.println("Hostel Name:");
    	String hname = sc.next();
    	host.setHostelName(hname);
    	
    	System.out.println("Room Number");
    	int rnum = sc.nextInt();
    	host.setRoomNumber(rnum);
    	
    	System.out.println("Modify Room Number(Y/N");
    	String change1 = sc.next();
    	if(change1.equals("Y")) {
    		System.out.println("New Room Number");
    		int newr = sc.nextInt();
    		host.setRoomNumber(newr);
    	}
    	
    	System.out.println("Modify Phone Number");
    	String change2 = sc.next();
    	if(change2.equals("Y")) {
    		System.out.println("New Phone Number");
    		String phone = sc.next();
    		host.setPhone(phone);
    	}
    	

    	sc.close();
			return host;
			
	}
	
		public static void main(String[] args) {
			Hosteller host =  getHostellerDetails();
			
			
			System.out.println("Output:--");
			
			System.out.println("Enter the Details: "+host.getStudentId()+
					" "+host.getName()+" "+host.getDepartmentId()+" "+
					host.getGender()+" "+host.getPhone()+" "+host.getHostelName()+
					" "+host.getRoomNumber());
			
		}

}
