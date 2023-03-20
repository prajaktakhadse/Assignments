package com.coupling;

public class Cylinder implements Shapes{
   
	public void draw() {
		System.out.println("You have drawn a Cylinder");
	}
  
	@Override
	public void call_shapes() {
		// TODO Auto-generated method stub
		draw();
	}

}
