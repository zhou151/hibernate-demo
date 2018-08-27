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
import com.zhou.service.NewsPage;


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

	
	
    public List<User> queryForPage(Integer offset, Integer length) {
        Session session =getSession();
        Query query = session.createQuery("from User");
        query.setFirstResult(offset);
        query.setMaxResults(length);
        return query.list();
    }
 
    //查询记录总数
    public int getAllRowCount(){
        Session session = getSession();
        int count=((Long) session.createQuery( "select count(*) from User").iterate().next()).intValue();
        return count;
    }
    @Override
    public NewsPage queryForNewsPage(Integer currentPage,Integer pageSize) {
        NewsPage<User> page = new NewsPage<User>();
        //总记录数
        int allRow = getAllRowCount();
        //当前页开始记录
        int offset = page.countOffset(currentPage,pageSize);
        //分页查询结果集
        List<User> list = queryForPage(offset, pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setTotalRecords(allRow);
        page.setList(list);
        return page;
    }




}
