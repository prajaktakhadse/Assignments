package com.question1;

public class Demo {
    public Hotel provideFood(int amount) {
    	//take the variable and initialize with the value
    	Hotel hotel = null;
    	
    	
    	if(amount>200 &&  amount<1000){
    		hotel  = new RoadSide();
    	}
    	else if(amount>1000){
    		hotel = new TajHotel();
    	}else {
    		return null;
    	}
    	
		return hotel;
		
    	
    }
    public static void main(String[] args) {
		Demo d1 = new Demo();
		Hotel hotel = d1.provideFood(0);
		if(hotel!=null) {
			hotel.chickenBiryani();
			hotel.masalaDosa();
		}
		else {
			System.out.println("Please enter the valid amount");
		}
	}
}
