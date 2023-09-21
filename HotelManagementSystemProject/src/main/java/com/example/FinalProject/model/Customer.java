package com.example.FinalProject.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int custid;
private String phone;
private String name;
private String gender;
private String city;
private int allocatedroomnumber;
private Date checkin;
private int deposit;
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getAllocatedroomnumber() {
	return allocatedroomnumber;
}
public void setAllocatedroomnumber(int allocatedroomnumber) {
	this.allocatedroomnumber = allocatedroomnumber;
}
public Date getCheckin() {
	return checkin;
}
public void setCheckin(Date checkin) {
	this.checkin = checkin;
}
public int getDeposit() {
	return deposit;
}
public void setDeposit(int deposit) {
	this.deposit = deposit;
}


}
