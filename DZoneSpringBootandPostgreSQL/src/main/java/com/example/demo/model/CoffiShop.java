package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CoffiShop {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String coffiName;
	
	
	public CoffiShop() {
	}

	

	public CoffiShop(String coffiName) {
		this.coffiName = coffiName;
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCoffiName() {
		return coffiName;
	}


	public void setCoffiName(String coffiName) {
		this.coffiName = coffiName;
	}


	@Override
	public String toString() {
		return "CoffiShop [id=" + id + ", coffiName=" + coffiName + "]";
	}
	
}
