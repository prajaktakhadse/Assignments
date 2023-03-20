package com.revision2;

public class Person {
     private String gender;
     private String name;
     private Address address;
     
     
     
     
	public Person(String gender, String name, Address address) {
		super();
		this.gender = gender;
		this.name = name;
		this.setAddress(address);
	}





	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}





	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
     
	
	
     
}
