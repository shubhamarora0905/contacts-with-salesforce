package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(catalog = "salesforce.contact")
public class Contact {

	private String sfid;
	private String phone;
	@Id
	@Column(name = "external_phone_id__c")
	private Double mobilePhone;
	private String firstname;
	private String lastname;
	private String email;

	public Contact(String sfid, String phone, Double mobilePhone, String firstname, String lastname, String email) {
		super();
		this.sfid = sfid;
		this.phone = phone;
		this.mobilePhone = mobilePhone;
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.email = email;
	}

	public Contact() {

	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Double getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(Double mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSfid() {
		return sfid;
	}

	public void setSfid(String sfid) {
		this.sfid = sfid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
