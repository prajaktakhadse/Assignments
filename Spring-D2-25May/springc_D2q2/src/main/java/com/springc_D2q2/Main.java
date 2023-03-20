package com.springc_D2q2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
            
            Institute insti = ctx.getBean("insti",Institute.class);
            
            List<Students> list =  insti.getStudentlist();
            System.out.println("Students List:----");
            System.out.println("-------------");
            list.forEach(i ->{
            	
            	System.out.println(i);
            });
            
            System.out.println("************************************************");
            Cities C = ctx.getBean("city",Cities.class); 
            List<String> clist = C.getCities();
            System.out.println("City List:---");
            System.out.println("-------------");
            clist.forEach(i->{
            	
            	System.out.println(i);
            });
            
            ((ClassPathXmlApplicationContext)ctx).close();
            
	}

}
