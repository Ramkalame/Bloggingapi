package com.codewithdurgesh.blog.services;

import com.codewithdurgesh.blog.entity.User;
import com.codewithdurgesh.blog.payloads.UserDto;

public interface UserService {
	
	UserDto createuser(User user);
	UserDto updateUser(UserDto user, Integer userId);
}
