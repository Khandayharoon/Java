package com.numbers;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//class  respresnt the song
class Song{
	private static int idCounter = 0;
	private int id;
	private String name;
	private String song;
	private String duration;
	
	Song (String name , String song , String duration){
		this.id = idCounter++;
		this.name = name;
		this.setSong(song);
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	 public String toString() {
	        return "Song{id=" + id + ", name='" + name + "', singer='" + song + "', duration='" + duration + "'}";
	    }

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}
	
}

//playList class to Manage the PlayList
class PlayList{
	private String name;
	private List<Song> songs;

	
	PlayList (String name){
			this.name = name ;
			this.songs = new ArrayList<>();
		}
		
		public  void addSong(String name , String song , String duration) {
			songs.add(new Song(name,song,duration));
		}
		
		public void removeSong (int id) {
			songs.removeIf(song -> song.getId() == id);
		}
		
		public void shuffleSongs() {
			Collections.shuffle(songs);
		}
		
		public void repeat() {
	        if (!songs.isEmpty()) {
	            songs.add(songs.get(0));
	        }
		}
	        
	        public String toString() {
	            return "PlayList{name='" + name + "', songs=" + songs + "}";
	        }    
}
	

public class music {

	public static void main(String[] args) {
		
		PlayList myPlaylist = new PlayList("My Favorite Songs");
		
		myPlaylist.addSong("hk", "dil", "4.30");
		 myPlaylist.addSong("Song1", "Singer1", "3:30");
	        myPlaylist.addSong("Song2", "Singer2", "4:00");

	        // Printing the playlist before removal
	        System.out.println("Playlist before removal:");
	        System.out.println(myPlaylist);

	        // Removing a song by ID
	        myPlaylist.removeSong(1);

	        // Printing the playlist after removal
	        System.out.println("Playlist after removal:");
	        System.out.println(myPlaylist);

	        // Shuffling the playlist
	        myPlaylist.shuffleSongs();

	        // Repeating the first song
	        myPlaylist.repeat();

	        // Printing the playlist after shuffle and repeat
	        System.out.println("Playlist after shuffle and repeat:");
	        System.out.println(myPlaylist);
	        
	      
	}

}
