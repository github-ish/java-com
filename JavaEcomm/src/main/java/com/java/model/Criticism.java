package com.java.model;

public class Criticism {
	
	private int id;
	private String description;
	private String authorReply;
	private Reviews review;
	public Reviews getReview() {
		return review;
	}
	public void setReview(Reviews review) {
		this.review = review;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthorReply() {
		return authorReply;
	}
	public void setAuthorReply(String authorReply) {
		this.authorReply = authorReply;
	}
	
	

}
