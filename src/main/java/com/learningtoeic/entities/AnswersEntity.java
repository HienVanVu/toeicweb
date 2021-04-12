package com.learningtoeic.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answers")
public class AnswersEntity extends AbtractEntity{

	@Column(length = 255)
	private String content;
	
	@ManyToOne
    @JoinColumn(name = "question_id")
    private QuestionsEntity question;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public QuestionsEntity getQuestion() {
		return question;
	}

	public void setQuestion(QuestionsEntity question) {
		this.question = question;
	}
}
