package com.hibernate.HowToDoInJava.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5958711387278065196L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int o_d_id;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;
	
	private int quantity;
	public int getO_d_id() {
		return o_d_id;
	}
	public void setO_d_id(int o_d_id) {
		this.o_d_id = o_d_id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
