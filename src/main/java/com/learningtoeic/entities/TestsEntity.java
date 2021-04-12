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
@Table(name = "tests")
public class TestsEntity extends AbtractEntity{
	
	@Column(length =  50)
	private String testName;
	
	@Column(length = 15)
	private String testCode;
	
	@ManyToOne
    @JoinColumn(name = "category_id")
    private CategoriesEntity category;
	
	@OneToMany(mappedBy = "test")
	private List<ParagraphsEntity> paragraphs = new ArrayList<>();
	
	@OneToMany(mappedBy = "testFromQues")
	private List<QuestionsEntity> questionList = new ArrayList<>();
	
	@OneToMany(mappedBy = "testFromUser")
	private List<UserTestEntity> userList = new ArrayList<>();

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getTestCode() {
		return testCode;
	}

	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}

	public CategoriesEntity getCategory() {
		return category;
	}

	public void setCategory(CategoriesEntity category) {
		this.category = category;
	}

	public List<ParagraphsEntity> getParagraphs() {
		return paragraphs;
	}

	public void setParagraphs(List<ParagraphsEntity> paragraphs) {
		this.paragraphs = paragraphs;
	}

	public List<QuestionsEntity> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<QuestionsEntity> questionList) {
		this.questionList = questionList;
	}

	public List<UserTestEntity> getUserList() {
		return userList;
	}

	public void setUserList(List<UserTestEntity> userList) {
		this.userList = userList;
	}
}
