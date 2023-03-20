package com.que2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
      public static void main(String[] args) {
		LinkedHashMap<String , String > states = new LinkedHashMap<>();
		states.put("Goa"        ,"Panji");
		states.put("Assam"      ,"Dispur");
		states.put("Bihar"      ,"Patna");
		states.put("Jharkhand"  ,"Ranchi");
		states.put("Maharashtra","Mumbai");
		
		for(Map.Entry<String, String> me : states.entrySet()) {
			System.out.println(me.getKey()+":"+me.getValue()+"\n");
		}
		
	}
      
}
