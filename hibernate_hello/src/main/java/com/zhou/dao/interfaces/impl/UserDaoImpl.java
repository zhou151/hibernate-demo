package com.zhou.dao.interfaces.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zhou.dao.entity.User;
import com.zhou.dao.interfaces.UserDao;
import com.zhou.service.Page;


@Repository
@Transactional
public class UserDaoImpl implements UserDao
{
	@Autowired
    private SessionFactory sessionFactory;
	//获取和当前线程绑定的Seesion
    private Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }
	
    



	@Override
	public List<User> getUser(Page e)
	{
		List<User> userList = new ArrayList<User>();
	    String hsql="from User";
	    Session session = getSession();
	    Query query = session.createQuery(hsql);
	    
	    //分页设置
	    query.setFirstResult(e.getPagesize());
        query.setMaxResults(e.getStartrow());
        
        //
	    userList = query.list();
	    session.close();
	    return userList;
	}

}
