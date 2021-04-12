package com.learningtoeic.mapper;

import org.springframework.stereotype.Component;

import com.learningtoeic.entities.UsersEntity;
import com.learningtoeic.models.UsersModel;

@Component
public class UserMapper {
	public UsersModel toModel(UsersEntity usersEntity) {
		UsersModel usersModel = new UsersModel();
		usersModel.setUserName(usersEntity.getUserName());
		return usersModel;
	}
}
