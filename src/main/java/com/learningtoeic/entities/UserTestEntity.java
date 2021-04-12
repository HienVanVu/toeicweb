package com.learningtoeic.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_test")
public class UserTestEntity extends AbtractEntity{

	@ManyToOne
    @JoinColumn(name = "user_id")
    private UsersEntity user;
	
	@ManyToOne
    @JoinColumn(name = "test_id")
    private TestsEntity testFromUser;
	
	@Column
	private Integer score;

	public UsersEntity getUser() {
		return user;
	}

	public void setUser(UsersEntity user) {
		this.user = user;
	}

	public TestsEntity getTestFromUser() {
		return testFromUser;
	}

	public void setTestFromUser(TestsEntity testFromUser) {
		this.testFromUser = testFromUser;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
}
