package com.coupling;

public class Circle implements Shapes{

	public void draw() {
		System.out.println("You have drawn a Circle");
	}

	@Override
	public void call_shapes() {
		// TODO Auto-generated method stub
		draw();
	}

	
	
	
}
