package com.revision6.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class Main {
   public static void main(String[] args) {
	 
	   HashMap<String , Student>  hashmapSort = new HashMap<>();
	   
	   hashmapSort.put("Maharashtra" , new Student(1 , "Alice ",230));
       hashmapSort.put("TamilNadu" , new Student(2 , "Shivam ",650));
       hashmapSort.put("Bihar" , new Student(15, "Tina ",930));
       hashmapSort.put("Chennai" , new Student(3, "Rina ",850));
       hashmapSort.put("USA" , new Student(96 , "Riya",700));
  
       //Add value in list
       ArrayList< Student> sortStudent = new ArrayList<>();
       
       //get the value
	   for(Map.Entry<String,Student> entry : hashmapSort.entrySet()) {
		   sortStudent.add(entry.getValue());
	   }
	   
	   //Sort Student
	   Collections.sort(sortStudent, new compareStudent());
	   
	   //put sorted student and string in linkedhashmap
	   LinkedHashMap<String , Student> linkedstu = new LinkedHashMap<>();
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
}
