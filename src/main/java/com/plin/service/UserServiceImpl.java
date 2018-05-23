package com.plin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plin.dao.UserDao;
import com.plin.domain.User;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserDao userDao;

	@Override
	public void save(User user) {
		userDao.save(user);
		
	}

	@Override
	public User get(Long id) {
		return userDao.get(id);
	}

}
