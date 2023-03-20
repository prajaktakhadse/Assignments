//** create a HashMap as **
//
//key : String (Indian-state name)
//value : Student (student object with the proper details)
//Sort this HashMap according to their value (according to 
//		the Student marks) and print the state name and the corresponding student details in sorted order.


package com.que1;



import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
     public static void main(String[] args) { 
    	        //key , values
		HashMap<String,Student> stu = new HashMap<>();
		
		stu.put("Maharashtra", new Student(10 ,"stu1",960));
		stu.put("Chennai"    , new Student(20 ,"stu2",900));
		stu.put("Mumbai"     , new Student(12 ,"stu3",890));
		stu.put("Harayana"   , new Student(16 ,"stu4",660));
		stu.put("Bihar"      , new Student(18 ,"stu5",500));
		
		//System.out.println(stu);
		
		
		List<Map.Entry<String,Student>> student = new ArrayList<>(stu.entrySet());

		Collections.sort(student,(s1,s2)->{
			if(s1.getValue().getMarks() > s2.getValue().getMarks()) {
				return 1;
			}
			return -1;
		});
		
		
		Map<String,Student> sortL = new LinkedHashMap<>();
			student.forEach((s)->{
				sortL.put(s.getKey(),s.getValue());
			});

			System.out.println(sortL);
		}
		
		
		
	}

