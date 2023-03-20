package com.que3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void main(String[] args) throws Exception  {
		
	
	//Create an object of the Employee class with all the details.
     Employee e1 =  new Employee(22,"emp1","emp1@masaischool.com","123456");
  

  
     
    //2. Serialize the Employee object inside a file called "emp.txt" in the current location.
     //Note:- make sure while serializing don't serialize the password field
     
     FileOutputStream f = new FileOutputStream("emp.txt");
     ObjectOutputStream out = new ObjectOutputStream(f);
     
     out.writeObject(e1);
     out.flush();
     out.close();
     //System.out.println("done....");
     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.txt"))) {
		Employee e2 = (Employee)ois.readObject();
		 System.out.println(e2);
	}
  
	}  
}

