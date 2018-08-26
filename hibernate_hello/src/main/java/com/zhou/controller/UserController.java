package com.zhou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhou.dao.entity.User;
import com.zhou.service.UserServiceIml;

@Controller
public class UserController
{
	@Autowired UserServiceIml userServiceIml;
	
	
	@ResponseBody
	@RequestMapping(value="/index")
	public  List<User> mvc10()
	{
		return userServiceIml.getUser();
	}
}
