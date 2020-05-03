package com.online.daoImpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.online.dao.UserDao;
import com.online.model.UserDtls;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	
	@Override
	public UserDtls saveUserDetls(UserDtls userDtls) {
		Session session = getSession();
		UserDtls user= (UserDtls)session.save(userDtls);
		return user;
	}

}
