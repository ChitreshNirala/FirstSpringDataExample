package com.hibernate.HibernateInheritance.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.HibernateInheritance.model.Contract_Employee2;
import com.hibernate.HibernateInheritance.model.Employee2;
import com.hibernate.HibernateInheritance.model.Regular_Employee2;

public class HibernateUtil {

	
	
	private static SessionFactory sessionJavaConfigFactory;
	
	public static SessionFactory getSessionJavaConfigFactory() {
		if(sessionJavaConfigFactory == null) {
			sessionJavaConfigFactory = buildJavaBasedSessionFactory();
		}
		return sessionJavaConfigFactory;
	}

	private static SessionFactory buildJavaBasedSessionFactory() {
		Configuration configuration=new Configuration();
		Properties prop= new Properties();
		prop.put("hibernate.connection.driver_class", "org.postgresql.Driver");
		prop.put("hibernate.connection.url", "jdbc:postgresql://localhost:5433/postgres");
		prop.put("hibernate.connection.username", "postgres");
		prop.put("hibernate.connection.password", "root");
		//prop.put("hibernate.current_session_context_class", "thread");
		
		
		prop.put("hibernate.show_sql", "true");
		prop.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		//prop.put("hibernate.hbm2ddl.auto", "create-drop");
		prop.put("hibernate.hbm2ddl.auto", "create");
		configuration.setProperties(prop);
		
		//Table Per Hierachy
		//configuration.addAnnotatedClass(Employee.class);
		//configuration.addAnnotatedClass(Regular_Employee.class);
		//configuration.addAnnotatedClass(Contract_Employee.class);
		//Table Per Class
		//configuration.addAnnotatedClass(Employee1.class);
		//configuration.addAnnotatedClass(Regular_Employee1.class);
		//configuration.addAnnotatedClass(Contract_Employee1.class);
		//Table Per Class
		configuration.addAnnotatedClass(Employee2.class);
		configuration.addAnnotatedClass(Regular_Employee2.class);
		configuration.addAnnotatedClass(Contract_Employee2.class);
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		System.out.println("Hibernate serviceRegistry created");
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		return sessionFactory;
	}


}
