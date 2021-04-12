package com.learningtoeic.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningtoeic.dto.LoginDto;
import com.learningtoeic.entities.UsersEntity;
import com.learningtoeic.mapper.UserMapper;
import com.learningtoeic.models.UsersModel;
import com.learningtoeic.repository.UsersRepository;
import com.learningtoeic.service.IUserService;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public UsersModel findByUserNamePassword(LoginDto loginDto) {
		UsersEntity usersEntity = usersRepository.findByUserNamePassword(loginDto.getUserName(), loginDto.getPassword());
		UsersModel usersModel = userMapper.toModel(usersEntity);
		return usersModel;
	}

	@Override
	public UsersModel findAll() {
		List<UsersEntity> userList = usersRepository.findAll();
		UsersModel usersModel = userMapper.toModel(userList.get(0));
		return usersModel;
	}
	
	
}
