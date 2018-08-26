package com.zhou.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhou.dao.entity.User;

public class Test1
{
	private ApplicationContext context=null;
    private User user=null;
    
    {
         context= new ClassPathXmlApplicationContext("applicationContext.xml");  
         user=context.getBean(User.class);
    }
	
	@Test
	public void test1()
	{
		
	}
}
