package com.hibernate.HowToDoInJava.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class AccountEntityMtM  implements Serializable{

	private static final long serialVersionUID = 1378378798910825039L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer           accountId;

	private String            accountNumber;
 
	@ManyToMany
	@JoinTable(	name= "emp_acc", 
	joinColumns= {@JoinColumn(name="acc_id")},
	inverseJoinColumns={@JoinColumn(name="e_id")}
	)
    private List<EmployeeEntityMtM> employee = new  ArrayList<EmployeeEntityMtM>();

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

	public List<EmployeeEntityMtM> getEmployee() {
		return employee;
	}

	public void setEmployee(List<EmployeeEntityMtM> employee) {
		this.employee = employee;
	}

	  
    

}
