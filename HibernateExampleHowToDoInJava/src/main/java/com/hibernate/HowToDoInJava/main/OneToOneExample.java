package com.hibernate.HowToDoInJava.main;

import org.hibernate.Session;

import com.hibernate.HowToDoInJava.model.AccountEntity;
import com.hibernate.HowToDoInJava.model.AccountEntityOtO;
import com.hibernate.HowToDoInJava.model.EmployeeEntity;
import com.hibernate.HowToDoInJava.model.EmployeeEntityOtO;
import com.hibernate.HowToDoInJava.util.HibernateUtil;

public class OneToOneExample {

	public static void main(String[] args) {
		setupTestData();
	}

	private static void setupTestData() {


	      Session session = HibernateUtil.getSessionJavaConfigFactory().openSession();
	      session.beginTransaction();
	       
	      //Create Account 1
	      AccountEntityOtO acc1 = new AccountEntityOtO();
	      acc1.setAccountNumber("11111111");
	      session.save(acc1);
	      
	    //Create Employee1
	      EmployeeEntityOtO emp = new EmployeeEntityOtO();
	      emp.setEmail("Alok@gmai.com");
	      emp.setFirstName("Lokesh");
	      emp.setLastName("Gupta");
	      emp.setAccounts(acc1);
	      
	       
		
		  
		  //Create Account 2 
	      AccountEntityOtO acc2 = new AccountEntityOtO();
		  acc2.setAccountNumber("2222222"); 
		  session.save(acc2);
		  
		
		  //Create Employee2 
		  EmployeeEntityOtO emp1 = new EmployeeEntityOtO();
		  emp1.setEmail("Alok@gmai.com");
		  emp1.setFirstName("Alok");
		  emp1.setLastName("Gupta"); 
		  emp1.setAccounts(acc2); 
		  session.save(emp1);
		 
		  //Create Account 3 
		  AccountEntityOtO acc3 = new AccountEntityOtO();
		  acc3.setAccountNumber("33333333"); 
		  session.save(acc3);
		  
		
		  //Create Employee2 
		  EmployeeEntityOtO emp2 = new EmployeeEntityOtO();
		  emp2.setEmail("Raj@gmai.com"); 
		  emp2.setFirstName("Raj");
		  emp2.setLastName("Gupta"); 
		  emp2.setAccounts(acc2); 
		  session.save(emp2);
		 
		 
		  
	      session.save(emp);
	             
	      session.getTransaction().commit();
	      session.close();
	   
		
			
	}

}
