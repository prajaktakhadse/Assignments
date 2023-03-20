package com.question4;
import java.util.Scanner;


public class Demo{
   
  	 public static void main(String[] args){
  	
   	 Scanner sc = new Scanner(System.in);
         System.out.println("Enter No. of Students :-");
         int nos = sc.nextInt();
       
          System.out.println("*******************************************");
        
         Student[] stud = new Student[nos];
          
         for(int i = 0; i < nos ; i++){
               Student sb = new Student();
                
                 System.out.println("Serial No. of Students :-" +(i+1));
                 System.out.println("Enter Roll no.:-");
                 Integer roll = sc.nextInt();
                 sb.setRoll(roll);


                 System.out.println("Enter Name.:-");
                 String name = sc.next();
                 sb.setName(name);


                 System.out.println("Enter Address:-");
                 String address = sc.next();
                 sb.setAddress(address);

                 System.out.println("Enter Marks:-");
                 Integer marks = sc.nextInt();
                 sb.setMarks(marks);
                
                 System.out.println("*******************************************");
                 
                 stud[i] = sb ;
            }

         int sum = 0;
         for(Student stu : stud){
              
                System.out.println("Roll No.:-" + stu.getRoll() );
                System.out.println("Name:-" + stu.getName() );
                System.out.println("Address:-" + stu.getAddress() );
                System.out.println("Marks:-" + stu.getMarks() );
                System.out.println("*******************************************");
                 sum += stu.getMarks();
              }
              
               System.out.println("Average of students Marks:-" + sum/nos );
               sc.close();
   } 
   
	}
   
   

  
   
   

