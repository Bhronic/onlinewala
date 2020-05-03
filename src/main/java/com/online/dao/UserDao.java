package com.online.dao;

import org.springframework.stereotype.Repository;

import com.online.model.UserDtls;

@Repository
public interface UserDao {

	public UserDtls saveUserDetls(UserDtls userDtls);
}
