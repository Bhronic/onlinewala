package com.online.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.online.dao.UserDao;
import com.online.model.UserDtls;
import com.online.service.UserService;

@Repository
@Service
@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDtls saveUserDetls(UserDtls userDtls) {
		// TODO Auto-generated method stub
		return userDao.saveUserDetls(userDtls);
	}

}
