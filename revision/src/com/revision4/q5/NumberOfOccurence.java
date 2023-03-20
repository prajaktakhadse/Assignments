package com.revision4.q5;

import java.util.Scanner;

public class NumberOfOccurence {
    public static void javaOccurence(String s) {
    	String[] str = s.split(" ");
    	int count = 0 ;
    	for(int  i = 0 ; i<str.length ;i++) {
    		if(str[i].equalsIgnoreCase("Java")) {
    			count++ ; 
    			System.out.println(count + "---" + i + "---" + "Java");
    		}
    	}
    	System.out.println("No. of occurence: " + count);
    }
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the text:-");
		String para = sc.nextLine();
		
	    NumberOfOccurence.javaOccurence(para);
	    
		sc.close();
	}
}
