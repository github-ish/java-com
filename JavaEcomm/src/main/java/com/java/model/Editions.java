package com.java.model;

import java.util.Date;



public class Editions {
	
	private int id;
	private int editionNumber;
	private Date editionDate;
	private Volumes volume;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEditionNumber() {
		return editionNumber;
	}
	public void setEditionNumber(int editionNumber) {
		this.editionNumber = editionNumber;
	}
	public Date getEditionDate() {
		return editionDate;
	}
	public void setEditionDate(Date editionDate) {
		this.editionDate = editionDate;
	}
	public Volumes getVolume() {
		return volume;
	}
	public void setVolume(Volumes volume) {
		this.volume = volume;
	}

}