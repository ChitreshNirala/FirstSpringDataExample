package com.hibernate.HowToDoInJava.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.HowToDoInJava.model.AccountEntity;
import com.hibernate.HowToDoInJava.model.AccountEntityMtM;
import com.hibernate.HowToDoInJava.model.AccountEntityOtO;
import com.hibernate.HowToDoInJava.model.EmployeeEntity;
import com.hibernate.HowToDoInJava.model.EmployeeEntityMtM;
import com.hibernate.HowToDoInJava.model.EmployeeEntityOtO;
import com.hibernate.HowToDoInJava.model.Order;
import com.hibernate.HowToDoInJava.model.OrderDetails;
import com.hibernate.HowToDoInJava.model.Product;

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
		//configuration.addAnnotatedClass(EmployeeEntity.class);
		//configuration.addAnnotatedClass(AccountEntity.class);
		//configuration.addAnnotatedClass(EmployeeEntityOtO.class);
		//configuration.addAnnotatedClass(AccountEntityOtO.class);
		//configuration.addAnnotatedClass(EmployeeEntityMtM.class);
		//configuration.addAnnotatedClass(AccountEntityMtM.class);
		//many to many with extra column
		configuration.addAnnotatedClass(Order.class);
		configuration.addAnnotatedClass(OrderDetails.class);
		configuration.addAnnotatedClass(Product.class);
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		System.out.println("Hibernate serviceRegistry created");
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		return sessionFactory;
	}

}
