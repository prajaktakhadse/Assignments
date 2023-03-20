package com.que3;

import java.util.ArrayList;

public class PlayList {
   ArrayList<Song> s1 = new ArrayList<>();
   
   
    void addSong(Song song) {
	   boolean flag = true;
	   for(Song s:s1) {
		   if(s.songName.equals(song.songName) && (s.movieName.equals(song.movieName))) {
			   flag = false;
		   }
	   }
	   if(flag) {
		   s1.add(song);
			System.out.println("Song added to the playlist successfully.");
		 
	   }
	   else {
		   System.out.println("Song is already added to the playlist");
	   }
   }
}
