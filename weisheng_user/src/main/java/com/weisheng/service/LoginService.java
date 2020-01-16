package com.weisheng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weisheng.dao.LoginDao;
import com.weisheng.entity.LoginEntity;
import com.weisheng.entity.User;

@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;
	
	public User login(LoginEntity entity) {
		User user = loginDao.getUser(entity.getLoginname());
		if((user == null) || (!(user.getPassword().equals(entity.getPassword())))) {
			return null;
		}
		return user;
	}

}
