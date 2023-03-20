package com.revision4.q2;

public interface Z extends X ,Y{


	
	abstract void bike();

	@Override
	default void fun2() {
		// TODO Auto-generated method stub
		Y.super.fun2();
		System.out.println("default fun2() of  Y inside the Z interface ");
	}
}
