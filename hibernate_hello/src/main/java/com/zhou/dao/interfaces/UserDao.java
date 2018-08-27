package com.zhou.dao.interfaces;

import java.util.List;

import com.zhou.dao.entity.User;
import com.zhou.service.Page;

public interface UserDao
{
	public List<User> getUser(Page e);

}
