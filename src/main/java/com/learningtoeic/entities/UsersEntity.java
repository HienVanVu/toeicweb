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
@Table(name = "users")
public class UsersEntity extends AbtractEntity{
	
	@Column(length = 15)
	private String userName;
	
	@Column(length =  255)
	private String password;
	
	@Column(length = 100)
	private String address;
	
	@Column(length = 15)
	private String phoneNum;
	
	@ManyToOne
    @JoinColumn(name = "role_id")
    private RolesEntity role;
	
	@OneToMany(mappedBy = "user")
	private List<UserTestEntity> testList = new ArrayList<>();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public RolesEntity getRole() {
		return role;
	}

	public void setRole(RolesEntity role) {
		this.role = role;
	}

	public List<UserTestEntity> getTestList() {
		return testList;
	}

	public void setTestList(List<UserTestEntity> testList) {
		this.testList = testList;
	}
}
