package com.learningtoeic.models;

import java.util.ArrayList;
import java.util.List;

public class UsersModel extends BaseModel{
	private String userName;
	private String password;
	private String address;
	private String phoneNum;
    private RolesModel role;
	private List<TestsModel> testList = new ArrayList<>();
	
	public UsersModel() {
		super();
	}
	
	public UsersModel(String userName, String password, String address, String phoneNum, RolesModel role,
			List<TestsModel> testList) {
		super();
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.phoneNum = phoneNum;
		this.role = role;
		this.testList = testList;
	}
	
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
	public RolesModel getRole() {
		return role;
	}
	public void setRole(RolesModel role) {
		this.role = role;
	}
	public List<TestsModel> getTestList() {
		return testList;
	}
	public void setTestList(List<TestsModel> testList) {
		this.testList = testList;
	}
}
