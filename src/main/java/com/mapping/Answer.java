package com.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	
	@Id
	@Column(name="answer_id")
	private int answerId;
	
	private String answer;
	
	
	public Answer(int answer_id, String answer) {
		super();
		this.answerId = answer_id;
		this.answer = answer;
	}


	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAnswer_id() {
		return answerId;
	}


	public void setAnswer_id(int answer_id) {
		this.answerId = answer_id;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	 
	
	
	
	

}
