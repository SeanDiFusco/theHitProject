package com.thehit.domain;

import com.thehit.interfaces.*;
import com.thehit.domain.Song;

public class SingerImpl extends Person implements Singer{
	
	private Song song;

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public SingerImpl(String firstname, String lastname, int age, Song song){
		super(firstname, lastname,age);
		this.song=song;		
	}
	
	public SingerImpl(){
		super();
	}
	
	//must finish implementation of interface method
	@Override
	public void perform(Song song) {
		// TODO Auto-generated method stub
		
	}
}
