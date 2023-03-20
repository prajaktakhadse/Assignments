package com.revision;

public class Engine{
    private int Power;
    private String manufacturer;
    private Boolean hasTurbo;
    
    
    public Engine() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Engine(int power, String manufacturer, Boolean hasTurbo) {
		super();
		Power = power;
		this.manufacturer = manufacturer;
		this.hasTurbo = hasTurbo;
	}
	
	
	
	public int getPower() {
		return Power;
	}
	public void setPower(int power) {
		Power = power;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Boolean getHasTurbo() {
		return hasTurbo;
	}
	public void setHasTurbo(Boolean hasTurbo) {
		this.hasTurbo = hasTurbo;
	}
    
    
}
