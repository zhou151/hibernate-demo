package com.zhou.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhou.dao.UserDao;
import com.zhou.service.UserService;
import com.zhou.util.PageUtil;

@Service
public class UserServiceIml implements  UserService
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
