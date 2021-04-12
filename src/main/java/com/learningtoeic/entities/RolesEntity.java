package com.learningtoeic.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class RolesEntity extends AbtractEntity{
	
	@Column(length =  10)
	private String roleCode;
	
	@OneToMany(mappedBy = "role")
	private List<UsersEntity> userList = new ArrayList<>();

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public List<UsersEntity> getUserList() {
		return userList;
	}

	public void setUserList(List<UsersEntity> userList) {
		this.userList = userList;
	}
}
