package com.learningtoeic.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learningtoeic.dto.LoginDto;
import com.learningtoeic.mapper.UserMapper;
import com.learningtoeic.models.UsersModel;
import com.learningtoeic.service.Impl.UserService;

@CrossOrigin
@RestController
public class UserAPI {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/login")
	public UsersModel login(@RequestBody LoginDto loginDto) {
		UsersModel usersModel = userService.findByUserNamePassword(loginDto);
		System.out.println(usersModel.getUserName());
		return usersModel;
	}
}
