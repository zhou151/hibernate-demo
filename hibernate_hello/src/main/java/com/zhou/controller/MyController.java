package com.zhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController
{
	
	@RequestMapping(value="/p")
	@ResponseBody
	public String mvc001()
	{
		return "你好";
	}
}
