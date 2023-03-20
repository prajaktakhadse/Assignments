package com.que3;

public class CommanThread implements Runnable{
	
	Common c;
	String name;
	
	public CommanThread(Common c, String name) {
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		c.fun1(name);
	}
}
