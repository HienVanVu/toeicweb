package com.learningtoeic.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class QuestionsEntity extends AbtractEntity{

	@Column(length = 255)
	private String questionContent;
	
	@Column(length = 1)
	private String answer;
	
	@Column(length = 65535)
	private String explaination;
	
	@ManyToOne
    @JoinColumn(name = "test_id")
    private TestsEntity testFromQues;
	
	@ManyToOne
    @JoinColumn(name = "paragraph_id")
    private ParagraphsEntity paragraph;
	
	@OneToMany(mappedBy = "question")
	private List<AnswersEntity> answerList = new ArrayList<>();

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getExplaination() {
		return explaination;
	}

	public void setExplaination(String explaination) {
		this.explaination = explaination;
	}

	public TestsEntity getTestFromQues() {
		return testFromQues;
	}

	public void setTestFromQues(TestsEntity testFromQues) {
		this.testFromQues = testFromQues;
	}

	public ParagraphsEntity getParagraph() {
		return paragraph;
	}

	public void setParagraph(ParagraphsEntity paragraph) {
		this.paragraph = paragraph;
	}

	public List<AnswersEntity> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(List<AnswersEntity> answerList) {
		this.answerList = answerList;
	}
}
