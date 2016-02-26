package com.teramint.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.teramint.entity.Employee;
/**
 * 
 * @author mramos
 *
 */
public class EmployeeDao {
		
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void create(Employee emp){
		
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		if (!currentSession.contains(emp)){
			currentSession.saveOrUpdate(emp);
		}
		
		currentSession.close();
	}
	
	public Employee getEmployee(int id){
		
		Session currentSession = sessionFactory.getCurrentSession();
		Employee emp =  currentSession.get(Employee.class, id);
		return emp;
	}
}
