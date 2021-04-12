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
@Table(name = "paragraphs")
public class ParagraphsEntity extends AbtractEntity{

	@Column(length =  1500)
	private String content;
	
	@ManyToOne
    @JoinColumn(name = "test_id")
    private TestsEntity test;
	
	@OneToMany(mappedBy = "paragraph")
	private List<QuestionsEntity> questionList = new ArrayList<>();

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public TestsEntity getTest() {
		return test;
	}

	public void setTest(TestsEntity test) {
		this.test = test;
	}

	public List<QuestionsEntity> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<QuestionsEntity> questionList) {
		this.questionList = questionList;
	}
}
