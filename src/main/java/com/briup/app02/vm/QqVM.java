package com.briup.app02.vm;

import com.briup.app02.bean.Question;
//import com.briup.app02.bean.Questionnaire;

public class QqVM {
	private long id;
	private long questionnaire;
	//private Questionnaire questionnaire;
	private Question question;
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public long getQuestionnaire() {
		return questionnaire;
	}
	public void setQuestionnaire(long questionnaire) {
		this.questionnaire = questionnaire;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}	
//	public Questionnaire getQuestionnaire() {
//		return questionnaire;
//	}
//	public void setQuestionnaire(Questionnaire questionnaire) {
//		this.questionnaire = questionnaire;
//	}
}
