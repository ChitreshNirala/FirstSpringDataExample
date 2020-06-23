package com.hibernate.HowToDoInJava.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountEntityOtO  implements Serializable{

	private static final long serialVersionUID = 1378378798910825039L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer           accountId;

	private String            accountNumber;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "AccountEntityOtO [accountId=" + accountId + ", accountNumber=" + accountNumber + "]";
	}
	
	
}
