package com.teramint.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.teramint.entity.Department;


public class DepartmentDao {
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public void create(Department dept){
		Session currentSession = sessionFactory.getCurrentSession();
		
		if (!currentSession.contains(dept)){
			currentSession.saveOrUpdate(dept);
		}
		
	}
	
	public Department getDepartment(int id){
		
		Session currentSession = sessionFactory.openSession();
		Department dept =  currentSession.get(Department.class, id);
		return dept;
	}

	
}
