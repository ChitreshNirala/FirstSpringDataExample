package com.hibernate.HibernateInheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.HibernateInheritance.model.Contract_Employee2;
import com.hibernate.HibernateInheritance.model.Employee2;
import com.hibernate.HibernateInheritance.model.Regular_Employee2;
import com.hibernate.HibernateInheritance.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class TablePerSubClass 
{
    public static void main( String[] args )
    {
    	
           SessionFactory factory = HibernateUtil.getSessionJavaConfigFactory();
        
         Session session=factory.openSession();  
           
          Transaction t=session.beginTransaction();    
             
             Employee2 e1=new Employee2();    
             e1.setName("Gaurav Chawla");    
                 
             Regular_Employee2 e2=new Regular_Employee2();    
             e2.setName("Vivek Kumar");    
             e2.setSalary(50000);    
             e2.setBonus(5);    
                 
             Contract_Employee2 e3=new Contract_Employee2();    
             e3.setName("Arjun Kumar");    
             e3.setPay_per_hour(1000);    
             e3.setContract_duration("15 hours");    
                 
             session.persist(e1);    
             session.persist(e2);    
             session.persist(e3);    
                 
             t.commit();    
             session.close();    
             System.out.println("success");    
    }
}