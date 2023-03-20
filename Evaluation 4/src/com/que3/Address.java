package com.que3;

import java.io.Serializable;

public class Address implements Serializable{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String state;
	  private String city;
	  private String pincode; 
	  
  public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


  
public Address(String state, String city, String pincode) {
	super();
	this.state = state;
	this.city = city;
	this.pincode = pincode;
}
  
  

}
