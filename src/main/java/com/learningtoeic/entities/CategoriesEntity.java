package com.learningtoeic.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class CategoriesEntity extends AbtractEntity{
	
	@Column(length = 20)
	private String categoryCode;
	
	@Column(length =  50)
	private String categoryName;
	
	@OneToMany(mappedBy = "category")
	private List<TestsEntity> testList = new ArrayList<>();

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<TestsEntity> getTestList() {
		return testList;
	}

	public void setTestList(List<TestsEntity> testList) {
		this.testList = testList;
	}
}
