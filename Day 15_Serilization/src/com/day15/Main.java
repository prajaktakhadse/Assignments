package com.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	   public static void main(String[] args) throws Exception{
		   //1. Create an object of the Student class with all the details.
		   Student stud =  new Student(21,"stud1", "stud1@masaischool.com","123456");
		   
		   
		   //2. Serialize the Student object inside a file called "student.txt" in the current location.
		  // Note:- make sure while serializing don't serialize the password field
		   
		   //******Serialize***********
		   FileOutputStream fout = new FileOutputStream("stud.txt");
		   ObjectOutputStream oos = new ObjectOutputStream(fout);
		   
		   oos.writeObject(stud);
           oos.flush();
           oos.close();
           //System.out.println("done.....");
           
           //******DeSerialize***********
         try(ObjectInputStream obj = new ObjectInputStream(new FileInputStream("stud.txt"))){
        	 Student stud2 =  (Student) obj.readObject() ;
        	 System.out.println(stud2);
         }catch(Exception e) {
        	 System.out.println("process incomplete........");
         }
         
           
		}
}
