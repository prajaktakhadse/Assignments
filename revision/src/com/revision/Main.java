package com.revision;

import java.util.Scanner;
public class Main{

   public static void main(String[] args){
  	 Scanner sc = new Scanner(System.in) ;
         Car c = new Car() ;
         Engine engine = new Engine();
         
        System.out.println("Car Model :")   ;
        String model =  sc.next(); 
        c.setModel(model);

        System.out.println("Car companyName :");   
        String companyName =  sc.next(); 
        c.setCompanyName( companyName);


        System.out.println("Car color :")  ; 
        String color =  sc.next(); 
        c.setColor(color);



        System.out.println("Car RPM :")   ;
        Integer  power  =  sc.nextInt(); 
        engine.setPower(power);
        c.setEngine(engine);
        

       System.out.println(" Car Engine Manufacture :");
       String  EngineManufacture = sc.next() ;
       engine.setManufacturer(EngineManufacture);
       c.setEngine(engine);
       
       System.out.println("HasTurbo :");
       Boolean  HasTurbo = sc.hasNext() ;
       engine.setHasTurbo(HasTurbo);
       c.setEngine(engine);
   

      System.out.println("*********************************************************");
      System.out.println("Car Model :"+c.getModel());
      System.out.println("Car companyName :"+c.getCompanyName());
      System.out.println("Car color :"+c.getColor());
      System.out.println("Car RPM :"+c.getEngine().getPower());
      System.out.println(" Car Engine Manufacture :"+c.getEngine().getManufacturer());
      System.out.println("HasTurbo :"+c.getEngine().getHasTurbo());
      System.out.println("*********************************************************");
 
   }
}

