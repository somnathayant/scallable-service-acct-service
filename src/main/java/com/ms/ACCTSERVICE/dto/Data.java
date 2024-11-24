package com.ms.ACCTSERVICE.dto;

import java.io.Serializable;
import java.util.Date;



public class Data implements Serializable{
	
	/**
	 * long serialVersionUID = -651850053639753605L;
	 */
	private static final long serialVersionUID = -651850053639753605L;
	private Integer empid;
	private String name;
	private Integer acctId;
	private String ctc;
	private String salary;
	private Date date;
	private Integer addressId;
	private String state;
	private String city;
	private Integer projectId;
	private String PName;
	private String PDuration;
	private Date PTo;
	private Date PFrom;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAcctId() {
		return acctId;
	}
	public void setAcctId(Integer acctId) {
		this.acctId = acctId;
	}
	public String getCtc() {
		return ctc;
	}
	public void setCtc(String ctc) {
		this.ctc = ctc;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public String getPDuration() {
		return PDuration;
	}
	public void setPDuration(String pDuration) {
		PDuration = pDuration;
	}
	public Date getPTo() {
		return PTo;
	}
	public void setPTo(Date pTo) {
		PTo = pTo;
	}
	public Date getPFrom() {
		return PFrom;
	}
	public void setPFrom(Date pFrom) {
		PFrom = pFrom;
	}
	@Override
	public String toString() {
		return "Data [empid=" + empid + ", name=" + name + ", acctId=" + acctId + ", ctc=" + ctc + ", salary=" + salary
				+ ", date=" + date + ", addressId=" + addressId + ", state=" + state + ", city=" + city + ", projectId="
				+ projectId + ", PName=" + PName + ", PDuration=" + PDuration + ", PTo=" + PTo + ", PFrom=" + PFrom
				+ "]";
	}
	public Data(Integer empid, String name, Integer acctId, String ctc, String salary, Date date, Integer addressId,
			String state, String city, Integer projectId, String pName, String pDuration, Date pTo, Date pFrom) {
		super();
		this.empid = empid;
		this.name = name;
		this.acctId = acctId;
		this.ctc = ctc;
		this.salary = salary;
		this.date = date;
		this.addressId = addressId;
		this.state = state;
		this.city = city;
		this.projectId = projectId;
		PName = pName;
		PDuration = pDuration;
		PTo = pTo;
		PFrom = pFrom;
	}
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	
	
	
}
