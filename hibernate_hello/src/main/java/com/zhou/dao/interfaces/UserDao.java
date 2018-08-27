package com.zhou.dao.interfaces;

import java.util.List;

import com.zhou.dao.entity.User;
import com.zhou.service.NewsPage;

public interface UserDao
{
	
	public NewsPage queryForNewsPage(Integer currentPage,Integer pageSize);

}
