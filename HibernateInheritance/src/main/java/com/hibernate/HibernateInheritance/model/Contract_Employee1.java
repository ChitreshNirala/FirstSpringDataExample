package com.hibernate.HibernateInheritance.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({
	@AttributeOverride(name="e_id" ,column=@Column(name="c_id")),
	@AttributeOverride(name="name",column=@Column(name="name"))
})
public class Contract_Employee1  extends Employee1{

	private float pay_per_hour;

	private String contract_duration;

	public float getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	public String getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}
	
	
	
	
}
