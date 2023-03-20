package com.que1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {
	public String addMobile(String company, String model) {
		   
		return model;
		//this method will take a string as a company name and its model as an //argument.
		//ex: "apple", "Iphone13"
		//add the company as key and its model as an element of ArrayList in the above //mobiles HashMap.
		//if the company name already exists then their model should be added to the //existing list.
		//This method should return a message "Mobile added successfully" after //adding a mobile.
		}
		public List<String> getModels(String company)throws InvlidMobileException{
		//This method return the list of all the models of the supplied company
		//if we supply any invalid company name then it should throw a checked exception
		}
		
		
	public static void main(String[] args) {
   
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	List<String> uList = new ArrayList<String>();
	uList.add("Iphone13");
	mobiles.put("apple",(ArrayList<String>) uList); 
	
	}

}
