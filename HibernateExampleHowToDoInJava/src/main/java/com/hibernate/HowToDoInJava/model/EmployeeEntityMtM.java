package com.hibernate.HowToDoInJava.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class EmployeeEntityMtM implements Serializable {

	private static final long serialVersionUID = -7393863740596301142L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;

	private String email;

	private String firstName;

	private String lastName;
	
	@ManyToMany(mappedBy="employee", cascade= CascadeType.ALL)
    private List<AccountEntityMtM> accounts = new ArrayList<AccountEntityMtM>();

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<AccountEntityMtM> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountEntityMtM> accounts) {
		this.accounts = accounts;
	}
	
	

}
