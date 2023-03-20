package com.D1Q3;

public class CricketScore {

   public static void score(int x,int y ,int z ,int a ,int b) {
	  int sum = (1* x)+(2*y)+(3*z)+(2*a)+(3*b);
	  System.out.println(sum);
   }
   public static void main(String[] args) {
	int x = 1;
	int y =2 ;
	int z = 3;
	int a = 4;
	int b = 6;
    score(x,y,z,a,b);
}
}
