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
	/**
	 * 
	 * @fun-name mvc10
	 * @return-type List<User>
	 * @author Mr_zhou
	 * @date 2018年8月27日 下午7:52:11
	 * @param page 多少页,不传为第一页
	 * @return  
	 * TODO queryForNewsPage参数2为每页显示多少数据
	 */
	public  NewsPage<User> mvc10(@RequestParam("page") String page)
	{
		NewsPage<User> page01 = null;
		int pageSize=3;
		if(page==null||page.equals(""))
		{
			page01 =userServiceIml.queryForNewsPage(1, pageSize);
		}
		else {
			page01 = userServiceIml.queryForNewsPage(Integer.valueOf(page), pageSize);
		}
		
		return page01;
	}
}
