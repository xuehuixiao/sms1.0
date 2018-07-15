package com.briup.app02.bean;

public class Option {
	private long id;
	private String lable;
	private String content;
	private Integer score;
	private long question_id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLable() {
		return lable;
	}
	public void setIable(String lable) {
		this.lable = lable;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public long getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(long question_id) {
		this.question_id = question_id;
	}
}
