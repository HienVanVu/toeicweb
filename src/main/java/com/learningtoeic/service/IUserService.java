package com.learningtoeic.service;

import com.learningtoeic.dto.LoginDto;
import com.learningtoeic.models.UsersModel;

public interface IUserService {
	public UsersModel findByUserNamePassword(LoginDto loginDto);
	public UsersModel findAll();
}
