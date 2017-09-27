package com.thehit.domain;

import com.thehit.interfaces.Songwriter;

public class SongWriterImpl extends Person implements Songwriter {
	

	private Song song;
	
	public SongWriterImpl(){
		super();
		System.out.println("We are here in the blank constructor of SongWriterImpl");
		}
	
	public SongWriterImpl(String firstname, String lastname, int age, Song song) {		
		super(firstname, lastname, age);		
		this.song = song;
		
		System.out.println("fistname: "+ firstname +" lastname: "+ lastname +" this.age: " + age
				+" song name: "+ song.getName() + " song lyrics: "+ song.getLyrics());
	}
	
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	
	//implementing SongWriter interface method
	@Override
	public void compose(Song song){
		System.out.println("Composer " + this.getFirstname() + "" + this.getLastname() + " composed a song called " + song.getName() + ". This song has the following lyrics "+ song.getLyrics());
	}
}