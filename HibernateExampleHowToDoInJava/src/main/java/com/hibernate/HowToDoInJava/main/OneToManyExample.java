package com.hibernate.HowToDoInJava.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.hibernate.HowToDoInJava.model.AccountEntity;
import com.hibernate.HowToDoInJava.model.EmployeeEntity;
import com.hibernate.HowToDoInJava.util.HibernateUtil;

public class OneToManyExample {

	public static void main(String[] args) {
		setupTestData();
	}

	private static void setupTestData() {

	      Session session = HibernateUtil.getSessionJavaConfigFactory().openSession();
	      session.beginTransaction();
	       
	    //Create Employee1
	      EmployeeEntity emp = new EmployeeEntity();
	      emp.setEmail("Alok@gmai.com");
	      emp.setFirstName("Lokesh");
	      emp.setLastName("Gupta");
	      
	      //Create Account 1
	      AccountEntity acc1 = new AccountEntity();
	      acc1.setAccountNumber("11111111");
	     // session.save(acc1);
		  
		  //Create Account 2 
	      AccountEntity acc2 = new AccountEntity();
		  acc2.setAccountNumber("2222222"); 
		 // session.save(acc2);
		
		  //Create Account 3 
		  AccountEntity acc3 = new AccountEntity();
		  acc3.setAccountNumber("33333333"); 
		  //session.save(acc3);

		  Set<AccountEntity> accounts = new HashSet<AccountEntity>();
	        accounts.add(acc1);
	        accounts.add(acc2);
	        accounts.add(acc3);
	      emp.setAccounts(accounts);
	      acc1.setEmployee(emp);
	      acc2.setEmployee(emp);
	      acc3.setEmployee(emp);
	      session.save(emp);
	      
	             
	      session.getTransaction().commit();
	      session.close();
	   
		
	}
}
