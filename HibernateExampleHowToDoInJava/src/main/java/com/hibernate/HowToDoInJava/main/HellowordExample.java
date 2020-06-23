package com.hibernate.HowToDoInJava.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.HowToDoInJava.model.EmployeeEntity;
import com.hibernate.HowToDoInJava.util.HibernateUtil;

public class HellowordExample {

	public static void main(String[] args) {
		
		EmployeeEntity emp = new EmployeeEntity();
		emp.setFirstName("Abc");
		emp.setLastName("def");
		emp.setEmail("abc@gmail.com");
			
		SessionFactory factory = HibernateUtil.getSessionJavaConfigFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(emp);
		
		session.getTransaction().commit();
		//session.close();
		//factory.close();
		

	}

}
