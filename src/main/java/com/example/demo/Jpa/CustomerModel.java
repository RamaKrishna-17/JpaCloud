package com.example.demo.Jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Customer")
public class CustomerModel {
	
	@Id
	private int cid;
	private String cname;
	private int orderid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public CustomerModel(int cid, String cname, int orderid) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.orderid = orderid;
	}
	public CustomerModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
