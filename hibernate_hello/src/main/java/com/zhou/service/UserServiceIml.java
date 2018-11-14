package com.zhou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhou.dao.UserDao;
import com.zhou.service.inter.NewsPageInter;
import com.zhou.service.inter.UserServiceInter;

@Service
public class UserServiceIml implements  UserServiceInter
{
	@Autowired
    private UserDao userDao;




	/* (non-Javadoc)
	 * @see com.zhou.service.UserServiceInter#queryForNewsPage(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public PageUtil queryForNewsPage(Integer currentPage, Integer pageSize)
	{
		return userDao.queryForNewsPage(currentPage, pageSize);
	}
}
