package com.online.service;

import org.springframework.stereotype.Repository;

import com.online.model.UserDtls;

@Repository
public interface UserService {
	
	public UserDtls saveUserDetls(UserDtls userDtls);
}
