package com.zhou.dao.interfaces;

import java.util.List;

import com.zhou.dao.entity.User;

public interface UserDao
{
	public List<User> getUser(int offset, int length);

}
