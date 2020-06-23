package com.hibernate.HowToDoInJava.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AccountEntity  implements Serializable{

	private static final long serialVersionUID = 1378378798910825039L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer           accountId;

	private String            accountNumber;
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private EmployeeEntity employee;

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}
 
	
    
	
    

}
