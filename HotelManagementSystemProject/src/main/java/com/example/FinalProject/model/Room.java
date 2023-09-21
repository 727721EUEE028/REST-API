package com.example.FinalProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Room")
public class Room {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int roomid;
private int roomnumber;
private String availability;
private String cleaningstatus;
private String price;
private String bedtype;
public int getRoomnumber() {
	return roomnumber;
}

public String getAvailability() {
	return availability;
}
public void setAvailability(String availability) {
	this.availability = availability;
}
public String getCleaningstatus() {
	return cleaningstatus;
}
public void setCleaningstatus(String cleaningstatus) {
	this.cleaningstatus = cleaningstatus;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getBedtype() {
	return bedtype;
}
public void setBedtype(String bedtype) {
	this.bedtype = bedtype;
}
public int getRoomid() {
	return roomid;
}
public void setRoomid(int roomid) {
	this.roomid = roomid;
}

public void setRoomnumber(int roomnumber) {
	this.roomnumber = roomnumber;
}


}
