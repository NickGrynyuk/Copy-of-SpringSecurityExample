package com.javahash.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javahash.entity.User;

@Repository
public class UserDao {
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional(readOnly=true)
	public User loadUsersByUsername(String name) {
		List<User> users = sessionFactory.getCurrentSession().createQuery("from User where name='"+name+"'").list();
		if (users.size()>0)
			return users.get(0);
		else
			return null;
	}
}
