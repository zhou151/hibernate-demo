package com.zhou.dao;

import com.zhou.util.PageUtil;

public interface UserDao
{
	
	public PageUtil queryForNewsPage(Integer currentPage,Integer pageSize);

}
