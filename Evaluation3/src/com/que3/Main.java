package com.que3;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	PlayList p1= new PlayList();
	
	System.out.println(" Enter songs name with their movie name:--");
	for(int i=1;i<=4;i++) {
		System.out.println("Enter song name " + i);
		String song = sc.next();
		

		System.out.println("Enter movie name " + i);
		String movie = sc.next();
		p1.addSong(new Song(song,movie));
	
	}
	for(Song s:p1.s1) {
		s.play();	
	}

	
sc.close();
}

 
}
