package com.teramint.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 * @author mramos
 *
 */
@Entity(name="Employee")
public class Employee {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String ssn;
	private String taxid;
	private String driverLicenseId;
	private String address;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Department dept;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getTaxid() {
		return taxid;
	}
	public void setTaxid(String taxid) {
		this.taxid = taxid;
	}
	public String getDriverLicenseId() {
		return driverLicenseId;
	}
	public void setDriverLicenseId(String driverLicenseId) {
		this.driverLicenseId = driverLicenseId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	
}
