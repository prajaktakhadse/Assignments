package com.revision2.q4;

public class OLA {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger <= 3) {
			HatchBack hb = new HatchBack();
			hb.setNumberOfKms(numberOfKMs);
			hb.setNumberOfPassenger(numberOfPassenger);
			return hb;
		}
		else {
			Sedan sd = new Sedan();
			sd.setNumberOfKms(numberOfKMs);
			sd.setNumberOfPassenger(numberOfPassenger);
			return sd;
		}
	}
	public int calculateBill(Car car) {
		int fare = 0 ;
		if(car instanceof HatchBack) {
			HatchBack hb = new HatchBack();
			fare =  car.getNumberOfKms()*hb.getFarePerKm();
			
		}
		else if(car instanceof Sedan) {
			Sedan sd = new Sedan();
			fare = car.getNumberOfKms()*sd.getFarePerKm();
		}
		return fare;
		
		
	}
}
