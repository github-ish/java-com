package com.java.model;

public class Reviews {

	private int id;

	private String summary;
	private String judgType;
	private String satus;
	private String expertiseLevel;
	
	private String newContribution;
	
	private Article article;
	
	private Author reviewer;
	public Author getReviewer() {
		return reviewer;
	}
	public void setReviewer(Author reviewer) {
		this.reviewer = reviewer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getJudgType() {
		return judgType;
	}
	public void setJudgType(String judgType) {
		this.judgType = judgType;
	}
	public String getSatus() {
		return satus;
	}
	public void setSatus(String satus) {
		this.satus = satus;
	}
	public String getExpertiseLevel() {
		return expertiseLevel;
	}
	public void setExpertiseLevel(String expertiseLevel) {
		this.expertiseLevel = expertiseLevel;
	}
	public String getNewContribution() {
		return newContribution;
	}
	public void setNewContribution(String newContribution) {
		this.newContribution = newContribution;
	}
	
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	

}
