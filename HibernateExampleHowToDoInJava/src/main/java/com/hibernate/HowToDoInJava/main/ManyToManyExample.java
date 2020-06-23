package com.hibernate.HowToDoInJava.main;

import org.hibernate.Session;

import com.hibernate.HowToDoInJava.model.AccountEntity;
import com.hibernate.HowToDoInJava.model.AccountEntityMtM;
import com.hibernate.HowToDoInJava.model.EmployeeEntity;
import com.hibernate.HowToDoInJava.model.EmployeeEntityMtM;
import com.hibernate.HowToDoInJava.util.HibernateUtil;

public class ManyToManyExample {

	public static void main(String[] args) {
		setupTestData();
	}

	private static void setupTestData() {

	      Session session = HibernateUtil.getSessionJavaConfigFactory().openSession();
	      session.beginTransaction();
	       
	      //Create Account 1
	      AccountEntityMtM acc1 = new AccountEntityMtM();
	      acc1.setAccountNumber("11111111");
	      
	      AccountEntityMtM acc2 = new AccountEntityMtM();
		  acc2.setAccountNumber("2222222"); 
		  		
		  //Create Employee1
	      EmployeeEntityMtM emp = new EmployeeEntityMtM();
	      emp.setEmail("Alok@gmai.com");
	      emp.setFirstName("Alok");
	      emp.setLastName("Gupta");
	      emp.getAccounts().add(acc1);
	      session.save(emp);
	      
	      acc1.getEmployee().add(emp);
	      
	      session.save(emp);
	      //session.save(acc1);
	      
	    //Create Account 2 
	      
		  
		  
	      EmployeeEntityMtM emp1 = new EmployeeEntityMtM();
	      emp1.setEmail("Lokesh@gmai.com");
	      emp1.setFirstName("Lokesh");
	      emp1.setLastName("Gupta");
	      emp1.getAccounts().add(acc2);
	      acc2.getEmployee().add(emp1);
	      session.save(emp1);
	      
	      //session.save(acc2);
	      
	    //Create Account 3 
		  AccountEntityMtM acc3 = new AccountEntityMtM();
		  acc3.setAccountNumber("33333333"); 
	      
	      EmployeeEntityMtM emp2 = new EmployeeEntityMtM();
	      emp2.setEmail("Raj@gmai.com");
	      emp2.setFirstName("Raj");
	      emp2.setLastName("Gupta");
	      emp2.getAccounts().add(acc3);
	      acc3.getEmployee().add(emp2);
	      session.save(emp2);
	      
	     // session.save(acc3);
	             
	      session.getTransaction().commit();
	      session.close();
	   
		
	}
}
