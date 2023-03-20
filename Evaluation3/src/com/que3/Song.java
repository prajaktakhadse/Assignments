//1. Create a Java class Song with the following members:
//movieName: String
//songName: String
//Inside this class define another method as :
//play():void
//This play() method should print:
//songName+" of "+movieName+" is playing...!"
//2. Create another class PlayList, In this class define a List of Song
//and inside this PlayList class define a method as:
//addSong(Song song):void
//Evaluation C3: 6
//This addSong method will take a Song object and add the Song object to
//the
//above
//List (songs) and print: "Song added to the playlist successfully."
//If the user tries to add any duplicate song (if movieName and songName is
//same)to the list of songs then it should
//print:
//“Song is already added to the playlist”
//3. Create a Main class with the main method and do the following task inside
//the main
//method.
//a. Create 4 song objects by taking details from the user.
//b. Create an object of the Playlist class and add all the 4 Song objects into
//the List of Song of PlayList object by calling addSong method.
//c. Get all the songs one by one from the list of PlayList object and call the
//play()
//method on each Song object.


package com.que3;

public class Song {
   String movieName;
   String songName;
   
   void play() {
	   System.out.println(songName+"of"+movieName+"is playing...!");
   }

   public Song(String movieName, String songName) {
		super();
		this.movieName = movieName;
		this.songName = songName;
	}

   
}
