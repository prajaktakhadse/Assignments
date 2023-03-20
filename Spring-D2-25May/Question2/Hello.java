package com.Question2;

public class Hello {
	
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void fun() {
		System.out.println("HEllo Pan-Gendi");
	}

	public void start() {
		System.out.println("object with is initialised");
	}
	
	public void end() {
		System.out.println("object is destroyed");
	}

}
