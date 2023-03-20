package com.Question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext1.xml");
		
		Hello obj = ctx.getBean("cd",Hello.class);
		
		obj.fun();
		
		ClassPathXmlApplicationContext ctx2= (ClassPathXmlApplicationContext)ctx;

		 ctx2.close();
		
	}

}
