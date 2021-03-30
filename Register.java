package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="register")
public class Register {
@Id
private String email;
private String name;
private String password;
private String mobile;
private String aadhar;
private String address;

public Register()
{
	
}
public Register(String email, String name, String password, String mobile, String aadhar, String address) {
	super();
	this.email = email;
	this.name = name;
	this.password = password;
	this.mobile = mobile;
	this.aadhar = aadhar;
	this.address = address;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getAadhar() {
	return aadhar;
}
public void setAadhar(String aadhar) {
	this.aadhar = aadhar;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Register [email=" + email + ", name=" + name + ", mobile=" + mobile + ", aadhar=" + aadhar + ", address="
			+ address + "]";
}
}
