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
public class Order implements Serializable {

	private static final long serialVersionUID = -7017074956145273593L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int o_id;
	private String customer;
	private float total;
	
	@OneToMany(mappedBy= "order", cascade= CascadeType.ALL)
	private Set<OrderDetails> orderDetails = new HashSet<OrderDetails>();

	public int getO_id() {
		return o_id;
	}

	public void setO_id(int o_id) {
		this.o_id = o_id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Set<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	

}
