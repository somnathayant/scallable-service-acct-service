package com.ms.ACCTSERVICE.controller;

import java.io.Serializable;
import java.util.Date;

public class Data implements Serializable{
	
	/**
	 * long serialVersionUID = -651850053639753605L;
	 */
	private static final long serialVersionUID = -651850053639753605L;
	private String name;
	private Integer id;
	private Date dot;
	
	
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Data(String name, Integer id, Date dot) {
		super();
		this.name = name;
		this.id = id;
		this.dot = dot;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDot() {
		return dot;
	}
	public void setDot(Date dot) {
		this.dot = dot;
	}
	
	
	
	
}
