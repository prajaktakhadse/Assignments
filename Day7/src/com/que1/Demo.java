package com.que1;

public class Demo {
	public Animal[] getAnimals() {
		 
	 Animal[] ani= {new Dog(), new Cat(), new Tiger()};
		
		return ani;
		
	}
	public static void main(String[] args) {
		
		Demo  d1 =new Demo();
		Animal[] ani = d1.getAnimals();
		System.out.println("---Dog---");
		Animal obj = new Dog();
		obj.eat();
		obj.walk();
		obj.makeNoise();
		((Dog) ani[0]).handShake();
		
		
		System.out.println("  ");
		System.out.println("---Cat---");
		Animal obj1 = new Cat();
		obj1.eat();
		obj1.walk();
		obj1.makeNoise();
		
		System.out.println("  ");
		
		System.out.println("---Tiger---");
     
		Animal obj3 = new Tiger();
		obj3.eat();
		obj3.walk();
		obj3.makeNoise();
		
		
		
	}

}
