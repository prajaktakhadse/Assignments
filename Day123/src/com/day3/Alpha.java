//Write a java application with a non-static method that will accept a character (a-z or A-Z) and print if that character is vowel or consonant, if we supply other than (a-z or A-Z) then that method should print the error message.
//
//Call the above method from the main method of the same class 3 times,
//
//first time by supplying a vowel
//
//the second time by supplying a consonant
//
//third time by supplying an invalid character


package com.day3;

public class Alpha {
	char ch ;
	void Check(char ch) {
	    if(ch == 'a'||ch=='e' ||ch=='i'||ch == 'o'||ch=='u') {
	    	System.out.println("vowel");
	    }
	    else if(ch == 'b'||ch=='c' ||ch=='d'||ch == 'f'||ch=='g'||
	    		ch == 'h'||ch=='j' ||ch=='k'||ch == 'l'||ch=='m'||
	    		ch == 'n'||ch=='p' ||ch=='q'||ch == 'r'||ch=='s'||
	    		ch == 't'||ch=='v' ||ch=='w'||ch == 'x'||ch=='y'||
	    		ch == 'z'){
	    	System.out.println("consonant");
	    }
	    else {
	    	System.out.println("invalid character");
	    }
	 }
    public static void main(String[] args) {
       char ch = '.';
    	Alpha d1 = new Alpha();
	    d1.Check(ch);
	}
}
