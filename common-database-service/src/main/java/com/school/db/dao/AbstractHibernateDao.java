package com.school.db.dao;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import javax.annotation.Resource;

/**
 * Created by Ivan.Luo
 * Date: 4/11/2017 11:06 AM
 */
public abstract class AbstractHibernateDao<T>
{
	@Resource
	private SessionFactory sessionFactory;

	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}

}
