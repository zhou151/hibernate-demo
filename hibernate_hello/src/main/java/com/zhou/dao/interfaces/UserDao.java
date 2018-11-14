package com.zhou.dao.interfaces;

import java.util.List;

import com.zhou.dao.entity.User;
import com.zhou.service.PageUtil;
import com.zhou.service.inter.NewsPageInter;

public interface UserDao
{
	
	public PageUtil queryForNewsPage(Integer currentPage,Integer pageSize);

}
