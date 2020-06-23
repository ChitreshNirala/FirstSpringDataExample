package com.hibernate.HowToDoInJava.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product implements Serializable {

	private static final long serialVersionUID = -5597790765425629562L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int p_id;
	private String name;
	
	@OneToMany(mappedBy="product", cascade=CascadeType.ALL)
	private Set<OrderDetails> details = new HashSet<OrderDetails>();

	

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<OrderDetails> getDetails() {
		return details;
	}

	public void setDetails(Set<OrderDetails> details) {
		this.details = details;
	}
	
	
}
