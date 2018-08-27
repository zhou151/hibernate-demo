package com.zhou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhou.dao.entity.User;
import com.zhou.service.NewsPage;
import com.zhou.service.UserServiceIml;

@Controller
public class UserController
{
	@Autowired UserServiceIml userServiceIml;
	
	
	@ResponseBody
	@RequestMapping(value="/index")
	public  List<User> mvc10(@RequestParam("page") String page)
	{
		NewsPage<User> page01 = userServiceIml.queryForNewsPage(Integer.valueOf(page), 5);
		return page01.getList();
	}
}
