package com.day15;

import java.io.Serializable;

public class Student implements Serializable{
    private int roll;
    private String name;
    private Address address = new Address("Maharashtra","Nagpur","440002");
    private String email;
    private transient String password;
    
    
    public Student() {
    	
    }




	public Student(int roll, String name, String email, String password) {
		super();
		this.roll = roll;
		this.name = name;
		//this.address = address;
		this.email = email;
		this.password = password;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}

	
	public String getName() {
			return name;
		}


    public void setName(String name) {
			this.name = name;
		}
    

//	public Address getAddress() {
//		return address;
//	}
//
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//    
	

	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Student Details:"+"\n"+"--------------------"+"\n"+"Student roll no : "+ getRoll() +"\n"+
	"Student Name: "+ getName() + "\n" +"Student Address: "+ address.getState()+" "+address.getCity()+
	" "+address.getPincode()+"\n" + "Student email: "+getEmail()+"\n" +"Student Pass: " + getPassword();
	}
    
    
}
