package com.example.Project.model;

import java.sql.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {
	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int bid;
	 private String hotelname;
     private Date startDate;
     private Date endDate;
    
		
		public Date getStartDate() {
			return startDate;
		}
		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
		public Date getEndDate() {
			return endDate;
		}
		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		public String getHotelname() {
			return hotelname;
		}
		public void setHotelname(String hotelname) {
			this.hotelname = hotelname;
		}
		
		
}
