package com.hibernate.HowToDoInJava.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.HowToDoInJava.model.EmployeeEntity;
import com.hibernate.HowToDoInJava.util.HibernateUtil;

public class RefreshAndMergeMethod {
	/*
	 * refresh() - loads the updated data
	 * merge() - if obj detached stated then also we can perform operation
	 * */

	public static void main(String[] args) {
		EmployeeEntity emp = new EmployeeEntity();
		emp.setFirstName("Lokesh");
		emp.setLastName("Gupta");
		emp.setEmail("abc@gmail.com");
			
		SessionFactory factory = HibernateUtil.getSessionJavaConfigFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(emp);
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println(verifyEmployeeFirstName(1, "Lokesh"));
		
		Session sessionTwo = HibernateUtil.getSessionJavaConfigFactory().openSession();
	      sessionTwo.beginTransaction();
	       
	      //This 
	      emp.setFirstName("Vikas");
	      //emp obj is detached so value will not update in db
	     // sessionTwo.refresh(emp);
	      
	    //Merge the emp object using merge() method ,it update DB
	      EmployeeEntity mergedPersistentEmpEntity = (EmployeeEntity) sessionTwo.merge(emp);
	       
	      sessionTwo.getTransaction().commit();
	      sessionTwo.close();
	       
	      System.out.println(emp.getFirstName().equals("Lokesh"));
	      System.out.println(verifyEmployeeFirstName(1, "Vikas"));

	}

	private static boolean verifyEmployeeFirstName(int employeeId, String firstName) {
		Session session = HibernateUtil.getSessionJavaConfigFactory().openSession();
	      EmployeeEntity employee = (EmployeeEntity) session.load(EmployeeEntity.class, employeeId);
	      //Verify first name
	      boolean result = firstName.equals(employee.getFirstName());
	      session.close();
	      //Return verification result
	      return result;
	}

}
