package com.hibernate.HowToDoInJava.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.hibernate.HowToDoInJava.model.Order;
import com.hibernate.HowToDoInJava.model.OrderDetails;
import com.hibernate.HowToDoInJava.model.Product;
import com.hibernate.HowToDoInJava.util.HibernateUtil;

public class MamyToManyWithExtraColumn {

	public static void main(String[] args) {
		
	
		
		Session session = HibernateUtil.getSessionJavaConfigFactory().openSession();
		session.beginTransaction();
		Product pro = new Product();
		pro.setName("Mobile");
		
		 Order ord = new Order();
		 ord.setCustomer("NOKIA");
		 ord.setTotal(500);
		
		 OrderDetails od = new OrderDetails();
		 od.setOrder(ord);
		 od.setProduct(pro);
		 od.setQuantity(300);
		 
		 Set<OrderDetails> od1 = new HashSet<OrderDetails>();
		 od1.add(od);
		 
		 ord.setOrderDetails(od1);
		 pro.setDetails(od1);
		
		session.save(ord);
		session.save(pro);
		 session.save(od);
		session.getTransaction().commit();
		session.close();
	}

}
