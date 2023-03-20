//Assume you have access to an integer variable called dayOfTheWeek and
//a boolean variable called holiday, which is true when it is a holiday and false on normal
//days. Write Java code that prints "Wake up at 7:00" on weekdays that are not holidays, 
//and prints "Sleep in!" on weekends and holidays. For the variable dayOfTheWeek, use this
//key:1 = Monday 2 = Tuesday 3 = Wednesday 4 = Thursday 5 = Friday 6 = Saturday 7 = Sunday

package com.week;

public class Holiday {
    public static void main(String[] args) {
    	int dayOfTheWeek = 6;
		boolean holiday =false;
		weekend(dayOfTheWeek,holiday);
		
    }
    static void weekend( int dayOfTheWeek , boolean holiday ) {
    	//if(dayOfTheWeek==1||dayOfTheWeek==2||dayOfTheWeek==3||dayOfTheWeek==4||dayOfTheWeek==5||dayOfTheWeek==6||dayOfTheWeek==7||holiday==true||holiday==false) {
    	if(dayOfTheWeek==1 && holiday== true) {
    		System.out.println("Wake up at 7:00");
    	}
    	else if(dayOfTheWeek==2 && dayOfTheWeek==1) {
    		System.out.println("Wake up at 7:00");
    	}
    	else if(dayOfTheWeek==3 && holiday== true) {
    		System.out.println("Wake up at 7:00");
    	}
    	else if(dayOfTheWeek==4 && holiday== true) {
    		System.out.println("Wake up at 7:00");
    	}
    	else if(dayOfTheWeek==5 && holiday== true) {
    		System.out.println("Wake up at 7:00");
    	}
    	else if(dayOfTheWeek==6 && holiday== true) {
    		System.out.println("Wake up at 7:00");
    	}
    	else if(dayOfTheWeek==7 && holiday== true) {
    		System.out.println("Wake up at 7:00");
    	}
  //}
    	else {
    		System.out.println("Sleep in!");
    	}
    	
    }
}
