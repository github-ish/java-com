package com.java.model;
import java.util.*;

public class Author extends User {

	public Author(String name, String pass) {
		//super(name, pass);
		// TODO Auto-generated constructor stub
	}
	private String fristName;
	private String secondName;
	
	private String affiliation;
	

	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getAffiliation() {
		return affiliation;
	}
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}
	
	
	
	
}

