package com.zhou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhou.dao.entity.User;
import com.zhou.dao.interfaces.UserDao;

@Service
public class UserServiceIml implements UserDao
{
	@Autowired
    private UserDao userDao;

	
	@Override
	public List<User> getUser(int offset, int length)
	{
		return userDao.getUser(offset,length);
	}
	

}
