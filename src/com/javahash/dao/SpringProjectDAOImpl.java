package com.javahash.dao;

import java.util.List;







import com.javahash.entity.Golden;
import com.javahash.entity.Client;
import com.javahash.entity.Silver;

import com.javahash.entity.Bronzes;
import com.javahash.entity.User;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SpringProjectDAOImpl implements SpringProjectDAO{
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional(readOnly=true)
	public List<Bronzes> readBronzes() {
		return sessionFactory.getCurrentSession().createQuery("from Bronzes").list();
	}
	
	@Transactional
	public void addInformation(Bronzes bronzes){
		sessionFactory.getCurrentSession().save(bronzes);
	}
	
	@Transactional(readOnly=true)
	public List<Silver> readSilver() {
		return sessionFactory.getCurrentSession().createQuery("from Silver").list();
	}
	
	
	@Transactional(readOnly=true)
	public List<Golden> readGolden() {
		return sessionFactory.getCurrentSession().createQuery("from Golden").list();
	}
	
	@Transactional
	public void addInformation(Golden golden){
		sessionFactory.getCurrentSession().save(golden);
		
	}



	@Transactional(readOnly=true)
	public List<User> readUser() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}
	
	@Transactional
	public void addInformation(User user){
		sessionFactory.getCurrentSession().save(user);
	}
	@Transactional(readOnly=true)
	public List<Client> readClient() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}
	
	@Transactional
	public void addInformation(Client client){
		sessionFactory.getCurrentSession().save(client);
	}

	@Override
	public void addInformation(Silver silver) {
		sessionFactory.getCurrentSession().save(silver);
		
	}

	



	

}
