//Q1. Create a spring project named Drawshapes with which we are able to draw different geometrical shapes.
//Having classes triangle,circle,cylinder,etc. With a common function draw() in each of them which will print 
//(“You have drawn Triangle”) or YOUR_SHAPE.
//
//Make the main Runner class(main class) from which we can draw any shape we want to by keeping the classes
//loosely coupled. And you have to configure spring IOC for dependency injection. Also choose the 
//appropriate type of Dependency injection to use from Setter injection, constructor injection.



package com.coupling;

public class Triangle implements Shapes{
        
	
	public void draw() {
		System.out.println("You have drawn a Triangle");
	}
   
	@Override
	public void call_shapes() {
		// TODO Auto-generated method stub
		draw();
	}

	
}
