package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	
	
	
	@Id
	int custId;
	String name;
	String address;
	String mobile;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", address=" + address + ", mobile=" + mobile + "]";
	}
	
	
	
	
	
}
