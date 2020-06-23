package com.hibernate.HibernateInheritance.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({
	@AttributeOverride(name="e_id" ,column=@Column(name="r_id")),
	@AttributeOverride(name="name",column=@Column(name="name"))
})
public class Regular_Employee1 extends Employee1 {

	private float salary;  
	  
	private int bonus;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}  
		
}
