package com.teramint.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.teramint.cayenne.entity.LevelInfo;
import com.teramint.entity.Department;
import com.teramint.service.DepartmentDao;
import com.teramint.service.EmployeeDao;

public class DriverMain {
	
	public static void main(String[] args){
		
		DriverMain main = new DriverMain();
		main.doWork();
	}	
	
	public void doWork(){
		
//		URL url = Thread.currentThread().getContextClassLoader().getResource("hibernatecayenne.properties");
//		Properties prop = new Properties();
//		try {
//			prop.load(url.openStream());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.setProperties(prop);

		System.setProperty("cayenne.jdbc.driver", "com.mysql.jdbc.Driver");
		System.setProperty("cayenne.jdbc.url", "jdbc:mysql://localhost:3306/hibernateCayenne");
		System.setProperty("cayenne.jdbc.username", "root");
		System.setProperty("cayenne.jdbc.password", "password");
		System.setProperty("cayenne.jdbc.min_connections", "1");
		System.setProperty("cayenne.jdbc.min_connections", "10");
		
		@SuppressWarnings("resource")
		ApplicationContext cntx = 
				new ClassPathXmlApplicationContext("classpath*:root-context/application-context.xml");
		
		EmployeeDao empDao =  cntx.getBean(EmployeeDao.class);
		DepartmentDao depDao =  cntx.getBean(DepartmentDao.class);

		Department dep = depDao.getDepartment(1);
		
		LevelInfo info = dep.levelInfo(1);
		
		System.out.println("INfo=" + info.getLevelName());
		
	}
}
